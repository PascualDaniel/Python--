package ast.Expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression{
    private char value;

    public CharLiteral(int line, int column) {
        super(line, column);
    }


    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
