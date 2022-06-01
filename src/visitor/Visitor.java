package visitor;

import ast.Definitions.*;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;
import ast.Types.*;

public interface Visitor<TP,TR> {

    //Definitions
    public TR visit(FunctionDefinition node,TP p);
    public TR visit(VarDefinition node, TP p);
    //Expressions
    public TR visit(Arithmetic node, TP p);
    public TR visit(ArrayAcess node, TP p);
    public TR visit(Cast node, TP p);
    public TR visit(CharLiteral node, TP p);
    public TR visit(Comparason node, TP p);
    public TR visit(DoubleLiteral node, TP p);
    public TR visit(FieldAccess node, TP p);
    public TR visit(FunctionInvocation node, TP p);
    public TR visit(IntLiteral node, TP p);
    public TR visit(Logical node, TP p);
    public TR visit(Not node, TP p);
    public TR visit(UnaryMinus node, TP p);
    public TR visit(Variable node, TP p);
    //Statements
    public TR visit(Assigment node, TP p);
    public TR visit(If node, TP p);
    public TR visit(Input node, TP p);
    public TR visit(Print node, TP p);
    public TR visit(Procediment node, TP p);
    public TR visit(Return node, TP p);
    public TR visit(While node, TP p);
    //Types
    public TR visit(ArrayType node, TP p);
    public TR visit(CharType node, TP p);
    public TR visit(DoubleType node, TP p);
    public TR visit(FunctionType node, TP p);
    public TR visit(IntType node, TP p);
    public TR visit(RecordField node, TP p);
    public TR visit(RecordType node, TP p);
    public TR visit(VoidType node, TP p);

    // Examen
    public TR visit(BooleanType node, TP p);
    public TR visit(BooleanLiteral node, TP p);


    //Program
    public TR visit(Program node, TP p);


}
