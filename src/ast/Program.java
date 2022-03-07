package ast;

import ast.Definitions.Definition;

import java.util.List;

public class Program implements ASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
