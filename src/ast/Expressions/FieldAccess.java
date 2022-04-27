package ast.Expressions;

import visitor.Visitor;

import java.util.List;

public class FieldAccess extends AbstractExpression{

    private Expression expression;

    public FieldAccess(int line, int column, String field) {
        super(line, column);
        this.field = field;
        setLValue(true);
    }

    public FieldAccess(int line, int column, Expression expression, String field) {
        super(line, column);
        this.expression = expression;
        this.field = field;
        setLValue(true);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
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
