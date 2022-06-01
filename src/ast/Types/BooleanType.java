package ast.Types;

import ast.ASTNode;
import visitor.Visitor;

public class BooleanType extends AbstractType {

    public BooleanType() {
        super(0, 0);


    }


    @Override
    public boolean isLogical() {
        return true;
    }

/*
    @Override
    public Type comparason(Type other, ASTNode node) {
        if(other instanceof ErrorType)
            return other;
        if(other instanceof BooleanType)
            return new BooleanType();
        return super.comparason(other,node);
    }
    */

    @Override
    public Type logical(Type other,ASTNode node) {
        if(other instanceof BooleanType)
            return other;
        else if(other instanceof ErrorType)
            return other;
        return super.logical(other,node);
    }
    @Override
    public Type logical(ASTNode node) {
        return this;
    }

    @Override
    public Type promotesTo(Type other, ASTNode node) {
        if(other instanceof BooleanType)
            return other;
        else if(other instanceof ErrorType)
            return other;
        return super.promotesTo(other,node);
    }

    @Override
    public Type canBeCast(Type other, ASTNode node) {
        if(other instanceof ErrorType)
            return other;
        if(other instanceof BooleanType || other instanceof IntType ||other instanceof DoubleType || other instanceof CharType)
            return other;

        return super.canBeCast(other,node);
    }
    @Override
    public boolean isBuildingType() {
        return true;
    }

    @Override
    public int getMemoryBytes() {
        return 2;
    }


    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public String toString() {
        return "BooleanType";
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
