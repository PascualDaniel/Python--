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
     *   dirección[[fieldAccess:expression -> Variable:var ID]]()=
     *     dirección[[var]]
     *     <pushi> ID.offset
     *     <addi>
     *
     */
    @Override
    public Void visit(FieldAccess e, Void value) {
        e.getExpression().accept(this, value);

        if(  e.getExpression().getType() instanceof RecordType){

            RecordType type = (RecordType) e.getExpression().getType();
            type.getMemoryBytesForField(e.getField());
            codeGenerator.pushI(type.getMemoryBytesForField(e.getField()));
        }else{
            codeGenerator.pushI(0);
        }
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
        e.getLeft().accept(this, value);
        e.getRigth().accept(valueCGVisitor, value);

        codeGenerator.pushI(e.getType().getMemoryBytes());
        codeGenerator.mult('i');
        //todo
        codeGenerator.addI();
        return null;
    }

}
