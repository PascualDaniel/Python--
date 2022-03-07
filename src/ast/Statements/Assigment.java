package ast.Statements;

import ast.Expressions.Expression;

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
}
