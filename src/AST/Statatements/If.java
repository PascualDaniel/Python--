package AST.Statatements;

import AST.Expressions.Expression;

import java.util.List;

public class If extends AbstractStatement {
    private Expression expression;
    private List<Statement> statementList;

    public If(int line, int column) {
        super(line, column);
    }
}
