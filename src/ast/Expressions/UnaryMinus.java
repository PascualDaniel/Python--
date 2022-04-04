package ast.Expressions;

import visitor.Visitor;

public class UnaryMinus extends AbstractExpression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }




}
