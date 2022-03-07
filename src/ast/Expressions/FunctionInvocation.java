package ast.Expressions;

import java.util.List;

public class FunctionInvocation  extends AbstractExpression {

    public FunctionInvocation(int line, int column, List<Expression> expressionList, Variable variable) {
        super(line, column);
        this.expressionList = expressionList;
        this.variable = variable;
    }
    private List<Expression> expressionList;
    private Variable variable;
}
