// Generated from D:/Clase/DLP/Proyecto/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.*;
import ast.Expressions.*;
import ast.Statements.*;
import ast.Definitions.*;
import ast.Types.*;
import java.util.ArrayList;
import java.util.LinkedList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PmmParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(PmmParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#variable_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_definition(PmmParser.Variable_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#if_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statements(PmmParser.If_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statemets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatemets(PmmParser.StatemetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PmmParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(PmmParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
}