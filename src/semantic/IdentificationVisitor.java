package semantic;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.Expression;
import ast.Expressions.FunctionInvocation;
import ast.Expressions.Variable;
import ast.Statements.Procediment;
import ast.Statements.Statement;
import ast.Types.ErrorType;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor<TP, TR> extends AbstractVisitor<TP, TR> {

    SymbolTable table = new SymbolTable();


    @Override
    public TR visit(VarDefinition node, TP p) {
        node.getType().accept(this,p);

        if(!table.insert(node) )
            new ErrorType(node.getLine(), node.getColumn(), "Variable ya definida");
        return null;
    }
    @Override
    public TR visit(Variable node, TP p) {
        Definition def = table.find(node.getName());

        if(def==null ) {
            ErrorType type =  new ErrorType(node.getLine(), node.getColumn(), "Variable no definida");
            def  = new VarDefinition(node.getLine(), node.getColumn(),"Error",type);
        }
        node.setDefinition(def);

        return null;
    }

    @Override
    public TR visit(FunctionDefinition node, TP p) {
        table.set();
        node.getType().accept(this,p);
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }
        for (Statement statement:node.getStatements()) {
            statement.accept(this,p);
        }
        table.reset();
        if(!table.insert(node) )
            new ErrorType(node.getLine(), node.getColumn(), "Function ya definida");
        return null;
    }


    @Override
    public TR visit(FunctionInvocation node, TP p) {
       // node.getVariable().accept(this,p);
        Definition def = table.find(node.getVariable().getName());
        if(def==null ) {
            ErrorType type =  new ErrorType(node.getLine(), node.getColumn(), "Function no definida");
            def  = new VarDefinition(node.getLine(), node.getColumn(),"Error",type);
        }
        node.getVariable().setDefinition(def);

        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Procediment node, TP p) {
       // node.getVariable().accept(this,p);
        Definition def = table.find(node.getVariable().getName());
        if(def==null ) {
            ErrorType type =  new ErrorType(node.getLine(), node.getColumn(), "Function no definida");
            def  = new VarDefinition(node.getLine(), node.getColumn(),"Error",type);
        }
        node.getVariable().setDefinition(def);

        for (Expression expression:node.getExpressions()) {
            expression.accept(this,p);
        }

        return null;
    }

}
