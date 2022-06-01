package codegenerator;

import ast.Expressions.*;
import ast.Statements.Procediment;
import ast.Types.BooleanType;

public class ValueCGVisitor   extends AbstractErrorVisitor<Void, Void>{


    private AddressCGVisitor addressCGVisitor;

    private CodeGenerator codeGenerator;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }


    /**
     * Value[[Variable: expression -> ID]]()=
     * 	ADRRESS[[expression]]
     * 	<LOAD>expression.type.suffix()
     */
    @Override
    public Void visit(Variable node, Void p) {
        node.accept(addressCGVisitor, p);
        codeGenerator.load(node.getDefinition().getType().suffix());
        return null;
    }

    /**
     * Value[[FunctionInvocation: Expression1 ->Expression2 Expression3*]]
     *          for(expression e: expression3*)
     *              Value[[e]]()
     *          <call> expression2.name
     *
     */
    @Override
    public Void visit(FunctionInvocation node, Void p) {
        for (Expression e :node.getExpressionList()) {
            e.accept(this,p);
        }
        codeGenerator.call(node.getVariable().getName());
        return null;
    }


    /**
     * Value[[UnaryMinus : expression1 -> expression2]]=
     *          <push> expresion.type.suffix() <0>
     *          value[expression2]
     *          <sub> expression.type.suffix()
     */
    @Override
    public Void visit(UnaryMinus node, Void p) {
        codeGenerator.push(node.getType().suffix(),0);
        node.getExpression().accept(this,p);
        codeGenerator.sub(node.getType().suffix());
        return null;
    }

    /**
     * valor⟦literalInt → lexema:string⟧ =
     *  PUSH {lexema}
     */
    @Override
    public Void visit(IntLiteral node, Void p) {
        codeGenerator.push(node.getType().suffix(),node.getValue());
        return null;
    }

    /**
     * valor⟦literalBoolean → lexema:string⟧ =
     *  PUSH {lexema}
     *
     *  //Tiene que ser 0 o 1
     */
    @Override
    public Void visit(BooleanLiteral node, Void p) {
        codeGenerator.push(node.getType().suffix(),node.getValue());
        return null;
    }

    /**
     * valor⟦literalChar → lexema:string⟧ =
     *  PUSH {lexema}
     */
    @Override
    public Void visit(CharLiteral node, Void p) {
        codeGenerator.push(node.getType().suffix(),node.getValue());
        return null;
    }
    /**
     * valor⟦literaldouble → lexema:string⟧ =
     *  PUSH {lexema}
     */
    @Override
    public Void visit(DoubleLiteral node, Void p) {
        codeGenerator.push(node.getType().suffix(),node.getValue());
        return null;
    }


    /**
     * valor⟦suma → left:expr right:expr⟧ =
     *  valor⟦left⟧
     *  valor⟦right⟧
     *  ADD
     */
    /**
     * valor ⟦aritmetica → leŌ:expr operador:string right:expr⟧ =
     *  valor⟦left⟧
     *  valor⟦right⟧
     *  si operador == “+”
     *  ADD<aritmetica .tipo>
     *  si operador == “-”
     *  SUB<aritmetica .tipo>
     *  si operador == “*”
     *  MUL<aritmetica .tipo>
     *  si operador == “/”
     *  DIV<aritmetica .tipo>
     */
    @Override
    public Void visit(Arithmetic node, Void p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        if(node.getSign().equals("+"))
            codeGenerator.add(node.getType().suffix());
        if(node.getSign().equals("-"))
            codeGenerator.sub(node.getType().suffix());
        if(node.getSign().equals("*"))
            codeGenerator.mult(node.getType().suffix());
        if(node.getSign().equals("/"))
            codeGenerator.div(node.getType().suffix());
        return null;
    }
    /**
     * valor ⟦comparason → leŌ:expr operador:string right:expr⟧ =
     *  valor⟦left⟧
     *  valor⟦right⟧
     *  si operador == “>”
     *      gt<comparason .tipo>
     *  si operador == “>=”
     *      ge<comparason .tipo>
     *  si operador == “<”
     *      lt<comparason .tipo>
     *  si operador == “<=”
     *      le<comparason .tipo>
     *  si operador == “!=”
     *      ne<comparason .tipo>
     *  si operador == “==”
     *      eq<comparason .tipo>
     */

    @Override
    public Void visit(Comparason node, Void p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        if(node.getSign().equals(">"))
            codeGenerator.gt(node.getLeft().getType().suffix());
        if(node.getSign().equals(">="))
            codeGenerator.ge(node.getLeft().getType().suffix());
        if(node.getSign().equals("<"))
            codeGenerator.lt(node.getLeft().getType().suffix());
        if(node.getSign().equals("<="))
            codeGenerator.le(node.getLeft().getType().suffix());
        if(node.getSign().equals("!="))
            codeGenerator.ne(node.getLeft().getType().suffix());
        if(node.getSign().equals("=="))
            codeGenerator.eq(node.getLeft().getType().suffix());

        return null;
    }
    /**
     * valor ⟦logical → leŌ:expr operador:string right:expr⟧ =
     *  valor⟦left⟧
     *  valor⟦right⟧
     *  si operador == “||”
     *   AND
     *  si operador == “&&”
     *   OR

     */
    @Override
    public Void visit(Logical node, Void p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        if(node.getSign().equals("||"))
            codeGenerator.or();
        if(node.getSign().equals("&&"))
            codeGenerator.and();

        return null;
    }


    /**
     * valor[[ Cast -> type expression]]=
     *      value[expression]]
     *      expression.type.suffix() <2> type.suffix()
     *
     */
    @Override
    public Void visit(Cast node, Void p) {
        node.getExpression().accept(this,p);
        codeGenerator.promotesTo(node.getExpression().getType().suffix(),node.getType().suffix());
        return null;
    }
    /**
     * value[[NOT: expression -> expression]]() =
     *          value[[exp]]
     *          <not>
     */
    @Override
    public Void visit(Not node, Void p) {
        node.getExpression().accept(this,p);
        codeGenerator.not();
        return null;
    }
    /**
     * value[[FieldAccess: expression -> expr ID]]() =
     *         	address[[expression]]
     *         	<load> expr.type.suffix()
     */
    @Override
    public Void visit(FieldAccess node, Void p) {

        node.accept(addressCGVisitor,p);
        codeGenerator.load(node.getType().suffix());
        return null;
    }
    /**
     *  value[[ArrayAccess: expression -> left=expression rigth=expression  ]]() =
     *          address[[expression]]
     *          <load> expr1.type.suffix()
     *
     */
    @Override
    public Void visit(ArrayAcess node, Void p) {
        node.accept(addressCGVisitor,p);
        codeGenerator.load(node.getType().suffix());
        return null;
    }
    /**
     * value [[Procedimient: expression1 -> expression2 expression*]]() =
     *             for (Expression e: expression*)
     *                 value[[e]]()
     *             <call expression1.name>
     */
    @Override
    public Void visit(Procediment node, Void p) {
        for (Expression e: node.getExpressions()) {
            e.accept(this,p);
        }
        codeGenerator.call(node.getVariable().getName());
        return null;
    }

}
