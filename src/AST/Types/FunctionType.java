package AST.Types;

import AST.Definitions.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType{

    private Type type;

    private List<VarDefinition> definitions;

    public FunctionType(int line, int column) {
        super(line, column);
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<VarDefinition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<VarDefinition> definitions) {
        this.definitions = definitions;
    }


}
