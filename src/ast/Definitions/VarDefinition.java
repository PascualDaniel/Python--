package ast.Definitions;

import ast.Statements.Statement;
import ast.Types.Type;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

}
