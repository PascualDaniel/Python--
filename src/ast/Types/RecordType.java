package ast.Types;

import ast.ASTNode;
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
    public Type dot(String other, ASTNode node)  {
        for (RecordField field: fields)
            if (field.getName().equals(other))
                return field.getType();
        return super.dot(other,node);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public int getMemoryBytes() {
        int ret = 0;

        for(RecordField rf: this.fields){
            ret += rf.getType().getMemoryBytes();
        }

        return ret;
    }
    
}
