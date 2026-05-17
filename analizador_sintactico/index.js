import AnalizadorLexer from "./AnalizadorLexer.js";
import AnalizadorParser from "./AnalizadorParser.js";
import { CustomAnalizadorListener } from "./CustomAnalizadorListener.js";
import { CustomAnalizadorVisitor } from "./CustomAnalizadorVisitor.js";
import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import readline from 'readline';
import fs from 'fs';

async function main() {
    let input;

    // Intento leer la entrada desde el archivo input - en forma sincrona.
    try {
        input = fs.readFileSync('input.txt', 'utf8');
    } catch (err) {
        // Si no es posible leer el archivo, solicitar la entrada del usuario por teclado
        input = await leerCadena(); // Simula lectura síncrona
        console.log(input);
    }
    // --- PROCESAMIENTO DE LA ENTRADA ---
    let inputStream = CharStreams.fromString(input);
    let lexer = new AnalizadorLexer(inputStream);
    let lexerErrors = false;

    //Creo un listener personalizado para detectar errores léxicos
    lexer.removeErrorListeners();
    lexer.addErrorListener({
    syntaxError: (recognizer, offendingSymbol, line, column, msg, e) => {
        lexerErrors = true;
    }
});
    let tokenStream = new CommonTokenStream(lexer);
    let parser = new AnalizadorParser(tokenStream);

     // --- ANÁLISIS SINTÁCTICO ---
    let tree = parser.program();

    //Definición de tokens para la tabla de tokens
    const tokens = tokenStream.tokens;

    // Verificación de errores de sintaxis y accedo a la fuente de tokens
    let syntaxErrors = parser.numberOfSyntaxErrors > 0;
    let lexicalErrors = 0;

    // Reviso si el lexer detectó errores léxicos (tokens desconocidos)
    for (let t of tokens) {
        if (t.type === -1 && t.text !== "<EOF>") { 
            lexicalErrors++;
        }
    }

    // Si se detectan errores léxicos o sintácticos, se muestra un mensaje de error, de lo contrario se muestra el árbol de derivación y se ejecuta el Visitor  
    if (lexerErrors || parser.numberOfSyntaxErrors > 0 || lexicalErrors > 0) {
        console.log("\n--------------------------");
        console.log("LA ENTRADA NO ES VÁLIDA");
        console.log("--------------------------");
        return;
    } else {
        console.log("\nEntrada válida.");

        // --- TABLA DE LEXEMAS Y TOKENS ---
    console.log("\nTabla de Lexemas y Tokens");
    console.log("--------------------------");

    for (let t of tokens) {
        if (t.type === -1) continue; // Ignoro tokens EOF
        const tokenName = AnalizadorParser.symbolicNames[t.type] || 
                          AnalizadorParser.literalNames[t.type] || 
                          "TOKEN_" + t.type;
        
        console.log(`${t.text} -> ${tokenName}`);
    }

        console.log("\nÁrbol de derivación:");
        console.log(tree.toStringTree(parser.ruleNames));
        
        const visitor = new CustomAnalizadorVisitor();
        visitor.visit(tree);
    }
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

// Ejecuta la función principal
main();
