package ast.Types;

import ast.AbstractASTNode;
import visitor.Visitor;

public class AbstractType extends AbstractASTNode implements Type{
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return null;
    }
}
