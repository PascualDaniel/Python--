package ast.Types;

import java.util.List;

public class ArrayType extends AbstractType{

    private Type type;
    private List<Integer> dimensions;
    public ArrayType(int line, int column) {
        super(0, 0);
    }

    public ArrayType( Type type, List<Integer>  dimensions) {
        super(0, 0);
        this.type = type;
        this.dimensions = dimensions;
    }

    public Type of() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Integer>  getDimensions() {
        return dimensions;
    }

    public void setDimensions(List dimensions) {
        this.dimensions = dimensions;
    }

}
