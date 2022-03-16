package ast.Expressions;

import ast.ASTNode;

public interface Expression extends ASTNode {


    public boolean getLValue();
    public void setLValue(boolean lValue);

}
