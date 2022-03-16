package ast.Expressions;

import visitor.Visitor;

public class Comparason extends AbstractExpression {
    private Expression left,rigth;

    public Comparason(int line, int column, Expression left, String sign, Expression rigth) {
        super(line, column);
        this.left = left;
        this.rigth = rigth;
        this.sign = sign;
    }

    private String sign;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRigth() {
        return rigth;
    }

    public void setRigth(Expression rigth) {
        this.rigth = rigth;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
