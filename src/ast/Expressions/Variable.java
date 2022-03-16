package ast.Expressions;

import ast.Definitions.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {

    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
