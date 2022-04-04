package ast.Expressions;

import visitor.Visitor;

public class ArrayAcess extends AbstractExpression{
    private Expression left;
    private Expression rigth;
    public ArrayAcess(int line, int column,Expression left ,Expression rigth) {
        super(line, column);
        this.left=left;
        this.rigth = rigth;
        setLValue(true);
    }

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

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

}
