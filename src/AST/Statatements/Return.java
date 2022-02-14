package AST.Statatements;

import AST.Expressions.Expression;

import java.util.List;

public class Return extends AbstractStatement {
    private Expression expression;

    public Return(int line, int column) {
        super(line, column);
    }
}
