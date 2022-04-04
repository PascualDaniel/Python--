package ast.Types;

import ast.Definitions.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType{

    private Type type;

    private List<VarDefinition> definitions;

    public FunctionType(int line, int column) {
        super(line, column);
    }

    public FunctionType( Type type, List<VarDefinition> definitions) {
        super(0, 0);
        this.type = type;
        this.definitions = definitions;
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



    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
