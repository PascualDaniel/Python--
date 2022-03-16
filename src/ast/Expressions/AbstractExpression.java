package ast.Expressions;

import ast.AbstractASTNode;
import visitor.Visitor;

public class AbstractExpression extends AbstractASTNode implements Expression {

    private boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue=lValue;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return null;
    }
}
