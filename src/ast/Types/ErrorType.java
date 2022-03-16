package ast.Types;

import errorhandler.EH;
import visitor.Visitor;


public class ErrorType extends AbstractType {
    
    private String message;
    

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        EH.getEH().addError(this);
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public <TP,TR>TR accept(Visitor<TP,TR> v, TP p) {
        return null;
    }
}
