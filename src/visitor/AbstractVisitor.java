package visitor;

import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Definitions.VarDefinition;
import ast.Expressions.*;
import ast.Program;
import ast.Statements.*;
import ast.Types.*;

public abstract class AbstractVisitor implements Visitor{
    @Override
    public Object visit(FunctionDefinition node, Object p) {
        for (Definition definition:node.getDefinitions()) {
                definition.accept(this,p);
        }
        for (Statement statement:node.getStatements()) {
            statement.accept(this,p);
        }

        return null;
    }

    @Override
    public Object visit(VarDefinition node, Object p) {
        node.getType().accept(this,p);
        return null;
    }

    @Override
    public Object visit(Arithmetic node, Object p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public Object visit(ArrayAcess node, Object p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public Object visit(Cast node, Object p) {
        node.getTypeCast().accept(this,p);
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public Object visit(CharLiteral node, Object p) {

        return null;
    }

    @Override
    public Object visit(Comparason node, Object p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral node, Object p) {
        return null;
    }

    @Override
    public Object visit(FieldAccess node, Object p) {
        return null;
    }

    @Override
    public Object visit(FunctionInvocation node, Object p) {

        node.getVariable().accept(this,p);
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(IntLiteral node, Object p) {
        return null;
    }

    @Override
    public Object visit(Logical node, Object p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);

        return null;
    }

    @Override
    public Object visit(Not node, Object p) {
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public Object visit(UnaryMinus node, Object p) {
        node.getExpression().accept(this,p);

        return null;
    }

    @Override
    public Object visit(Variable node, Object p) {


        return null;
    }

    @Override
    public Object visit(Assigment node, Object p) {
        node.getLeft().accept(this,p);
        node.getRight().accept(this,p);

        return null;
    }

    @Override
    public Object visit(If node, Object p) {
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
    public Object visit(Input node, Object p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(Print node, Object p) {
        for (Expression expression:node.getExpressionList()) {
            expression.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(Procediment node, Object p) {
        node.getVariable().accept(this,p);
        for (Expression expression:node.getExpressions()) {
            expression.accept(this,p);
        }

        return null;
    }

    @Override
    public Object visit(Return node, Object p) {
        node.getExpression().accept(this,p);
        return null;
    }

    @Override
    public Object visit(While node, Object p) {
        node.getExpression().accept(this,p);
        for (Statement statement:node.getStatementList()) {
            statement.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(ArrayType node, Object p) {
        node.getType().accept(this,p);

        return null;
    }

    @Override
    public Object visit(CharType node, Object p) {
        return null;
    }

    @Override
    public Object visit(DoubleType node, Object p) {
        return null;
    }

    @Override
    public Object visit(FunctionType node, Object p) {
        node.getType().accept(this,p);
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(IntType node, Object p) {
        return null;
    }

    @Override
    public Object visit(RecordField node, Object p) {
        return null;
    }

    @Override
    public Object visit(RecordType node, Object p) {
        for (RecordField field:node.getFields()) {
            field.accept(this,p);
        }

        return null;
    }

    @Override
    public Object visit(VoidType node, Object p) {
        return null;
    }

    @Override
    public Object visit(Program node, Object p) {
        for (Definition definition:node.getDefinitions()) {
            definition.accept(this,p);
        }

        return null;
    }
}
