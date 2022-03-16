package ast.Statements;

import ast.Expressions.Expression;
import visitor.Visitor;

public class Assigment extends AbstractStatement {
    private Expression left,right;
    public Assigment(int line, int column) {
        super(line, column);
    }

    public Assigment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}
