package ast.Expressions;

import ast.AbstractASTNode;
import ast.Types.Type;
import visitor.Visitor;

public class AbstractExpression extends AbstractASTNode implements Expression {

    private boolean lValue;
    private Type type;
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
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type=type;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return null;
    }




}
