package ast.Definitions;

import ast.Statements.Statement;
import ast.Types.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof VarDefinition){
            if(((VarDefinition) obj).getName().equals(getName())){
                return true;
            }

        }


        return super.equals(obj);
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return v.visit(this,p);
    }
}
