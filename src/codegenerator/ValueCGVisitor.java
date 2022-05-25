package codegenerator;

import ast.Expressions.Variable;

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


    /**
     * Value[[UnaryMinus : expression1 -> expression2]]=
     *          <push> expresion.type.suffix() <0>
     *          value[expression2]
     *          <sub> expression.type.suffix()
     */

    /**
     * valor⟦literalInt → lexema:string⟧ =
     *  PUSH {lexema}
     */


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

    /**
     * valor[[ Cast -> type expression]]=
     *      value[expression]]
     *      expression.type.suffix() <2> type.suffix()
     *
     */

}
