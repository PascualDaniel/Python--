package ast.Expressions;

import ast.Types.Type;
import visitor.Visitor;

public class Cast  extends AbstractExpression {
    private Type typeCast;

    public Cast(int line, int column, Type typeCast, Expression expression) {
        super(line, column);
        this.typeCast = typeCast;
        this.expression = expression;
    }

    private Expression expression;

    public Type getTypeCast() {
        return typeCast;
    }

    public void setTypeCast(Type typeCast) {
        this.typeCast = typeCast;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
