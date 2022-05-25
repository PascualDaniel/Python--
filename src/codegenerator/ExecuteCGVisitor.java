package codegenerator;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;
import ast.Types.FunctionType;
import ast.Types.VoidType;

import javax.swing.plaf.nimbus.State;

public class ExecuteCGVisitor  extends AbstractErrorVisitor<FunctionDefinition, Void>{


    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    private CodeGenerator codeGenerator;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
        valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor = new AddressCGVisitor(codeGenerator);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
    }

    /**
     * Execute[[Program: Program -> definition*]]()=
     * foreach definition in definitions:
     *      <enter> definition.offset
     *
     */
    @Override
    public Void visit(Program node, FunctionDefinition p) {
        for (Definition def:node.getDefinitions()) {
            if(def instanceof VarDefinition)
                def.accept(this, p);
            //codeGenerator.enter(def.getOffset());
        }
        codeGenerator.main();
        codeGenerator.halt();
        for (Definition def:node.getDefinitions()) {
            if(def instanceof FunctionDefinition)
                def.accept(this, p);
            //codeGenerator.enter(def.getOffset());
        }
        //codeGenerator.halt();
        return null;
    }

    /**
     * Execute[[VarDefinition:Definition -> type ID]]()
     *
     */
    @Override
    public Void visit(VarDefinition node, FunctionDefinition p) {
        codeGenerator.varDefComment(node);
        System.out.println(node.getName()+" "+node.getOffset());
        return null;
    }


    /**
     * execute[[FuncDefinition: statement ->ID functType:type definitions* statements*]]() =
     *          ID <:>
     *          for (Def def: type.getDefinitions())
     *             execute[[def]]()
     *             <enter> type.getMemoryBytes()
     *          for (Def d: definitions)
     *              execute[[def]]()
     *          for(Statement state: statements)
     *             execute[[state]]
     *          if (funcDefinition.getType() == VoidType)
     *              <ret> (0, functionType.getBytesLocal(), functionType.getBytesParam())
     */
    @Override
    public Void visit(FunctionDefinition node, FunctionDefinition p) {

        codeGenerator.funcDef(node.getName());
        FunctionType type = (FunctionType) node.getType();
        codeGenerator.comment("Parameters");
        for (VarDefinition def:type.getDefinitions()) {
            def.accept(this,p);
        }
        codeGenerator.comment("Local Variables");

        for (Definition def:node.getDefinitions()) {
            def.accept(this,node);
        }
        codeGenerator.enter(node.getLocalVarBytes());
        for (Statement st:node.getStatements()) {
            codeGenerator.commentInfo(""+ st.getLine());
            st.accept(this,node);

        }

        if (type.getType() instanceof VoidType)
            codeGenerator.ret(
                    0,
                    node.getLocalVarBytes()
                    ,type.getParamBytes()
            );



        return null;
    }


    /**
     * Value[[Variable: expression -> ID]]()=
     * 	if(expr.def.scope==0)
     * 		<pushA> expr.def.offset
     * 	else
     * 		<pushA bp>
     * 		<pushi> exp.def.offset
     * 		<addi>
     *
     *
     */
    @Override
    public Void visit(Variable node, FunctionDefinition p) {
        if(node.getDefinition().getScope()==0){
            codeGenerator.pushA(node.getDefinition().getOffset());
        }else{
            codeGenerator.pushBP();
            codeGenerator.pushI(node.getDefinition().getOffset());
            codeGenerator.addI();
        }
        return null;
    }

    /**
     * Execute[[Assigment: statement -> expression1 expression2]]()
     *  dirección⟦left⟧
     *  valor⟦right⟧
     *  STORE
     *
     */
    public Void visit(Assigment node, FunctionDefinition p){
        codeGenerator.comment("Assigment");
        node.getLeft().accept(addressCGVisitor,null);
        node.getRight().accept(valueCGVisitor,null);
        codeGenerator.store(node.getLeft().getType().suffix());
        return null;
    }

    /**
     * Execute[[Print: statement -> expression]]()=
     * 	VALUE[[expression]]
     *
     * 	<OUT> expression.type.suffix()
     *
     * ExcuteCGVIsitor
     * 	Visitor(Print p,...){
     * 		p.expression.accept(this.ValueCGVsitor,param);
     * 		cg.out(p.expression.type);
     *      }
     */
    @Override
    public Void visit(Print node, FunctionDefinition p) {
        codeGenerator.comment("Print");
        for (Expression expression:node.getExpressionList()) {
            expression.accept(valueCGVisitor, null);
            codeGenerator.out(expression.getType().suffix());
        }
        return null;
    }

    /**
     * Execute[[Input: statement -> expression*]]()=
     * 	for(Expression e in Expression*)
     * 		ADRRESS[[e]]
     * 		<in> e.type.suffix()
     * 		<STORE> e.type.suffix()
     *
     * ExcuteCGVIsitor
     * 	Visitor(Input p,...){
     * 		for(Expression e : p.expressions())
     * 			e.accept(this.AdressCGVsitor,param);
     * 			cg.in(e.type);
     * 			cg.store(e.type);
     *        }
     */
    @Override
    public Void visit(Input node, FunctionDefinition p) {
        codeGenerator.comment("input");
        for (Expression expression:node.getExpressionList()) {
            expression.accept(addressCGVisitor, null);
            codeGenerator.in(expression.getType().suffix());
            codeGenerator.store(expression.getType().suffix());
        }
        return null;
    }

    /**
     * Execute[[While: Statement -> expression, Statement*]():
     *      INT condition = cg.getLabel();
     *      Int END = cg.getLabel();
     *
     *      <Label_>Condition <:>
     *      Value[[Expression]]()
     *      <jz Label_> END
     *      foreach statement in statement*:
     *          execute[[statement]]()
     *
     *      <jmp Label_> condition
     *      <Label_>END <:>
     */
    @Override
    public Void visit(While node, FunctionDefinition p)
    {
        codeGenerator.comment("While");
        int condition= codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        codeGenerator.label(condition);
        node.getExpression().accept(valueCGVisitor,null);
        codeGenerator.jz(end);
        for (Statement statement: node.getStatementList()) {
            statement.accept(this,p);
        }
        codeGenerator.jmp(condition);
        codeGenerator.label(end);
        return null;
    }
    /**
     * Execute[[IF: Statement -> expression, Statement+, Statement*]():
     *      INT ELSE = cg.getLabel();
     *      Int END = cg.getLabel();
     *
     *      Value[[Expression]]()
     *      <jz Label_> ELSE
     *      foreach statement in statement*:
     *          execute[[statement]]()
     *      <jmp Label_> END
     *      <Label_>ELSE <:>
     *      foreach statement in statement*:
     *          execute[[statement]]()
     *      <Label_>END <:>
     */
    @Override
    public Void visit(If node, FunctionDefinition p)
    {
        codeGenerator.comment("If");
        int ELSE= codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        node.getExpression().accept(valueCGVisitor,null);
        codeGenerator.jz(ELSE);
        for (Statement statement: node.getStatementList()) {
            statement.accept(this,p);
        }
        codeGenerator.jmp(end);
        codeGenerator.label(ELSE);
        for (Statement statement: node.getStatementListElse()) {
            statement.accept(this,p);
        }
        codeGenerator.label(end);
        return null;
    }


    /**
     * Execute[[Procediment: Statement ->Expression1 Expression2*]]():
     *          Value[[(Expression) Statement]]()
     *          if(!(((expression)statement).type is void))
     *              <pop> ((expression)statement).type.suffix
     */
    public Void visit(Procediment node, FunctionDefinition p)
    {
        codeGenerator.comment("Procediment");
        node.accept(valueCGVisitor,null);
        if (!(((Expression)node).getType() instanceof VoidType))
            codeGenerator.pop(((Expression) node).getType().suffix());

        return  null;
    }

    /**
     * Execute[[Return: Statement -> Expression]](FunctionDefinition):
     *          Value[[Expression]]()
     *          <Ret> expression.type.numberOfBytes()<,>
     *              FunctionDefinition.LocalVarBytes<,>
     *               FunctionDefinition.type.paramBytes
     *
     */
    public Void visit(Return node, FunctionDefinition p)
    {
        codeGenerator.comment("return");
        FunctionType type = (FunctionType) p.getType();
        node.getExpression().accept(valueCGVisitor,null);
        codeGenerator.ret(
                node.getExpression().getType().getMemoryBytes(),
                p.getLocalVarBytes(),
                type.getParamBytes()
        );
        return  null;
    }

}
