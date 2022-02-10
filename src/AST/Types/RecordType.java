package AST.Types;

import java.util.List;

public class RecordType extends AbstractType{

    private List<RecordField> fields;

    public RecordType(int line, int column) {
        super(line, column);
    }

    public List<RecordField> getFields() {
        return fields;
    }

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }
}
