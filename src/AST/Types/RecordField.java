package AST.Types;

import AST.AbstractASTNode;

public class RecordField extends AbstractType {

    private String name;

    private Type type;

    public RecordField(int line, int column) {
        super(line, column);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
