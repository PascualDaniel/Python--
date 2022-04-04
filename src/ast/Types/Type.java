package ast.Types;

import ast.ASTNode;
import ast.Expressions.Expression;

import java.util.List;

public interface Type extends ASTNode {

    public boolean isLogical();
    public Type arithmetic(ASTNode node);
    public Type arithmetic(Type other,ASTNode node);
    public Type comparason(Type other,ASTNode node);
    public Type logical(ASTNode node);
    public Type logical(Type other,ASTNode node);
    public Type dot(String other,ASTNode node);
    public Type squareBrakets(Type other,ASTNode node);
    public Type promotesTo(Type other,ASTNode node);
    public Type canBeCast(Type other,ASTNode node);
    public Type parentherisis(List<Expression> expressions, ASTNode node);
    public boolean isBuildingType();



}
