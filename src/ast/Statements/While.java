package ast.Statements;

import ast.Expressions.Expression;

import java.util.List;

public class While extends AbstractStatement {
    private Expression expression;
    private List<Statement> statementList;
    public While(int line, int column) {
        super(line, column);
    }

    public While(int line, int column, Expression expression, List<Statement> statementList) {
        super(line, column);
        this.expression = expression;
        this.statementList = statementList;
    }
}
