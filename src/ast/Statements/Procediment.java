package ast.Statements;

import ast.Expressions.Expression;
import ast.Expressions.Variable;

import java.util.List;

public class Procediment extends AbstractStatement {
    private List<Expression> expressions;
    private Variable variable;

    public Procediment(int line, int column) {
        super(line, column);
    }

    public Procediment(int line, int column, Variable variable) {
        super(line, column);
        this.variable = variable;
    }

    public Procediment(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

}
