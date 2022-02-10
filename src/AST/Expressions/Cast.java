package AST.Expressions;

import AST.Expressions.AbstractExpression;
import AST.Expressions.Expression;
import AST.Types.Type;

public class Cast  extends AbstractExpression {
    private Type typeCast;

    public Cast(int line, int column, Type typeCast, Expression expression) {
        super(line, column);
        this.typeCast = typeCast;
        this.expression = expression;
    }

    private Expression expression;



}
