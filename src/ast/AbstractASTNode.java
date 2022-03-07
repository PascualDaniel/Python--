package ast;

public abstract class  AbstractASTNode implements  ASTNode {

    private int line;
    private int column;

    public AbstractASTNode(int line, int column) {
        this.line=line;
        this.column=column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
