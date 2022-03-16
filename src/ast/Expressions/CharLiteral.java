package ast.Expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression{
    private char value;

    public CharLiteral(int line, int column) {
        super(line, column);
    }


    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
