package AST.Expressions;

public class DoubleLiteral extends AbstractExpression {

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    private double value;

}
