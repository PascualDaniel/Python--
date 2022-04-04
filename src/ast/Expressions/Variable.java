package ast.Expressions;

import ast.Definitions.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;


    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
        setLValue(true);
    }

    public Variable(int line, int column, String name, Definition definition) {
        super(line, column);
        this.name = name;
        this.definition = definition;
        setLValue(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
