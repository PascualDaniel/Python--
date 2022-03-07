package ast.Statements;

import ast.Expressions.Expression;

import java.util.List;

public class Input extends AbstractStatement {
    private List<Expression> expressionList;

    public Input(int line, int column) {
        super(line, column);
    }

    public Input(int line, int column, List<Expression> expressionList) {
        super(line, column);
        this.expressionList = expressionList;
    }
}
