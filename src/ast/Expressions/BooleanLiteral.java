package ast.Expressions;

import visitor.Visitor;

public class BooleanLiteral extends AbstractExpression{
    int value;
    public BooleanLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;

        System.out.println("bool");
    }

    public int getValue() {
        return value;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {

        return v.visit(this,p);
    }

}
