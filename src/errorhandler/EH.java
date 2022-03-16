package errorhandler;

import ast.Types.ErrorType;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class EH {

    List<ErrorType> errors ;
    private static EH singleton;
    public EH(){
        errors= new LinkedList<ErrorType>();
    }

    public static EH getEH(){
        if(singleton==null){
            singleton=new EH();

        }
        return singleton;
    }
    public boolean hasErrors(){
        return !errors.isEmpty();
    }

    public void addError(ErrorType error){

        errors.add(error);
    }

    public void  showErrors(PrintStream stream){

        for(ErrorType error: errors){
            stream.println(error.toString());
        }
    }

}
