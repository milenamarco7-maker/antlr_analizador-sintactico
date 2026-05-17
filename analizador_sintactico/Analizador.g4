grammar Analizador;

// --- Reglas Sintácticas ---
program: (simpleStatement)* EOF;

simpleStatement: assignmentStatement
               | switchStatement
               | outputStatement
               ; 
               
switchStatement: 'switch' '(' IDENTIFIER ')' '{' (caseSection)* defaultSection? '}' ;

caseSection: 'case' constant ':' simpleStatement* ;

defaultSection: 'default' ':' simpleStatement* ;

assignmentStatement: IDENTIFIER '=' constant ';' ;

outputStatement: 'output' '(' TEXTLITERAL ')' ';' ;

constant: NUMBER  
        | TEXTLITERAL 
        ;

// --- Reglas Léxicas (Tokens) ---
TEXTLITERAL: '"' ~["]* '"' ;

NUMBER: [0-9]+ ;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;

LETTER: [a-zA-Z] ;

DIGIT: [0-9] ;

WS: [ \t\r\n]+ -> skip ; //Ignorar espacios en blanco