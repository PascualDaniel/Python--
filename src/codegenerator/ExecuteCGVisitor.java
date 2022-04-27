package codegenerator;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;

public class ExecuteCGVisitor  <TP, TR> extends AbstractErrorVisitor<TP, TR>{


    private AddressCGVisitor<TP,TR> addressCGVisitor;
    private ValueCGVisitor<TP,TR> valueCGVisitor;

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
    public TR visit(Program node, TP p) {
        codeGenerator.main();
        //codeGenerator.halt();
        for (Definition def:node.getDefinitions()) {
            def.accept(this, p);
        //    codeGenerator.enter(def.getOffset());
        }
        return null;
    }

    /**
     * Execute[[VarDefinition:Definition -> type ID]]()
     *
     */
    @Override
    public TR visit(VarDefinition node, TP p) {
        //node.
        return null;
    }

    /**
     * Execute[[VarDefinition:Definition -> type ID]]()
     *
     */
    @Override
    public TR visit(FunctionDefinition node, TP p) {
        //node.
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
    public TR visit(Variable node, TP p) {
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
    public TR visit(Print node, TP p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(valueCGVisitor, p);
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
    public TR visit(Input node, TP p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(addressCGVisitor, p);
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
    public TR visit(While node, TP p)
    {
        int condition= codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        codeGenerator.label(condition);
        node.getExpression().accept(valueCGVisitor,p);
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
    public TR visit(If node, TP p)
    {
        int ELSE= codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        node.getExpression().accept(valueCGVisitor,p);
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



}
