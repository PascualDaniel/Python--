package AST.Expressions;

public class FunctionInvocation  extends AbstractExpression {
    public FunctionInvocation(int line, int column, Variable variable) {
        super(line, column);
        this.variable = variable;
    }

    private Variable variable;
}
