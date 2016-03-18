// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaBinksParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaBinksVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(JavaBinksParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDec(JavaBinksParser.SingleDecContext ctx);
}