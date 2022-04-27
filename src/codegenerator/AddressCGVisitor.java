package codegenerator;

public class AddressCGVisitor  <TP, TR> extends AbstractErrorVisitor<TP, TR>{

    private ValueCGVisitor<TP,TR> valueCGVisitor;

    private CodeGenerator codeGenerator;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setValueCGVisitor(ValueCGVisitor<TP, TR> valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }
}
