package AST.Statatements;

import AST.Expressions.Expression;

public class Assigment extends AbstractStatement {
    private Expression left,right;
    public Assigment(int line, int column) {
        super(line, column);
    }
}
