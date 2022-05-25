package ast.Types;

import ast.ASTNode;
import ast.Definitions.Definition;
import ast.Definitions.VarDefinition;
import ast.Expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType{

    private Type type;

    private List<VarDefinition> definitions;

    public FunctionType(int line, int column) {
        super(line, column);
    }

    public FunctionType( Type type, List<VarDefinition> definitions) {
        super(0, 0);
        this.type = type;
        this.definitions = definitions;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<VarDefinition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<VarDefinition> definitions) {
        this.definitions = definitions;
    }



    @Override
    public Type parentherisis(List<Expression> expressions, ASTNode node) {
        if(expressions.size() != definitions.size()){
            return super.parentherisis(expressions,node);
        }
        for(int i=0; i < expressions.size(); i++){
            Type type = expressions.get(i).getType().promotesTo(definitions.get(i).getType(),node);
            if( type instanceof ErrorType){
                return type;
            }
        }
        return type;
    }
    @Override
    public Type promotesTo(Type other, ASTNode node) {
        return getType().promotesTo(other,node);
    }

    @Override
    public int getMemoryBytes() {
        return type.getMemoryBytes();
    }


    public int getParamBytes() {
        int size = 0;
        for(Definition d:definitions){
            size+=d.getType().getMemoryBytes();

        }
        return size;
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "type=" + type.toString() +
                '}';
    }
}
