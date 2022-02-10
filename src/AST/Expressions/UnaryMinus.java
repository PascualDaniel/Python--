package AST.Expressions;

import AST.Expressions.AbstractExpression;
import AST.Expressions.Expression;
import AST.Types.AbstractType;

public class UnaryMinus extends AbstractExpression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    private Expression expression;




}
