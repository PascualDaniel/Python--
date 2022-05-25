package ast.Definitions;

import ast.Statements.Statement;
import ast.Types.Type;
import visitor.Visitor;

import java.util.Collection;
import java.util.Collections;
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
        //Collections.reverse(definitions);
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }




    public List<Definition> getDefinitions() {
        return  definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    public int getLocalVarBytes() {
        int size = 0;
        for(Definition d:definitions){
            size+=d.getType().getMemoryBytes();

        }
        return size;
    }
}
