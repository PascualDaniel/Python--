package ast.Expressions;

import visitor.Visitor;

public class DoubleLiteral extends AbstractExpression {

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    private double value;

    public double getValue() {
        return value;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
