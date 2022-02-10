package AST.Expressions;

public class IntLiteral extends AbstractExpression{
    int value;
    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }




}
