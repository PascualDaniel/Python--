package AST.Statatements;

import AST.Expressions.Expression;

import java.util.List;

public class Print extends AbstractStatement {
    private List<Expression> expressionList;
    public Print(int line, int column) {
        super(line, column);
    }
}
