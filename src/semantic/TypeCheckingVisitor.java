package semantic;

import ast.ASTNode;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Types.ErrorType;
import ast.Types.RecordField;
import ast.Types.RecordType;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor<TP, TR> extends AbstractVisitor<TP, TR> {

    @Override
    public TR visit(Assigment node, TP p) {
        node.getLeft().accept(this, p);
        node.getRight().accept(this, p);
        if (!node.getLeft().getLValue())
            new ErrorType(node.getLine(), node.getColumn(), "Se esperaba LValue");
        return null;
    }

    @Override
    public TR visit(Input node, TP p) {
        for (Expression e: node.getExpressionList()) {
            if (!e.getLValue())
                new ErrorType(node.getLine(), node.getColumn(), "Se esperaba LValue");
        }
        return null;
    }

    @Override
    public TR visit(Variable node, TP p) {
        node.setLValue(true);
        node.setType(node.getDefinition().getType());

        return null;
    }

    @Override
    public TR visit(If node, TP p) {

        node.getExpression().accept(this,p);

        if(!node.getExpression().getType().isLogical())
            new ErrorType(node.getLine(), node.getColumn(), "La condicion tiene que ser de tipo logico");
        for (Statement statement:node.getStatementList()) {
            statement.accept(this,p);
        }
        for (Statement statement:node.getStatementListElse()) {
            statement.accept(this,p);
        }

        return null;
    }
    @Override
    public TR visit(While node, TP p) {
        node.getExpression().accept(this,p);
        if(!node.getExpression().getType().isLogical())
            new ErrorType(node.getLine(), node.getColumn(), "La condicion tiene que ser de tipo logico");
        for (Statement statement:node.getStatementList()) {
            statement.accept(this,p);
        }
        return null;
    }
    @Override
    public TR visit(Arithmetic node, TP p) {
        node.getLeft().accept(this,p);
        node.getRigth().accept(this,p);

        node.setType(node.getLeft().getType().arithmetic(node.getRigth().getType(), node));
        node.setLValue(false);
        return null;
    }
    @Override
    public TR visit(UnaryMinus node, TP p) {
        node.getExpression().accept(this,p);
        node.setType(node.getExpression().getType());
        return null;
    }
    @Override
    public TR visit(FieldAccess node, TP p) {
        node.setType(node.getType().dot(node.getField(),node));

        return null;
    }

    @Override
    public TR visit(RecordType node, TP p) {
        for (RecordField field:node.getFields()) {
            field.accept(this,p);
        }

        return null;
    }
}
