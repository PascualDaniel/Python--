package ast.Statements;

import ast.Expressions.Expression;

import java.util.List;

public class If extends AbstractStatement {
    private Expression expression;
    private List<Statement> statementList;
    private List<Statement> statementListElse;

    public If(int line, int column) {
        super(line, column);
    }

    public If(int line, int column, Expression expression, List<Statement> statementList) {
        super(line, column);
        this.expression = expression;
        this.statementList = statementList;
    }

    public If(int line, int column, Expression expression, List<Statement> statementList, List<Statement> statementListElse) {
        super(line, column);
        this.expression = expression;
        this.statementList = statementList;
        this.statementListElse = statementListElse;
    }
}
