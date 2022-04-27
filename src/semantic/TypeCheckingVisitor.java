package semantic;

import ast.ASTNode;
import ast.Definitions.Definition;
import ast.Definitions.FunctionDefinition;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Types.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {


    /**
     * Pasar hacia abajo el tipo y comprobar que el return , en el accept pasar el parametro,
     * y cuando seas un return lo coges, sino lo sigues pasando
     *
     * @param node
     * @param p
     * @return
     */
    @Override
    public Void visit(FunctionDefinition node, Type p) {
        return super.visit(node,  node.getType());

    }

    @Override
    public Void visit(FunctionType node, Type p) {
        node.getType().accept(this, p);
        for (Definition definition : node.getDefinitions()) {
            definition.accept(this, p);
        }
        return null;
    }

    @Override
    public Void visit(FunctionInvocation node, Type p) {

        node.getVariable().accept(this, p);
        for (Expression expression : node.getExpressionList()) {
            expression.accept(this, p);
        }
        node.setType(node.getVariable().getType().parentherisis(node.getExpressionList(), node));
        return null;
    }

    @Override
    public Void visit(Procediment node, Type p) {
        node.getVariable().accept(this, p);
        for (Expression expression : node.getExpressions()) {
            expression.accept(this, p);
        }
        node.getVariable().getType().parentherisis(node.getExpressions(), node);
        return null;
    }


    @Override
    public Void visit(Return node, Type p) {
        node.getExpression().accept(this, p);
        p.promotesTo( node.getExpression().getType(),node);
       // node.getExpression().getType().promotesTo( p, node);
        return null;
    }

    @Override
    public Void visit(CharLiteral node, Type p) {
        node.setLValue(false);
        node.setType(new CharType());
        return null;
    }

    @Override
    public Void visit(IntLiteral node, Type p) {
        node.setLValue(false);
        node.setType(new IntType());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral node, Type p) {
        node.setLValue(false);
        node.setType(new DoubleType());
        return null;
    }

    @Override
    public Void visit(Assigment node, Type p) {
        node.getLeft().accept(this, p);
        node.getRight().accept(this, p);

        if (!node.getLeft().getLValue())
            new ErrorType(node.getLine(), node.getColumn(), "Se esperaba LValue");

        node.getLeft().getType().promotesTo(node.getRight().getType(), node);
        return null;
    }




    @Override
    public Void visit(Input node, Type p) {
        for (Expression e : node.getExpressionList()) {
            e.accept(this,p);
        }
        for (Expression e : node.getExpressionList()) {
            if (!e.getLValue())
                new ErrorType(node.getLine(), node.getColumn(), "Se esperaba LValue");
        }
        return null;
    }

    @Override
    public Void visit(Variable node, Type p) {
        node.setLValue(true);
        node.setType(node.getDefinition().getType());

        return null;
    }

    @Override
    public Void visit(If node, Type p) {

        node.getExpression().accept(this, p);

        if (!node.getExpression().getType().isLogical())
            new ErrorType(node.getLine(), node.getColumn(), "La condicion tiene que ser de tipo logico");
        for (Statement statement : node.getStatementList()) {
            statement.accept(this, p);
        }
        for (Statement statement : node.getStatementListElse()) {
            statement.accept(this, p);
        }

        return null;
    }

    @Override
    public Void visit(While node, Type p) {
        node.getExpression().accept(this, p);
        if (!node.getExpression().getType().isLogical())
            new ErrorType(node.getLine(), node.getColumn(), "La condicion tiene que ser de tipo logico");
        for (Statement statement : node.getStatementList()) {
            statement.accept(this, p);
        }
        return null;
    }

    @Override
    public Void visit(Arithmetic node, Type p) {
        node.getLeft().accept(this, p);
        node.getRigth().accept(this, p);

        node.setType(node.getLeft().getType().arithmetic(node.getRigth().getType(), node));
        node.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparason node, Type p) {
        node.getLeft().accept(this, p);
        node.getRigth().accept(this, p);

        node.setType(node.getLeft().getType().comparason(node.getRigth().getType(), node));
        return null;
    }

    @Override
    public Void visit(Cast node, Type p) {
        node.getTypeCast().accept(this,p);
        node.getExpression().accept(this,p);
        node.setType(node.getExpression().getType().canBeCast(node.getTypeCast(),node));
        return null;
    }
    @Override
    public Void visit(Logical node, Type p) {
        node.getLeft().accept(this, p);
        node.getRigth().accept(this, p);
        node.setType(node.getLeft().getType().logical(node.getRigth().getType(), node));
        return null;
    }


    @Override
    public Void visit(UnaryMinus node, Type p) {
        node.getExpression().accept(this, p);
        node.setType(node.getExpression().getType().arithmetic(node));
        return null;
    }

    @Override
    public Void visit(Not node, Type p) {
        node.getExpression().accept(this, p);
        node.setType(node.getExpression().getType().logical(node));
        return null;
    }


    @Override
    public Void visit(FieldAccess node, Type p) {
        node.getExpression().accept(this,p);
        node.setLValue(true);
        node.setType(node.getExpression().getType().dot(node.getField(), node));
        System.out.println(node.getExpression().getType() + " "+node.getLine());
        System.out.println(p + " "+node.getLine());
        System.out.println(node.getType() + " "+node.getLine());
        return null;
    }


    @Override
    public Void visit(ArrayAcess node, Type p) {
        node.setLValue(true);
        node.getLeft().accept(this, p);
        node.getRigth().accept(this, p);
        node.setType(node.getLeft().getType().squareBrakets(node.getRigth().getType(), node));
        return null;
    }

    @Override
    public Void visit(RecordType node, Type p) {
        for (RecordField field : node.getFields()) {
            field.accept(this, p);
        }

        return null;
    }

}
