package AST.Statatements;

import AST.Expressions.Expression;

import java.util.List;

public class Input extends AbstractStatement {
    private List<Expression> expressionList;

    public Input(int line, int column) {
        super(line, column);
    }
}
