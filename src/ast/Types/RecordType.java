package ast.Types;

import visitor.Visitor;

import java.util.List;

public class RecordType extends AbstractType{

    private List<RecordField> fields;

    public RecordType(int line, int column) {
        super(0, 0);
    }

    public RecordType(List<RecordField> fields) {
        super(0, 0);
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
