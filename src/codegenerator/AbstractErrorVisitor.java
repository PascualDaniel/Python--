package codegenerator;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;
import ast.Types.*;
import visitor.Visitor;

public abstract class AbstractErrorVisitor<TP,TR> implements Visitor<TP,TR> {
    @Override
    public TR visit(FunctionDefinition node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");

    }

    @Override
    public TR visit(VarDefinition node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Arithmetic node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(ArrayAcess node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Cast node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(CharLiteral node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Comparason node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(DoubleLiteral node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(FieldAccess node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(FunctionInvocation node, TP p) {

        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(IntLiteral node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Logical node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Not node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(UnaryMinus node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Variable node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Assigment node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(If node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Input node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Print node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Procediment node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Return node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(While node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(ArrayType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(CharType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(DoubleType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(FunctionType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(IntType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(RecordField node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(RecordType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(VoidType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }

    @Override
    public TR visit(Program node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }
    //Examen
    @Override
    public TR visit(BooleanType node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }
    @Override
    public TR visit(BooleanLiteral node, TP p) {
        throw new IllegalStateException("No deberia llegar aqui");
    }
}
