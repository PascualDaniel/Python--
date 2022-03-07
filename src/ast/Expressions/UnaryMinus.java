package ast.Expressions;

public class UnaryMinus extends AbstractExpression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    private Expression expression;




}
