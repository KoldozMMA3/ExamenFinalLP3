package codigo;

import java_cup.runtime.*;

%%
%{
/*-*
* funciones y variables
*/
private void imprimir(String descripcion, String lexema) {
    System.out.println(lexema + " - " + descripcion);
}
%}
/*-*
* Información sobre la clase generada
*/
%public
%class AnalizadorLexico
%type void
/*-*
* Ajustes regulares
*/
ID = [_a-zA-Z][_a-zA-Z0-9]*
ENTERO = 0|[1-9][0-9]* 
PUNTO_FLOTANTE = [0-9][0-9]*"."[0-9]+
OPERADORES_MATEMATICOS = ("+" | "-" | "*" | "/")
SIMBOLOS = ("<" | ">" | "<=" | ">=" | "==" | "!=" | "=" | ";" | "," | "(" | ")" | "{" | "}" | "[" | "]")
POSICION = ("center" | "top" | "bottom" | "left" | "right")
ESPACIO_BLANCO = [ \t]+
ESPACIO = [ \t\r\n]+
SIGNO = ("+" | "-" | "*" | "/" | "=" | "<" | ">" | ";" | "." | "," | "(" | ")" | "{" | "}" | "[" | "]")
%%
// Explicación de lo que imprimirá

" " { imprimir("Espacio Blanco", yytext()); }
"if" { imprimir("Instrucción if", yytext()); }
"else" { imprimir("Instrucción else", yytext()); }
"while" { imprimir("Instrucción while", yytext()); }
"for" { imprimir("Instrucción for", yytext()); }
"do" { imprimir("Instrucción do", yytext()); }
"switch" { imprimir("Instrucción switch", yytext()); }
"case" { imprimir("Instrucción case", yytext()); }
"default" { imprimir("Instrucción default", yytext()); }
"break" { imprimir("Instrucción break", yytext()); }
"continue" { imprimir("Instrucción continue", yytext()); }
"return" { imprimir("Instrucción return", yytext()); }
"typedef" { imprimir("Palabra clave typedef", yytext()); }
"namespace" { imprimir("Palabra clave namespace", yytext()); }
"using" { imprimir("Palabra clave using", yytext()); }
"class" { imprimir("Palabra clave class", yytext()); }
"struct" { imprimir("Palabra clave struct", yytext()); }
"template" { imprimir("Palabra clave template", yytext()); }
"try" { imprimir("Palabra clave try", yytext()); }
"catch" { imprimir("Palabra clave catch", yytext()); }
"throw" { imprimir("Palabra clave throw", yytext()); }
"new" { imprimir("Operador new", yytext()); }
"delete" { imprimir("Operador delete", yytext()); }
"sizeof" { imprimir("Operador sizeof", yytext()); }
"nullptr" { imprimir("Puntero nulo nullptr", yytext()); }
"const" { imprimir("Palabra clave const", yytext()); }
"static" { imprimir("Palabra clave static", yytext()); }
"virtual" { imprimir("Palabra clave virtual", yytext()); }
"inline" { imprimir("Palabra clave inline", yytext()); }
"explicit" { imprimir("Palabra clave explicit", yytext()); }
"friend" { imprimir("Palabra clave friend", yytext()); }
"public" { imprimir("Palabra clave public", yytext()); }
"private" { imprimir("Palabra clave private", yytext()); }
"protected" { imprimir("Palabra clave protected", yytext()); }
"operator" { imprimir("Palabra clave operator", yytext()); }
"true" { imprimir("Valor booleano true", yytext()); }
"false" { imprimir("Valor booleano false", yytext()); }
"int" { imprimir("Tipo de dato int", yytext()); }
"float" { imprimir("Tipo de dato float", yytext()); }
"double" { imprimir("Tipo de dato double", yytext()); }
"char" { imprimir("Tipo de dato char", yytext()); }
"bool" { imprimir("Tipo de dato bool", yytext()); }
"void" { imprimir("Tipo de dato void", yytext()); }
"unsigned" { imprimir("Tipo de dato unsigned", yytext()); }
"signed" { imprimir("Tipo de dato signed", yytext()); }
"long" { imprimir("Tipo de dato long", yytext()); }
"short" { imprimir("Tipo de dato short", yytext()); }
"auto" { imprimir("Palabra clave auto", yytext()); }
"register" { imprimir("Palabra clave register", yytext()); }
"volatile" { imprimir("Palabra clave volatile", yytext()); }
"extern" { imprimir("Palabra clave extern", yytext()); }
"constexpr" { imprimir("Palabra clave constexpr", yytext()); }
"this" { imprimir("Puntero 'this'", yytext()); }
"friend" { imprimir("Palabra clave friend", yytext()); }
"cin" { imprimir("Entrada estándar cin", yytext()); }
"cout" { imprimir("Salida estándar cout", yytext()); }
"endl" { imprimir("Fin de línea endl", yytext()); }
{ESPACIO_BLANCO} { /* Ignorar espacio en blanco */ }
{ESPACIO} { /* Ignorar espacios */ }
{ID} { imprimir("Identificador", yytext()); }
{ENTERO} { imprimir("Número entero", yytext()); }
{PUNTO_FLOTANTE} { imprimir("Número de punto flotante", yytext()); }
{OPERADORES_MATEMATICOS} { imprimir("Operadores matemáticos", yytext()); }
{SIMBOLOS} { imprimir("Símbolo", yytext()); }
{POSICION} { imprimir("Posición", yytext()); }
{SIGNO} { imprimir("Signo", yytext()); }
\"[^\"]*\" { imprimir("Cadena", yytext()); } // Reconoce las cadenas entre comillas
. { 
    if (!yytext().matches("\\s")) {
        throw new RuntimeException("Caracter inválido \"" + yytext() +
        "\" en la línea " + yyline + ", columna " + yycolumn);
    }
}
