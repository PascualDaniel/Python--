package ast.Definitions;

import ast.Statements.Statement;
import ast.Types.Type;

import java.util.List;

public class FunctionDefinition extends  AbstractDefinition{

    private List<Definition> definitions;
    private List<Statement> statements;

    public FunctionDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public FunctionDefinition(int line, int column, String name, Type type, List<Definition> definitions, List<Statement> statements) {
        super(line, column, name, type);
        this.definitions = definitions;
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }


    public List<Definition> getVarDefinitions() {
        return definitions;
    }
}
