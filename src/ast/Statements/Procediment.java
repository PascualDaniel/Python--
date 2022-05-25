package ast.Statements;

import ast.Expressions.Expression;
import ast.Expressions.Variable;
import ast.Types.Type;
import visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

public class Procediment extends AbstractStatement implements Expression  {
    private List<Expression> expressions = new LinkedList<>();
    private Variable variable;

    private Type type;
    public Procediment(int line, int column) {
        super(line, column);
    }

    public Procediment(int line, int column, Variable variable) {
        super(line, column);
        this.variable = variable;
    }

    public Procediment(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.expressions = expressions;
        this.variable = variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public boolean getLValue() {
        return false;
    }

    @Override
    public void setLValue(boolean lValue) {

    }

    @Override
    public Type getType() {
       return type;
    }

    @Override
    public void setType(Type type) {
        this.type=type;
    }
}
