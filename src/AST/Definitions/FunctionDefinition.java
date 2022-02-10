package AST.Definitions;

import AST.Statatements.Statement;
import AST.Types.Type;

import java.util.List;

public class FunctionDefinition extends  AbstractDefinition{

    private List<Definition> definitions;
    private List<Statement> statements;

    public FunctionDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }
    public List<Statement> getStatements() {
        return statements;
    }

    public List<Definition> getVarDefinitions() {
        return definitions;
    }
}
