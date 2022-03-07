package ast.Expressions;

import java.util.List;

public class FieldAccess extends AbstractExpression{
    public FieldAccess(int line, int column, String field) {
        super(line, column);
        this.field = field;
    }

    private String field;
   // private List<Expression> expressions;



}
