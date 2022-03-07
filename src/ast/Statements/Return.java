package ast.Statements;

import ast.Expressions.Expression;

public class Return extends AbstractStatement {
    private Expression expression;

    public Return(int line, int column) {
        super(line, column);
    }

    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
