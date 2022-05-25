import codegenerator.CodeGenerator;
import codegenerator.ExecuteCGVisitor;
import codegenerator.OffsetVisitor;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import errorhandler.EH;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		Program ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);

		ast.accept(new TypeCheckingVisitor(),null);

		// * Check errors 
		if(EH.getEH().hasErrors()){
			// * Show errors

			EH.getEH().showErrors(System.err);

		}
		else{
			ast.accept(new OffsetVisitor<>(),null);
			CodeGenerator cg = new CodeGenerator(args[1],args[0]);
			ast.accept(new ExecuteCGVisitor(cg),null);
			// * The AST is shown
		//	IntrospectorModel model=new IntrospectorModel("Program", ast);
		//	new IntrospectorTree("Introspector", model);
		}		
	}
}
