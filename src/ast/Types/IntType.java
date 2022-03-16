package ast.Types;

import visitor.Visitor;

public class IntType extends AbstractType {
    public IntType() {
        super(0, 0);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
