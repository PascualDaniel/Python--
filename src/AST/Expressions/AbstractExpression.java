package AST.Expressions;

import AST.AbstractASTNode;

public class AbstractExpression extends AbstractASTNode implements Expression {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
