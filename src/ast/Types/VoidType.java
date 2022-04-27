package ast.Types;

import visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType() {
        super(0,0);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public boolean isBuildingType() {
        return true;
    }

}
