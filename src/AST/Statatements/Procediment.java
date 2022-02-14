package AST.Statatements;

import AST.Expressions.Expression;
import AST.Expressions.Variable;

import java.util.List;

public class Procediment extends AbstractStatement {
    private Expression expression;
    private Variable variable;

    public Procediment(int line, int column) {
        super(line, column);
    }
}
