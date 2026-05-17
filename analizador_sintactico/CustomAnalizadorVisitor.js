import { Parser } from "antlr4";
import AnalizadorVisitor from "./AnalizadorVisitor.js";
import AnalizadorParser from "./AnalizadorParser.js";

export class CustomAnalizadorVisitor extends AnalizadorVisitor{

    constructor() {
        super();
        this.memory = new Map();   //Declaro una variable de instancia con una memoria temporal para hacer las reducciones
    } 
    
    visitConstant(ctx) {
        if (ctx.NUMBER()) {
            // obtengo el lexema correspondiente al NUMBER que reconocio en el texto y lo convierto a entero.
            return parseInt(ctx.NUMBER().getText());
        } else if (ctx.TEXTLITERAL()) {
            // obtengo el lexema correspondiente al TEXTLITERAL que reconocio en el texto y lo devuelvo como string.
            return ctx.TEXTLITERAL().getText();
        }
        return void 0; //Valor por defecto para constantes no reconocidas
    }

    visitOutputStatement(ctx) {
        const value = ctx.TEXTLITERAL().getText();
        console.log(`\nResultado: ${value}`);
        return value;
    }

    visitAssignmentStatement(ctx) {
        const id = ctx.IDENTIFIER().getText();
        const value = this.visit(ctx.constant());
        this.memory.set(id, value);
        return value;
    }

    visitSwitchStatement(ctx) {
        const id = ctx.IDENTIFIER().getText();
        const value = this.memory.get(id);
        const cases = ctx.caseSection();
        for (let i = 0; i < cases.length; i++) {
            const caseValue = this.visit(cases[i].constant());  
            if (caseValue === value) {
                return this.visit(cases[i].simpleStatement());
            }   
        }
    }
}