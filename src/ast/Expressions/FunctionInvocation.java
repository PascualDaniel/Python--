package ast.Expressions;

import visitor.Visitor;

import java.util.List;

public class FunctionInvocation  extends AbstractExpression {

    public FunctionInvocation(int line, int column, List<Expression> expressionList, Variable variable) {
        super(line, column);
        this.expressionList = expressionList;
        this.variable = variable;
    }
    private List<Expression> expressionList;
    private Variable variable;

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
