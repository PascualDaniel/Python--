package ast.Types;

import ast.ASTNode;
import visitor.Visitor;

public class IntType extends AbstractType {
    public IntType() {
        super(0, 0);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public boolean isLogical() {
        return true;
    }
    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if(other instanceof IntType)
            return other;
        else if(other instanceof ErrorType)
            return other;
        return super.arithmetic(other,node);

    }

    @Override
    public Type arithmetic( ASTNode node) {
        return this;
    }
}
