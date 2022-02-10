package AST.Definitions;

import AST.ASTNode;
import AST.Types.Type;

public interface Definition extends ASTNode {
    public String getName();
    public Type getType();
}
