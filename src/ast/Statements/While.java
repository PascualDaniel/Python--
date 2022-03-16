package ast.Statements;

import ast.Expressions.Expression;
import visitor.Visitor;

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

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
