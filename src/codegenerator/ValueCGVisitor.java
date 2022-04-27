package codegenerator;

import ast.Expressions.Variable;

public class ValueCGVisitor  <TP, TR> extends AbstractErrorVisitor<TP, TR>{


    private AddressCGVisitor<TP,TR> addressCGVisitor;

    private CodeGenerator codeGenerator;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor<TP, TR> addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }


    /**
     * Value[[Variable: expression -> ID]]()=
     * 	ADRRESS[[expression]]
     * 	<LOAD>expression.type.suffix()
     */
    @Override
    public TR visit(Variable node, TP p) {
        node.accept(addressCGVisitor, p);
        codeGenerator.load(node.getDefinition().getType().suffix());
        return null;
    }

}
