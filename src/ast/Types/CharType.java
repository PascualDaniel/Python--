package ast.Types;

import visitor.Visitor;

public class CharType extends AbstractType {
    public CharType() {
        super(0, 0);
    }


    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
