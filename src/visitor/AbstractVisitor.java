package visitor;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;
import ast.Types.*;

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR>{
    @Override
    public TR visit(FunctionDefinition node, TP p) {
        node.getType().accept(this,p);
        for (Definition definition:node.getDefinitions()) {
                definition.accept(this,p);
        }
        for (Statement statement:node.getStatements()) {
            statement.accept(this,p);
        }

        return null;
    }

    @Override
    public TR visit(VarDefinition node, TP p) {
        node.getType().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Arithmetic node, TP p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public TR visit(ArrayAcess node, TP p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Cast node, TP p) {
        node.getTypeCast().accept(this,p);
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(CharLiteral node, TP p) {

        return null;
    }

    @Override
    public TR visit(Comparason node, TP p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral node, TP p) {
        return null;
    }

    @Override
    public TR visit(FieldAccess node, TP p) {
        node.getType().accept(this,p);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation node, TP p) {

        node.getVariable().accept(this,p);
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(IntLiteral node, TP p) {
        return null;
    }

    @Override
    public TR visit(Logical node, TP p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);

        return null;
    }

    @Override
    public TR visit(Not node, TP p) {
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus node, TP p) {
        node.getExpression().accept(this,p);

        return null;
    }

    @Override
    public TR visit(Variable node, TP p) {


        return null;
    }

    @Override
    public TR visit(Assigment node, TP p) {
        node.getLeft().accept(this,p);
        node.getRight().accept(this,p);

        return null;
    }

    @Override
    public TR visit(If node, TP p) {
        node.getExpression().accept(this,p);
        for (Statement statement:node.getStatementList()) {
            statement.accept(this,p);
        }
        for (Statement statement:node.getStatementListElse()) {
            statement.accept(this,p);
        }

        return null;
    }

    @Override
    public TR visit(Input node, TP p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Print node, TP p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Procediment node, TP p) {
        node.getVariable().accept(this,p);
        for (Expression expression:node.getExpressions()) {
            expression.accept(this,p);
        }

        return null;
    }

    @Override
    public TR visit(Return node, TP p) {
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(While node, TP p) {
        node.getExpression().accept(this,p);
        for (Statement statement:node.getStatementList()) {
            statement.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(ArrayType node, TP p) {
        node.getType().accept(this,p);

        return null;
    }

    @Override
    public TR visit(CharType node, TP p) {
        return null;
    }

    @Override
    public TR visit(DoubleType node, TP p) {
        return null;
    }

    @Override
    public TR visit(FunctionType node, TP p) {
        node.getType().accept(this,p);
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(IntType node, TP p) {
        return null;
    }

    @Override
    public TR visit(RecordField node, TP p) {
        return null;
    }

    @Override
    public TR visit(RecordType node, TP p) {
        for (RecordField field:node.getFields()) {
            field.accept(this,p);
        }

        return null;
    }

    @Override
    public TR visit(VoidType node, TP p) {
        return null;
    }

    @Override
    public TR visit(Program node, TP p) {
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }

        return null;
    }
}
