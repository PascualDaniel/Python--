package AST.Expressions;

import AST.Definitions.Definition;
import AST.Expressions.AbstractExpression;

public class Variable extends AbstractExpression {

    private String name;

    public Variable(int line, int column, String name, Definition definition) {
        super(line, column);
        this.name = name;
        this.definition = definition;
    }

    private Definition definition;


}
