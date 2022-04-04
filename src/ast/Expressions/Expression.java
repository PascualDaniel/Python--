package ast.Expressions;

import ast.ASTNode;
import ast.Types.Type;

public interface Expression extends ASTNode {


    public boolean getLValue();
    public void setLValue(boolean lValue);

    public Type getType();
    public void setType(Type type);

}
