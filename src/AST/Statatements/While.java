package AST.Statatements;

import AST.Expressions.Expression;

import java.util.List;

public class While extends AbstractStatement {
    private Expression expression;
    private List<Statement> statementList;
    public While(int line, int column) {
        super(line, column);
    }
}
