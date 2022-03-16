package ast.Statements;

import ast.Expressions.Expression;
import visitor.Visitor;

public class Return extends AbstractStatement {
    private Expression expression;

    public Return(int line, int column) {
        super(line, column);
    }

    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
