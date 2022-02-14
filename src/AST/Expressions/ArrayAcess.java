package AST.Expressions;

import java.util.List;

public class ArrayAcess extends AbstractExpression{
    private String name;
    private Expression expression;
    public ArrayAcess(int line, int column) {
        super(line, column);
    }
}
