package codegenerator;

import ast.Definitions.VarDefinition;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    private int labelCounter;


    public CodeGenerator(String outputFileName, String sourceFilename) throws FileNotFoundException {

        try{
            this.out = new PrintWriter(outputFileName);
            out.println("#source " + '"' + sourceFilename + '"');
            out.flush();
        }catch (Error e){

        }

    }

    public int getLabel(){
        labelCounter++;
        return labelCounter;
    }

    public void funcDef(String name){
        out.println(name+":"+"\t");
        out.flush();
    }


    public void pushBP(){
        out.println("\tpush\tbp");
        out.flush();
    }
    public void push(char suffix, int value){
        out.println("\tpush"+suffix+"\t"+value);
        out.flush();
    }
    public void push(char suffix, double value){
        out.println("\tpush"+suffix+"\t"+value);
        out.flush();
    }
    public void out(char suffix){
        out.println("\tout"+suffix);
        out.flush();
    }
    public void in(char suffix){
        out.println("\tin"+suffix);
        out.flush();
    }
    public void store(char suffix){
        out.println("\tstore"+suffix);
        out.flush();
    }
    public void load(char suffix){
        out.println("\tload"+suffix);
        out.flush();
    }
    public void pushA(int offset){
        out.println("\tpusha\t"+offset);
        out.flush();
    }
    public void pushI(int offset){
        out.println("\tpushi\t"+offset);
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
        out.println("\tCall main\t");
        out.flush();
    }

    public void halt() {
        out.println("\thalt\t");
        out.flush();
    }
    public void mult(char suffix){
        out.println("\tmul"+suffix+"\t");
        out.flush();
    }

    public void pop(char suffix) {
        out.println("\tpop"+suffix+"\t");
        out.flush();
    }

    public void ret(int memoryBytes, int localVarBytes, int memoryBytes1) {
        out.println("\tret"+"\t"+memoryBytes+","+localVarBytes+","+memoryBytes1);
        out.flush();
    }

    public void varDefComment(VarDefinition node) {
        out.println("\t' * " + node.getType() + " " + node.getName() + " ( offset " + node.getOffset() + ")");
        out.flush();
    }

    public void call(String name) {
        out.println("\tcall\t"+name);
        out.flush();
    }

    public void sub(char suffix) {
        out.println("\tsub"+suffix+"\t");
        out.flush();
    }

    public void add(char suffix) {
        out.println("\tadd"+suffix+"\t");
        out.flush();
    }

    public void div(char suffix) {
        out.println("\tdiv"+suffix+"\t");
        out.flush();
    }

    public void promotesTo(char suffix, char suffix1) {
        if(suffix != suffix1){
            if(suffix=='f' && suffix1=='b'){
                out.println("\tf2i\t");
                out.println("\ti2b\t");
                out.flush();
            }
            else if(suffix=='b' && suffix1=='f'){
                out.println("\tb2i\t");
                out.println("\ti2f\t");
                out.flush();
            }
            else{
                out.println("\t"+suffix+"2"+suffix1+"\t");
                out.flush();
            }
        }

    }

    public void gt(char suffix) {
        out.println("\tgt"+suffix+"\t");
        out.flush();
    }
    public void ge(char suffix) {
        out.println("\tge"+suffix+"\t");
        out.flush();
    }
    public void le(char suffix) {
        out.println("\tle"+suffix+"\t");
        out.flush();
    }

    public void lt(char suffix) {
        out.println("\tlt"+suffix+"\t");
        out.flush();
    }

    public void ne(char suffix) {
        out.println("\tne"+suffix+"\t");
        out.flush();
    }

    public void eq(char suffix) {
        out.println("\teq"+suffix+"\t");
        out.flush();
    }

    public void and() {
        out.println("\tand\t");
        out.flush();
    }
    public void or() {
        out.println("\tor\t");
        out.flush();
    }

    public void not() {
        out.println("\tnot\t");
        out.flush();
    }

    public void comment(String s) {
        out.println("\t' * "+s);
        out.flush();
    }

    public void commentInfo(String s) {
        out.println("#line "+s);
        out.flush();
    }
}
