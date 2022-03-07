package ast.Definitions;

import ast.AbstractASTNode;
import ast.Types.Type;

public class AbstractDefinition extends AbstractASTNode implements Definition {

    private String name;
    private Type type;

    public AbstractDefinition(int line, int column,String name,Type type) {
        super(line, column);
        this.name= name;
        this.type=type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }
}
