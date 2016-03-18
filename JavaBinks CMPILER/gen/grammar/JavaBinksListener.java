// Generated from /Users/hannah/Documents/IntelliJ Path/JavaBinks CMPILER/src/grammar/JavaBinks.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaBinksParser}.
 */
public interface JavaBinksListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(JavaBinksParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(JavaBinksParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(JavaBinksParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(JavaBinksParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaBinksParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 */
	void enterSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#specialOperator}.
	 * @param ctx the parse tree
	 */
	void exitSpecialOperator(JavaBinksParser.SpecialOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(JavaBinksParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaBinksParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 */
	void enterSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#specialValue}.
	 * @param ctx the parse tree
	 */
	void exitSpecialValue(JavaBinksParser.SpecialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaBinksParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 */
	void enterMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#multiDec}.
	 * @param ctx the parse tree
	 */
	void exitMultiDec(JavaBinksParser.MultiDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 */
	void enterSingleDec(JavaBinksParser.SingleDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBinksParser#singleDec}.
	 * @param ctx the parse tree
	 */
	void exitSingleDec(JavaBinksParser.SingleDecContext ctx);
}