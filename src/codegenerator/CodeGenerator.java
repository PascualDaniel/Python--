package codegenerator;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    private int labelCounter;


    public CodeGenerator(String outputFileName, String sourceFilename) throws FileNotFoundException {

        try{
            this.out = new PrintWriter(outputFileName);
        }catch (Error e){

        }

    }

    public int getLabel(){
        labelCounter++;
        return labelCounter;
    }


    public void pushBP(){
        out.println("\tpush\tbp");
        out.flush();
    }
    public void push(char constant){
        out.println("\tpush\t"+(int)constant);
        out.flush();
    }
    public void out(char suffix){
        out.println("\tout\t"+(int)suffix);
        out.flush();
    }
    public void in(char suffix){
        out.println("\tin\t"+(int)suffix);
        out.flush();
    }
    public void store(char suffix){
        out.println("\tstore\t"+(int)suffix);
        out.flush();
    }
    public void load(char suffix){
        out.println("\tload\t"+(int)suffix);
        out.flush();
    }
    public void pushA(int offset){
        out.println("\tpusha\t"+offset);
        out.flush();
    }
    public void pushI(int offset){
        out.println("\tpusha\t"+offset);
        out.flush();
    }
    public void addI(){
        out.println("\taddi\t");
        out.flush();
    }

    public void enter(int offset) {
        out.println("\tenter\t"+offset);
        out.flush();
    }

    public void label( int counter) {
        out.println("\tLabel_"+counter+":\t");
        out.flush();
    }

    public void jz(int offset) {
        out.println("\tjz Label_"+offset+"\t");
        out.flush();
    }

    public void jmp(int offset) {
        out.println("\tjmp Label_"+offset+"\t");
        out.flush();
    }

    public void main() {
        out.println("\tCall Main\t");
        out.flush();
    }

    public void halt() {
        out.println("\thalt\t");
        out.flush();
    }
}
