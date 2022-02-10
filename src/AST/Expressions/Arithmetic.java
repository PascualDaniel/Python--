package AST.Expressions;

public class Arithmetic extends AbstractExpression {
    private Expression left,rigth;

    public Arithmetic(int line, int column, Expression left, Expression rigth, String sign) {
        super(line, column);
        this.left = left;
        this.rigth = rigth;
        this.sign = sign;
    }

    private String sign;



}
