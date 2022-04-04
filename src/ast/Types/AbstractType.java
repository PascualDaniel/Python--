package ast.Types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class AbstractType extends AbstractASTNode implements Type{
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return null;
    }


    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type other, ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No artimetico");
    }
    @Override
    public Type arithmetic( ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No se puede hacer opercaiones " +
                "artimeticas con el tipo");
    }
    @Override
    public Type comparason(Type other, ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No Comparasson");
    }

    @Override
    public Type logical(ASTNode node) {
        return null;
    }

    @Override
    public Type logical(Type other, ASTNode node) {
        return null;
    }

    @Override
    public Type dot(String other, ASTNode node) {
        return null;
    }

    @Override
    public Type squareBrakets(Type other, ASTNode node) {
        return null;
    }

    @Override
    public Type promotesTo(Type other, ASTNode node) {
        return null;
    }

    @Override
    public Type canBeCast(Type other, ASTNode node) {
        return null;
    }

    @Override
    public Type parentherisis(List<Expression> expressions, ASTNode node) {
        return null;
    }

    @Override
    public boolean isBuildingType() {
        return false;
    }



}
