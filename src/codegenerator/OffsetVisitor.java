package codegenerator;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Types.FunctionType;
import ast.Types.RecordField;
import ast.Types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor <TP, TR> extends AbstractVisitor<TP, TR> {

    int global = 0;
    int locales = 0;


    @Override
    public TR visit(FunctionDefinition node, TP p){

        node.getType().accept(this, p);
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }

        locales = 0;
        return null;
    }


    @Override
    public TR visit(VarDefinition node, TP p){

        node.getType().accept(this, p);

        if(node.getScope() == 0){
            node.setOffset(global);
            this.global += node.getType().getMemoryBytes();
        }else{
           locales -= node.getType().getMemoryBytes();
            node.setOffset(locales);
        }

        return null;
    }


    @Override
    public TR visit(FunctionType node, TP p){

        int bites = 4;
        for(int i = node.getDefinitions().size()-1; i >= 0; i--){
            node.getDefinitions().get(i).accept(this,p);
            node.getDefinitions().get(i).setOffset(bites);
            bites += node.getDefinitions().get(i).getType().getMemoryBytes();
        }

        return null;
    }

    @Override
    public TR visit(RecordType node, TP p){

        int fieldSum = 0;

        for(RecordField field : node.getFields())
        {
            field.accept(this, p);
            field.setOffset(fieldSum);
            fieldSum += field.getType().getMemoryBytes();

        }
        return null;
    }

}
