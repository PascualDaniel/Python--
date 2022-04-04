package ast.Expressions;

import visitor.Visitor;

import java.util.List;

public class FieldAccess extends AbstractExpression{
    public FieldAccess(int line, int column, String field) {
        super(line, column);
        this.field = field;
        setLValue(true);
    }

    private String field;
   // private List<Expression> expressions;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
