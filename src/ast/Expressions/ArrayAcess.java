package ast.Expressions;

public class ArrayAcess extends AbstractExpression{
    private Expression left;
    private Expression rigth;
    public ArrayAcess(int line, int column,Expression left ,Expression rigth) {
        super(line, column);
        this.left=left;
        this.rigth = rigth;
    }
}
