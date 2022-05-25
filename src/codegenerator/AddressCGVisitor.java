package codegenerator;

import ast.Expressions.ArrayAcess;
import ast.Expressions.FieldAccess;
import ast.Expressions.Variable;
import ast.Types.RecordType;

public class AddressCGVisitor   extends AbstractErrorVisitor<Void, Void>{

    private ValueCGVisitor valueCGVisitor;

    private CodeGenerator codeGenerator;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }


    /**
     * dirección[[Variable:expression->ID]]()=
     *     if(expression.definition.scope==0)
     *         <pusha> expression.definition.offset
     *     else
     *         <pushi> expression.definition.offset
     *         <push bp>
     *         <addi>
     */
    @Override
    public Void visit(Variable e, Void value) {
        if (e.getDefinition().getScope() == 0) {
            codeGenerator.pushA( e.getDefinition().getOffset());
        } else {
            codeGenerator.pushBP();
            codeGenerator.pushI(e.getDefinition().getOffset());
            codeGenerator.addI();
        }
        return null;
    }


    /**
     *
     *   dirección[[fieldAccess:expression -> Variable:var]]()=
     *     dirección[[var]]
     *     <pushi> ID.offset
     *     <addi>
     *
     */
    @Override
    public Void visit(FieldAccess e, Void value) {
        e.getExpression().accept(this, value);
        codeGenerator.pushBP();
        RecordType type = (RecordType) e.getType();
        type.getMemoryBytesForField(e.getField());
        codeGenerator.pushI(type.getMemoryBytesForField(e.getField()));
        codeGenerator.addI();
        return null;
    }
    /**
     * dirección[[arrayAccess:expression -> Variable:var Expression:location]]
     *     value[[location]]
     *     <pushi> a.getType.size();
     *     <muli>
     *     address[[var]]
     *     <add>
     */
    @Override
    public Void visit(ArrayAcess e, Void value) {
        e.getRigth().accept(valueCGVisitor, value);
        codeGenerator.pushI(e.getType().getMemoryBytes());
        codeGenerator.mult();
        e.getLeft().accept(this, value);
        //todo
        codeGenerator.addI();
        return null;
    }

}
