package AST.Definitions;

import AST.Statatements.AbstractStatement;
import AST.Statatements.Statement;
import AST.Types.Type;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }
}
