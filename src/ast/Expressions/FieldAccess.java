package ast.Expressions;

import visitor.Visitor;

import java.util.List;

public class FieldAccess extends AbstractExpression{
    public FieldAccess(int line, int column, String field) {
        super(line, column);
        this.field = field;
    }

    private String field;
   // private List<Expression> expressions;

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
