package ast.Expressions;

import visitor.Visitor;

public class IntLiteral extends AbstractExpression{
    int value;
    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
