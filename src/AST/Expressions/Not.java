package AST.Expressions;

import AST.Expressions.AbstractExpression;
import AST.Expressions.Expression;

public class Not extends AbstractExpression {

    public Not(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    private Expression expression;



}
