// Generated from c:/Users/Milena/OneDrive/Desktop/analizador_sintactico/Analizador.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';

// This class defines a complete generic visitor for a parse tree produced by AnalizadorParser.

export default class AnalizadorVisitor extends antlr4.tree.ParseTreeVisitor {

	// Visit a parse tree produced by AnalizadorParser#program.
	visitProgram(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#simpleStatement.
	visitSimpleStatement(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#switchStatement.
	visitSwitchStatement(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#caseSection.
	visitCaseSection(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#defaultSection.
	visitDefaultSection(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#assignmentStatement.
	visitAssignmentStatement(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#outputStatement.
	visitOutputStatement(ctx) {
	  return this.visitChildren(ctx);
	}


	// Visit a parse tree produced by AnalizadorParser#constant.
	visitConstant(ctx) {
	  return this.visitChildren(ctx);
	}



}