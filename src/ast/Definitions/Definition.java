package ast.Definitions;

import ast.ASTNode;
import ast.Types.Type;

public interface Definition extends ASTNode {
    public String getName();
    public Type getType();

    void setType(Type ast);

    public int getScope();
    public void setScope(int scope);
}
