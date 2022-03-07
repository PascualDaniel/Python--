package ast.Expressions;

public class CharLiteral extends AbstractExpression{
    private char value;

    public CharLiteral(int line, int column) {
        super(line, column);
    }
}
