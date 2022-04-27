package ast.Statements;

import ast.Expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
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
        this.statementListElse = new ArrayList<Statement>();
    }

    public If(int line, int column, Expression expression, List<Statement> statementList, List<Statement> statementListElse) {
        super(line, column);
        this.expression = expression;
        this.statementList = statementList;
        this.statementListElse = statementListElse;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public List<Statement> getStatementListElse() {
        return statementListElse;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
