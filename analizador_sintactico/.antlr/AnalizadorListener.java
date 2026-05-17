// Generated from c:/Users/Milena/OneDrive/Desktop/analizador_sintactico/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnalizadorParser}.
 */
public interface AnalizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AnalizadorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AnalizadorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(AnalizadorParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(AnalizadorParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AnalizadorParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AnalizadorParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#caseSection}.
	 * @param ctx the parse tree
	 */
	void enterCaseSection(AnalizadorParser.CaseSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#caseSection}.
	 * @param ctx the parse tree
	 */
	void exitCaseSection(AnalizadorParser.CaseSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#defaultSection}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSection(AnalizadorParser.DefaultSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#defaultSection}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSection(AnalizadorParser.DefaultSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AnalizadorParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AnalizadorParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(AnalizadorParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(AnalizadorParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnalizadorParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(AnalizadorParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnalizadorParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(AnalizadorParser.ConstantContext ctx);
}