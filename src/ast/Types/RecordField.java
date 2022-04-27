package ast.Types;

import ast.Expressions.Expression;
import visitor.Visitor;

public class RecordField extends AbstractType {

    private String name;

    private Type type;

    private int offset;


    public RecordField(int line, int column) {
        super(line, column);
    }

    public RecordField(int line, int column, String name,  Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
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


    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
