package ast.Types;

import ast.ASTNode;
import visitor.Visitor;

public class CharType extends AbstractType {
    public CharType() {
        super(0, 0);
    }


    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if(other instanceof CharType)
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
