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
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(node.getLine(), node.getColumn(), "No artimetico");
    }
    @Override
    public Type arithmetic( ASTNode node) {

        return new ErrorType(node.getLine(), node.getColumn(), "No se puede hacer opercaiones " +
                "artimeticas con el tipo");
    }
    @Override
    public Type comparason(Type other, ASTNode node) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(node.getLine(), node.getColumn(), "No se puede comparar tipo con " + other.toString());
    }

    @Override
    public Type logical(ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No Logico");
    }

    @Override
    public Type logical(Type other, ASTNode node) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(node.getLine(), node.getColumn(), "No Logico");
    }

    @Override
    public Type dot(String other, ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No se puede hacer el acceso a struct");
    }

    @Override
    public Type squareBrakets(Type other, ASTNode node) {
        if(this instanceof  ErrorType)
            return this;

        return new ErrorType(node.getLine(), node.getColumn(), "No se puede hacer el acceso a array");
    }

    @Override
    public Type promotesTo(Type other, ASTNode node) {

        if(this instanceof ErrorType)
            return this;
        return new ErrorType(node.getLine(), node.getColumn(),  "No se puede promotear a tipo"+other.toString());
    }

    @Override
    public Type canBeCast(Type other, ASTNode node) {
        if(this instanceof ErrorType)
            return this;
        return new ErrorType(node.getLine(), node.getColumn(), "No se puede hacer cast a "+other.toString());
    }

    @Override
    public Type parentherisis(List<Expression> expressions, ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "No se puede invocar la funcion "+node.toString());
    }

    @Override
    public boolean isBuildingType() {
        return false;
    }

    @Override
    public int getMemoryBytes() {
        return 0;
    }


    @Override
    public char suffix() {
        throw new IllegalStateException("Tipo sin sufijo");
    }

}
