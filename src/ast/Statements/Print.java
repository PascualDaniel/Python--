package ast.Statements;

import ast.Expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class Print extends AbstractStatement {
    private List<Expression> expressionList;
    public Print(int line, int column) {
        super(line, column);
    }

    public Print(int line, int column, List<Expression> expressionList) {
        super(line, column);
        this.expressionList = expressionList;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
