// Generated from D:/Clase/DLP/Proyecto/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Definitions.*;
import ast.Types.*;
import java.util.ArrayList;
import java.util.LinkedList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		TRUE_CONSTANT=39, FALSE_CONSTANT=40, CHAR_CONSTANT=41, ID=42, INT_CONSTANT=43, 
		REAL_CONSTANT=44, WS=45, TRASH=46;
	public static final int
		RULE_program = 0, RULE_parameters = 1, RULE_function_definition = 2, RULE_main = 3, 
		RULE_variable_definition = 4, RULE_statement = 5, RULE_if_statements = 6, 
		RULE_statemets = 7, RULE_expression = 8, RULE_expressions = 9, RULE_simple_type = 10, 
		RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "parameters", "function_definition", "main", "variable_definition", 
			"statement", "if_statements", "statemets", "expression", "expressions", 
			"simple_type", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'def'", "'('", "')'", "'{'", "'}'", "'main'", "';'", 
			"'print'", "'input'", "'return'", "'='", "'if'", "'else'", "'while'", 
			"'['", "']'", "'.'", "'!'", "'-'", "'*'", "'/'", "'%'", "'+'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'int'", "'double'", 
			"'char'", "'boolean'", "'struct'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TRUE_CONSTANT", "FALSE_CONSTANT", "CHAR_CONSTANT", 
			"ID", "INT_CONSTANT", "REAL_CONSTANT", "WS", "TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public Variable_definitionContext var1;
		public Function_definitionContext func1;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> definiciones= new LinkedList<Definition>();
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(31);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(25);
						((ProgramContext)_localctx).var1 = variable_definition();
						definiciones.addAll(((ProgramContext)_localctx).var1.ast);
						}
						break;
					case T__2:
						{
						setState(28);
						((ProgramContext)_localctx).func1 = function_definition();
						definiciones.add(((ProgramContext)_localctx).func1.ast );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			((ProgramContext)_localctx).main = main();
			definiciones.add(((ProgramContext)_localctx).main.ast  );
			((ProgramContext)_localctx).ast =  new Program(definiciones);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<VarDefinition> ast = new LinkedList<VarDefinition>();
		public Token ID;
		public Simple_typeContext simple_type;
		public ParametersContext parameters;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameters);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				((ParametersContext)_localctx).ID = match(ID);
				setState(41);
				match(T__0);
				setState(42);
				((ParametersContext)_localctx).simple_type = simple_type();
				_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).ID.getLine(),((ParametersContext)_localctx).ID.getCharPositionInLine()+1,(((ParametersContext)_localctx).ID!=null?((ParametersContext)_localctx).ID.getText():null),((ParametersContext)_localctx).simple_type.ast));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(45);
				((ParametersContext)_localctx).ID = match(ID);
				setState(46);
				match(T__0);
				setState(47);
				((ParametersContext)_localctx).simple_type = simple_type();
				_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).ID.getLine(),((ParametersContext)_localctx).ID.getCharPositionInLine()+1,(((ParametersContext)_localctx).ID!=null?((ParametersContext)_localctx).ID.getText():null),((ParametersContext)_localctx).simple_type.ast));
				setState(49);
				match(T__1);
				setState(50);
				((ParametersContext)_localctx).parameters = parameters();
				_localctx.ast.addAll(((ParametersContext)_localctx).parameters.ast);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Definition ast;
		public Token id1;
		public ParametersContext p1;
		public Simple_typeContext simple_type;
		public Variable_definitionContext v1;
		public StatementContext s1;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			((Function_definitionContext)_localctx).id1 = match(ID);
			setState(57);
			match(T__3);
			List<VarDefinition> list = new ArrayList<VarDefinition>();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(59);
				((Function_definitionContext)_localctx).p1 = parameters();
				list.addAll(((Function_definitionContext)_localctx).p1.ast);
				}
			}

			setState(64);
			match(T__4);
			setState(65);
			match(T__0);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) {
				{
				setState(66);
				((Function_definitionContext)_localctx).simple_type = simple_type();
				}
			}

			setState(69);
			match(T__5);
			List<Definition> list2 = new ArrayList<Definition>();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					((Function_definitionContext)_localctx).v1 = variable_definition();
					list2.addAll(((Function_definitionContext)_localctx).v1.ast);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			List<Statement> list3 = new ArrayList<Statement>();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << TRUE_CONSTANT) | (1L << FALSE_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(80);
				((Function_definitionContext)_localctx).s1 = statement();
				list3.add(((Function_definitionContext)_localctx).s1.ast);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__6);
			((Function_definitionContext)_localctx).ast =  new FunctionDefinition(
			                                     ((Function_definitionContext)_localctx).id1.getLine(),
			                                     ((Function_definitionContext)_localctx).id1.getCharPositionInLine()+1,
			                                     (((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null),
			                                        new FunctionType((_localctx.simple_type != null ? ((Function_definitionContext)_localctx).simple_type.ast : new VoidType()),
			                                        list),
			                                        list2,list3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public Definition ast;
		public Variable_definitionContext var1;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			match(T__7);
			setState(93);
			match(T__3);
			setState(94);
			match(T__4);
			setState(95);
			match(T__0);
			setState(96);
			match(T__5);
			List<Definition> definiciones= new LinkedList<Definition>();
			                                        
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					((MainContext)_localctx).var1 = variable_definition();
					definiciones.addAll(((MainContext)_localctx).var1.ast  );
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			List<Statement> sentencias = new LinkedList<Statement>();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << TRUE_CONSTANT) | (1L << FALSE_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(107);
				((MainContext)_localctx).statement = statement();
				sentencias.add(((MainContext)_localctx).statement.ast);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MainContext)_localctx).ast =  new FunctionDefinition(
			                                                    _localctx.start.getLine(),
			                                                    _localctx.start.getCharPositionInLine()+1,
			                                                    "main",
			                                                    new FunctionType(
			                                                                     new VoidType(),
			                                                                     new ArrayList<VarDefinition>()),
			                                                    definiciones,
			                                                    sentencias
			                                                    );
			setState(116);
			match(T__6);
			setState(117);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_definitionContext extends ParserRuleContext {
		public List<Definition> ast;
		public Token id1;
		public Token id2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((Variable_definitionContext)_localctx).ast =  new ArrayList<Definition>();
			List<String> ids = new ArrayList<String>();
			setState(121);
			((Variable_definitionContext)_localctx).id1 = match(ID);
			ids.add((((Variable_definitionContext)_localctx).id1!=null?((Variable_definitionContext)_localctx).id1.getText():null));
			_localctx.ast.add(new VarDefinition(((Variable_definitionContext)_localctx).id1.getLine(),((Variable_definitionContext)_localctx).id1.getCharPositionInLine()+1,(((Variable_definitionContext)_localctx).id1!=null?((Variable_definitionContext)_localctx).id1.getText():null),null));
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(124);
				match(T__1);
				setState(125);
				((Variable_definitionContext)_localctx).id2 = match(ID);
				if(ids.contains((((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null)))
				                    new ErrorType(((Variable_definitionContext)_localctx).id2.getLine(),((Variable_definitionContext)_localctx).id2.getCharPositionInLine()+1,"Variable Repetida");
				                 else
				                    ids.add((((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null));
				                 
				_localctx.ast.add(new VarDefinition(((Variable_definitionContext)_localctx).id2.getLine(),((Variable_definitionContext)_localctx).id2.getCharPositionInLine()+1,(((Variable_definitionContext)_localctx).id2!=null?((Variable_definitionContext)_localctx).id2.getText():null),null));
				      
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__0);
			setState(134);
			((Variable_definitionContext)_localctx).type = type();
			setState(135);
			match(T__8);
			for(Definition d :_localctx.ast){
			   d.setType(((Variable_definitionContext)_localctx).type.ast);
			   }
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public Token PRINT;
		public ExpressionsContext exs;
		public Token INPUT;
		public Token RETURN;
		public ExpressionContext ex;
		public ExpressionContext op1;
		public ExpressionContext op2;
		public Token ID;
		public Token IF;
		public If_statementsContext st1;
		public If_statementsContext st2;
		public Token WHILE;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<If_statementsContext> if_statements() {
			return getRuleContexts(If_statementsContext.class);
		}
		public If_statementsContext if_statements(int i) {
			return getRuleContext(If_statementsContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((StatementContext)_localctx).PRINT = match(T__9);
				setState(139);
				((StatementContext)_localctx).exs = expressions();
				setState(140);
				match(T__8);
				((StatementContext)_localctx).ast = new Print(((StatementContext)_localctx).PRINT.getLine(),((StatementContext)_localctx).PRINT.getCharPositionInLine()+1,((StatementContext)_localctx).exs.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((StatementContext)_localctx).INPUT = match(T__10);
				setState(144);
				((StatementContext)_localctx).exs = expressions();
				setState(145);
				match(T__8);
				((StatementContext)_localctx).ast =  new Input(((StatementContext)_localctx).INPUT.getLine(),((StatementContext)_localctx).INPUT.getCharPositionInLine()+1,((StatementContext)_localctx).exs.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((StatementContext)_localctx).RETURN = match(T__11);
				setState(149);
				((StatementContext)_localctx).ex = expression(0);
				setState(150);
				match(T__8);
				((StatementContext)_localctx).ast = new Return(((StatementContext)_localctx).RETURN.getLine(),((StatementContext)_localctx).RETURN.getCharPositionInLine()+1,((StatementContext)_localctx).ex.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				((StatementContext)_localctx).op1 = expression(0);
				setState(154);
				match(T__12);
				setState(155);
				((StatementContext)_localctx).op2 = expression(0);
				setState(156);
				match(T__8);
				((StatementContext)_localctx).ast = new Assigment(
				                     ((StatementContext)_localctx).op1.ast.getLine(),
				                     ((StatementContext)_localctx).op1.ast.getColumn()+1,
				                     ((StatementContext)_localctx).op1.ast,((StatementContext)_localctx).op2.ast
				                     );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				((StatementContext)_localctx).ID = match(ID);
				setState(160);
				match(T__3);
				setState(161);
				match(T__4);
				setState(162);
				match(T__8);
				((StatementContext)_localctx).ast =  new Procediment(((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1,
				                     new Variable(((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				((StatementContext)_localctx).ID = match(ID);
				setState(165);
				match(T__3);
				 List<Expression> expresions = new LinkedList<Expression>();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << TRUE_CONSTANT) | (1L << FALSE_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(167);
					((StatementContext)_localctx).exs = expressions();
					expresions = ((StatementContext)_localctx).exs.ast;
					}
				}

				setState(172);
				match(T__4);
				setState(173);
				match(T__8);
				((StatementContext)_localctx).ast =  new Procediment(((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1,
				                     expresions,
				                     new Variable(((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				((StatementContext)_localctx).IF = match(T__13);
				setState(176);
				((StatementContext)_localctx).ex = expression(0);
				setState(177);
				match(T__0);
				{
				setState(178);
				((StatementContext)_localctx).st1 = if_statements();
				}
				((StatementContext)_localctx).ast =  new If(((StatementContext)_localctx).IF.getLine(),((StatementContext)_localctx).IF.getCharPositionInLine()+1,((StatementContext)_localctx).ex.ast,((StatementContext)_localctx).st1.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				((StatementContext)_localctx).IF = match(T__13);
				setState(182);
				((StatementContext)_localctx).ex = expression(0);
				setState(183);
				match(T__0);
				{
				setState(184);
				((StatementContext)_localctx).st1 = if_statements();
				}
				{
				setState(185);
				match(T__14);
				{
				setState(186);
				((StatementContext)_localctx).st2 = if_statements();
				}
				}
				((StatementContext)_localctx).ast =  new If(((StatementContext)_localctx).IF.getLine(),((StatementContext)_localctx).IF.getCharPositionInLine()+1,((StatementContext)_localctx).ex.ast,((StatementContext)_localctx).st1.ast,((StatementContext)_localctx).st2.ast);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190);
				((StatementContext)_localctx).WHILE = match(T__15);
				setState(191);
				((StatementContext)_localctx).ex = expression(0);
				setState(192);
				match(T__0);
				setState(193);
				((StatementContext)_localctx).st1 = if_statements();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).WHILE.getLine(),((StatementContext)_localctx).WHILE.getCharPositionInLine()+1,((StatementContext)_localctx).ex.ast,((StatementContext)_localctx).st1.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementsContext extends ParserRuleContext {
		public List<Statement> ast = new LinkedList<Statement>();
		public StatemetsContext sts;
		public StatementContext statement;
		public StatemetsContext statemets() {
			return getRuleContext(StatemetsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIf_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementsContext if_statements() throws RecognitionException {
		If_statementsContext _localctx = new If_statementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statements);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(198);
				match(T__5);
				setState(199);
				((If_statementsContext)_localctx).sts = statemets();
				_localctx.ast.addAll(((If_statementsContext)_localctx).sts.ast);
				setState(201);
				match(T__6);
				}
				}
				break;
			case T__3:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__15:
			case T__19:
			case T__20:
			case TRUE_CONSTANT:
			case FALSE_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(203);
				((If_statementsContext)_localctx).statement = statement();
				_localctx.ast.add(((If_statementsContext)_localctx).statement.ast);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatemetsContext extends ParserRuleContext {
		public List<Statement> ast;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatemetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statemets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatemets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatemetsContext statemets() throws RecognitionException {
		StatemetsContext _localctx = new StatemetsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statemets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StatemetsContext)_localctx).ast =  new LinkedList<Statement>();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << TRUE_CONSTANT) | (1L << FALSE_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(209);
				((StatemetsContext)_localctx).statement = statement();
				_localctx.ast.add(((StatemetsContext)_localctx).statement.ast);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext op1;
		public ExpressionContext ex;
		public Token TRUE;
		public Token FALSE;
		public Token ID;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public ExpressionsContext exs;
		public Token CAST;
		public TypeContext t;
		public Token NOT;
		public ExpressionContext op;
		public Token MINUS;
		public Token OP;
		public ExpressionContext op2;
		public TerminalNode TRUE_CONSTANT() { return getToken(PmmParser.TRUE_CONSTANT, 0); }
		public TerminalNode FALSE_CONSTANT() { return getToken(PmmParser.FALSE_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(218);
				((ExpressionContext)_localctx).TRUE = match(TRUE_CONSTANT);
				((ExpressionContext)_localctx).ast =  new BooleanLiteral(((ExpressionContext)_localctx).TRUE.getLine(),((ExpressionContext)_localctx).TRUE.getCharPositionInLine()+1
				                                             ,1);
				}
				break;
			case 2:
				{
				setState(220);
				((ExpressionContext)_localctx).FALSE = match(FALSE_CONSTANT);
				((ExpressionContext)_localctx).ast =  new BooleanLiteral(((ExpressionContext)_localctx).FALSE.getLine(),((ExpressionContext)_localctx).FALSE.getCharPositionInLine()+1
				                                                      ,0);
				}
				break;
			case 3:
				{
				setState(222);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
				}
				break;
			case 4:
				{
				setState(224);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1
				                                  ,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null) ));
				}
				break;
			case 5:
				{
				setState(226);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1
				                                  ,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null) ));
				}
				break;
			case 6:
				{
				setState(228);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1
				                                  ,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null) ));
				}
				break;
			case 7:
				{
				setState(230);
				match(T__3);
				setState(231);
				((ExpressionContext)_localctx).ex = expression(0);
				setState(232);
				match(T__4);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).ex.ast;
				}
				break;
			case 8:
				{
				setState(235);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(236);
				match(T__3);
				 List<Expression> expresions = new LinkedList<Expression>();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << TRUE_CONSTANT) | (1L << FALSE_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(238);
					((ExpressionContext)_localctx).exs = expressions();
					expresions = ((ExpressionContext)_localctx).exs.ast;
					}
				}

				setState(243);
				match(T__4);

				                        ((ExpressionContext)_localctx).ast =  new FunctionInvocation(
				                        ((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                                                                           expresions,
				                        new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null))
				                        );
				}
				break;
			case 9:
				{
				setState(245);
				((ExpressionContext)_localctx).CAST = match(T__3);
				setState(246);
				((ExpressionContext)_localctx).t = type();
				setState(247);
				match(T__4);
				setState(248);
				((ExpressionContext)_localctx).ex = expression(9);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).CAST.getLine(),((ExpressionContext)_localctx).CAST.getCharPositionInLine()+1,((ExpressionContext)_localctx).t.ast,((ExpressionContext)_localctx).ex.ast );
				}
				break;
			case 10:
				{
				setState(251);
				((ExpressionContext)_localctx).NOT = match(T__19);
				setState(252);
				((ExpressionContext)_localctx).op = expression(8);
				((ExpressionContext)_localctx).ast =  new Not(((ExpressionContext)_localctx).NOT.getLine(),((ExpressionContext)_localctx).NOT.getCharPositionInLine()+1,((ExpressionContext)_localctx).op.ast );
				}
				break;
			case 11:
				{
				setState(255);
				((ExpressionContext)_localctx).MINUS = match(T__20);
				setState(256);
				((ExpressionContext)_localctx).op = expression(7);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).MINUS.getLine(),((ExpressionContext)_localctx).MINUS.getCharPositionInLine()+1,((ExpressionContext)_localctx).op.ast );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(262);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						((ExpressionContext)_localctx).op2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                  ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                  ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                  ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                  );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(267);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__24) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						((ExpressionContext)_localctx).op2 = expression(6);
						((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                   ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                   ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                   ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                   );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						((ExpressionContext)_localctx).op2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Comparason(
						                                    ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                    ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                    );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						((ExpressionContext)_localctx).op2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Comparason(
						                                    ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                    ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                    );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						((ExpressionContext)_localctx).OP = match(T__31);
						setState(283);
						((ExpressionContext)_localctx).op2 = expression(3);
						((ExpressionContext)_localctx).ast =  new Logical(
						                                    ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                    ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                    );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(287);
						((ExpressionContext)_localctx).OP = match(T__32);
						setState(288);
						((ExpressionContext)_localctx).op2 = expression(2);
						((ExpressionContext)_localctx).ast =  new Logical(
						                                    ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                    ((ExpressionContext)_localctx).op1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).op2.ast
						                                    );
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(292);
						match(T__16);
						setState(293);
						((ExpressionContext)_localctx).op2 = expression(0);
						setState(294);
						match(T__17);
						((ExpressionContext)_localctx).ast =  new ArrayAcess(
						                                   ((ExpressionContext)_localctx).op1.ast.getLine(),
						                                   ((ExpressionContext)_localctx).op1.ast.getColumn()+1,
						                                   ((ExpressionContext)_localctx).op1.ast,((ExpressionContext)_localctx).op2.ast
						                                   );
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(298);
						match(T__18);
						setState(299);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ex.ast.getLine(),((ExpressionContext)_localctx).ex.ast.getColumn()+1,((ExpressionContext)_localctx).ex.ast ,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast;
		public ExpressionContext op1;
		public ExpressionContext op2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((ExpressionsContext)_localctx).op1 = expression(0);
			((ExpressionsContext)_localctx).ast =  new LinkedList<Expression>();_localctx.ast.add(((ExpressionsContext)_localctx).op1.ast);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(308);
				match(T__1);
				setState(309);
				((ExpressionsContext)_localctx).op2 = expression(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).op2.ast);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_type);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__33);
				((Simple_typeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(T__34);
				((Simple_typeContext)_localctx).ast =  new DoubleType();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__35);
				((Simple_typeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(T__36);
				((Simple_typeContext)_localctx).ast =  new BooleanType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext simple_type;
		public Token id1;
		public Token id2;
		public TypeContext type;
		public Token INT_CONSTANT;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				((TypeContext)_localctx).simple_type = simple_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast;
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(T__37);
				setState(332);
				match(T__5);
				List<RecordField> fields = new LinkedList<RecordField>();
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					List<String> ids = new ArrayList<String>();
					setState(335);
					((TypeContext)_localctx).id1 = match(ID);

					            if(ids.contains((((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null)))
					                new ErrorType(((TypeContext)_localctx).id1.getLine(),((TypeContext)_localctx).id1.getCharPositionInLine()+1,"Variable Repetida");
					            ids.add((((TypeContext)_localctx).id1!=null?((TypeContext)_localctx).id1.getText():null));
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(337);
						match(T__1);
						setState(338);
						((TypeContext)_localctx).id2 = match(ID);

						            if(ids.contains((((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null)))
						               new ErrorType(((TypeContext)_localctx).id2.getLine(),((TypeContext)_localctx).id2.getCharPositionInLine()+1,"Variable Repetida");
						            ids.add((((TypeContext)_localctx).id2!=null?((TypeContext)_localctx).id2.getText():null));
						}
						}
						setState(344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(345);
					match(T__0);
					setState(346);
					((TypeContext)_localctx).type = type();
					setState(347);
					match(T__8);
					for(String id: ids)
					               fields.add(new RecordField(((TypeContext)_localctx).id1.getLine(),((TypeContext)_localctx).id1.getCharPositionInLine()+1,id,((TypeContext)_localctx).type.ast)); 
					 ids = new ArrayList<String>();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(355);
				match(T__6);
				((TypeContext)_localctx).ast =  new RecordType(fields);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(T__16);
				setState(359);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(360);
				match(T__17);
				setState(361);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).type.ast,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0171\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%"+
		"\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\3\4\5\4F\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\4\3\4\7\4V\n"+
		"\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6"+
		"\u0086\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c7"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d1\n\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00d7\n\t\f\t\16\t\u00da\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f4\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0106"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0130\n\n\f\n\16\n\u0133\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u013b\n\13\f\13\16\13\u013e\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0148\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u0157\n\r\f\r\16\r\u015a\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u0162\n\r\r\r\16\r\u0163\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u016f\n\r\3\r\2\3\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\30"+
		"\32\4\2\27\27\33\33\3\2\34\37\3\2 !\2\u0195\2\32\3\2\2\2\4\67\3\2\2\2"+
		"\69\3\2\2\2\b]\3\2\2\2\ny\3\2\2\2\f\u00c6\3\2\2\2\16\u00d0\3\2\2\2\20"+
		"\u00d2\3\2\2\2\22\u0105\3\2\2\2\24\u0134\3\2\2\2\26\u0147\3\2\2\2\30\u016e"+
		"\3\2\2\2\32#\b\2\1\2\33\34\5\n\6\2\34\35\b\2\1\2\35\"\3\2\2\2\36\37\5"+
		"\6\4\2\37 \b\2\1\2 \"\3\2\2\2!\33\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\b\5\2\'(\b\2\1\2()\b\2\1\2)\3"+
		"\3\2\2\2*+\7,\2\2+,\7\3\2\2,-\5\26\f\2-.\b\3\1\2.8\3\2\2\2/\60\7,\2\2"+
		"\60\61\7\3\2\2\61\62\5\26\f\2\62\63\b\3\1\2\63\64\7\4\2\2\64\65\5\4\3"+
		"\2\65\66\b\3\1\2\668\3\2\2\2\67*\3\2\2\2\67/\3\2\2\28\5\3\2\2\29:\7\5"+
		"\2\2:;\7,\2\2;<\7\6\2\2<@\b\4\1\2=>\5\4\3\2>?\b\4\1\2?A\3\2\2\2@=\3\2"+
		"\2\2@A\3\2\2\2AB\3\2\2\2BC\7\7\2\2CE\7\3\2\2DF\5\26\f\2ED\3\2\2\2EF\3"+
		"\2\2\2FG\3\2\2\2GH\7\b\2\2HN\b\4\1\2IJ\5\n\6\2JK\b\4\1\2KM\3\2\2\2LI\3"+
		"\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QW\b\4\1\2RS\5"+
		"\f\7\2ST\b\4\1\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3"+
		"\2\2\2YW\3\2\2\2Z[\7\t\2\2[\\\b\4\1\2\\\7\3\2\2\2]^\7\5\2\2^_\7\n\2\2"+
		"_`\7\6\2\2`a\7\7\2\2ab\7\3\2\2bc\7\b\2\2ci\b\5\1\2de\5\n\6\2ef\b\5\1\2"+
		"fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2"+
		"lr\b\5\1\2mn\5\f\7\2no\b\5\1\2oq\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\5\1\2vw\7\t\2\2wx\7\2\2\3x\t\3\2\2"+
		"\2yz\b\6\1\2z{\b\6\1\2{|\7,\2\2|}\b\6\1\2}\u0084\b\6\1\2~\177\7\4\2\2"+
		"\177\u0080\7,\2\2\u0080\u0081\b\6\1\2\u0081\u0083\b\6\1\2\u0082~\3\2\2"+
		"\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\3\2\2\u0088\u0089\5\30\r\2"+
		"\u0089\u008a\7\13\2\2\u008a\u008b\b\6\1\2\u008b\13\3\2\2\2\u008c\u008d"+
		"\7\f\2\2\u008d\u008e\5\24\13\2\u008e\u008f\7\13\2\2\u008f\u0090\b\7\1"+
		"\2\u0090\u00c7\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\5\24\13\2\u0093"+
		"\u0094\7\13\2\2\u0094\u0095\b\7\1\2\u0095\u00c7\3\2\2\2\u0096\u0097\7"+
		"\16\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\13\2\2\u0099\u009a\b\7\1\2"+
		"\u009a\u00c7\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\17\2\2\u009d\u009e"+
		"\5\22\n\2\u009e\u009f\7\13\2\2\u009f\u00a0\b\7\1\2\u00a0\u00c7\3\2\2\2"+
		"\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5"+
		"\7\13\2\2\u00a5\u00c7\b\7\1\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\6\2\2\u00a8"+
		"\u00ac\b\7\1\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\b\7\1\2\u00ab\u00ad\3"+
		"\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7\7\2\2\u00af\u00b0\7\13\2\2\u00b0\u00c7\b\7\1\2\u00b1\u00b2\7"+
		"\20\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5\16\b\2"+
		"\u00b5\u00b6\b\7\1\2\u00b6\u00c7\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00b9"+
		"\5\22\n\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\7\21\2"+
		"\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\7\1\2\u00bf"+
		"\u00c7\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7"+
		"\3\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\7\1\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u008c\3\2\2\2\u00c6\u0091\3\2\2\2\u00c6\u0096\3\2\2\2\u00c6\u009b\3\2"+
		"\2\2\u00c6\u00a1\3\2\2\2\u00c6\u00a6\3\2\2\2\u00c6\u00b1\3\2\2\2\u00c6"+
		"\u00b7\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c7\r\3\2\2\2\u00c8\u00c9\7\b\2\2"+
		"\u00c9\u00ca\5\20\t\2\u00ca\u00cb\b\b\1\2\u00cb\u00cc\7\t\2\2\u00cc\u00d1"+
		"\3\2\2\2\u00cd\u00ce\5\f\7\2\u00ce\u00cf\b\b\1\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\17\3\2\2\2\u00d2\u00d8\b\t\1"+
		"\2\u00d3\u00d4\5\f\7\2\u00d4\u00d5\b\t\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\21\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\b\n\1\2\u00dc\u00dd\7)\2\2"+
		"\u00dd\u0106\b\n\1\2\u00de\u00df\7*\2\2\u00df\u0106\b\n\1\2\u00e0\u00e1"+
		"\7,\2\2\u00e1\u0106\b\n\1\2\u00e2\u00e3\7-\2\2\u00e3\u0106\b\n\1\2\u00e4"+
		"\u00e5\7.\2\2\u00e5\u0106\b\n\1\2\u00e6\u00e7\7+\2\2\u00e7\u0106\b\n\1"+
		"\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ec\b\n\1\2\u00ec\u0106\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef\7\6"+
		"\2\2\u00ef\u00f3\b\n\1\2\u00f0\u00f1\5\24\13\2\u00f1\u00f2\b\n\1\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\7\7\2\2\u00f6\u0106\b\n\1\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u00f9\5\30\r\2\u00f9\u00fa\7\7\2\2\u00fa\u00fb\5\22\n\13\u00fb\u00fc"+
		"\b\n\1\2\u00fc\u0106\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\22\n\n"+
		"\u00ff\u0100\b\n\1\2\u0100\u0106\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0103"+
		"\5\22\n\t\u0103\u0104\b\n\1\2\u0104\u0106\3\2\2\2\u0105\u00db\3\2\2\2"+
		"\u0105\u00de\3\2\2\2\u0105\u00e0\3\2\2\2\u0105\u00e2\3\2\2\2\u0105\u00e4"+
		"\3\2\2\2\u0105\u00e6\3\2\2\2\u0105\u00e8\3\2\2\2\u0105\u00ed\3\2\2\2\u0105"+
		"\u00f7\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u0131\3\2"+
		"\2\2\u0107\u0108\f\b\2\2\u0108\u0109\t\2\2\2\u0109\u010a\5\22\n\t\u010a"+
		"\u010b\b\n\1\2\u010b\u0130\3\2\2\2\u010c\u010d\f\7\2\2\u010d\u010e\t\3"+
		"\2\2\u010e\u010f\5\22\n\b\u010f\u0110\b\n\1\2\u0110\u0130\3\2\2\2\u0111"+
		"\u0112\f\6\2\2\u0112\u0113\t\4\2\2\u0113\u0114\5\22\n\7\u0114\u0115\b"+
		"\n\1\2\u0115\u0130\3\2\2\2\u0116\u0117\f\5\2\2\u0117\u0118\t\5\2\2\u0118"+
		"\u0119\5\22\n\6\u0119\u011a\b\n\1\2\u011a\u0130\3\2\2\2\u011b\u011c\f"+
		"\4\2\2\u011c\u011d\7\"\2\2\u011d\u011e\5\22\n\5\u011e\u011f\b\n\1\2\u011f"+
		"\u0130\3\2\2\2\u0120\u0121\f\3\2\2\u0121\u0122\7#\2\2\u0122\u0123\5\22"+
		"\n\4\u0123\u0124\b\n\1\2\u0124\u0130\3\2\2\2\u0125\u0126\f\r\2\2\u0126"+
		"\u0127\7\23\2\2\u0127\u0128\5\22\n\2\u0128\u0129\7\24\2\2\u0129\u012a"+
		"\b\n\1\2\u012a\u0130\3\2\2\2\u012b\u012c\f\f\2\2\u012c\u012d\7\25\2\2"+
		"\u012d\u012e\7,\2\2\u012e\u0130\b\n\1\2\u012f\u0107\3\2\2\2\u012f\u010c"+
		"\3\2\2\2\u012f\u0111\3\2\2\2\u012f\u0116\3\2\2\2\u012f\u011b\3\2\2\2\u012f"+
		"\u0120\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\23\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\5\22\n\2\u0135\u013c\b\13\1\2\u0136\u0137\7\4\2\2"+
		"\u0137\u0138\5\22\n\2\u0138\u0139\b\13\1\2\u0139\u013b\3\2\2\2\u013a\u0136"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\25\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7$\2\2\u0140\u0148\b\f\1\2"+
		"\u0141\u0142\7%\2\2\u0142\u0148\b\f\1\2\u0143\u0144\7&\2\2\u0144\u0148"+
		"\b\f\1\2\u0145\u0146\7\'\2\2\u0146\u0148\b\f\1\2\u0147\u013f\3\2\2\2\u0147"+
		"\u0141\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148\27\3\2\2"+
		"\2\u0149\u016f\3\2\2\2\u014a\u014b\5\26\f\2\u014b\u014c\b\r\1\2\u014c"+
		"\u016f\3\2\2\2\u014d\u014e\7(\2\2\u014e\u014f\7\b\2\2\u014f\u0161\b\r"+
		"\1\2\u0150\u0151\b\r\1\2\u0151\u0152\7,\2\2\u0152\u0158\b\r\1\2\u0153"+
		"\u0154\7\4\2\2\u0154\u0155\7,\2\2\u0155\u0157\b\r\1\2\u0156\u0153\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\3\2\2\u015c\u015d\5\30"+
		"\r\2\u015d\u015e\7\13\2\2\u015e\u015f\b\r\1\2\u015f\u0160\b\r\1\2\u0160"+
		"\u0162\3\2\2\2\u0161\u0150\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\t\2\2\u0166"+
		"\u0167\b\r\1\2\u0167\u016f\3\2\2\2\u0168\u0169\7\23\2\2\u0169\u016a\7"+
		"-\2\2\u016a\u016b\7\24\2\2\u016b\u016c\5\30\r\2\u016c\u016d\b\r\1\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0149\3\2\2\2\u016e\u014a\3\2\2\2\u016e\u014d\3\2"+
		"\2\2\u016e\u0168\3\2\2\2\u016f\31\3\2\2\2\31!#\67@ENWir\u0084\u00ac\u00c6"+
		"\u00d0\u00d8\u00f3\u0105\u012f\u0131\u013c\u0147\u0158\u0163\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}