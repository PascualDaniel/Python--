package ast.Types;

import ast.ASTNode;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    public DoubleType() {
        super(0, 0);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }


    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if(other instanceof DoubleType)
            return other;
        else if(other instanceof ErrorType)
            return other;
        return super.arithmetic(other,node);

    }
    @Override
    public Type arithmetic( ASTNode node) {
        return this;
    }
    @Override
    public Type comparason(Type other, ASTNode node) {
        if(other instanceof ErrorType)
            return other;
        if(other instanceof DoubleType)
            return new BooleanType();
        return super.comparason(other,node);
    }

    @Override
    public Type promotesTo(Type other, ASTNode node) {
        if(other instanceof DoubleType)
            return other;
        else if(other instanceof ErrorType)
            return other;
        return super.promotesTo(other,node);
    }

    @Override
    public Type canBeCast(Type other, ASTNode node) {
        if(other instanceof ErrorType)
            return other;
        if(other instanceof IntType ||other instanceof DoubleType || other instanceof CharType)
            return other;

        return super.canBeCast(other,node);
    }
    @Override
    public boolean isBuildingType() {
        return true;
    }


    @Override
    public int getMemoryBytes() {
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public String toString() {
        return "DoubleType";
    }
}
