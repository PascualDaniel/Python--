package ast.Expressions;

public class Logical extends AbstractExpression {
    private Expression left,rigth;

    public Logical(int line, int column, Expression left, String sign, Expression rigth) {
        super(line, column);
        this.left = left;
        this.rigth = rigth;
        this.sign = sign;
    }

    private String sign;
}
