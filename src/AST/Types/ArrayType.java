package AST.Types;

public class ArrayType extends AbstractType{

    private Type type;
    private int dimensions;

    public ArrayType(int line, int column) {
        super(line, column);
    }

    public Type of() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

}
