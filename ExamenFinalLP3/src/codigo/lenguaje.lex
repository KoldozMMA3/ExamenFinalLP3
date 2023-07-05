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
OPERADORES_MATEMATICOS = ("+" | "-" | "*" | "/" | "'")
SIMBOLOS = ("(" | ")" | "{" | "}" | "[" | "]")
POSICION = ("center" | "top" | "bottom" | "left" | "right")
ESPACIO_BLANCO = [ \t]+
ESPACIO = [ \t\r\n]+
SIGNO = ("+" | "-" | "*" | "/" | "=" | "<" | ">" | ";" | "." | "," | "(" | ")" | "{" | "}" | "[" | "]" )
%%
// Explicación de lo que imprimirá
"=<" { imprimir("Mayor igual que", yytext()); }
"=>" { imprimir("Menor igual que", yytext()); }
"<=" { imprimir("Mayor igual que", yytext()); }
">=" { imprimir("Menor igual que", yytext()); }
"==" { imprimir("Asigna valor ", yytext()); }
"!=" { imprimir("No es igual", yytext()); }
"=" { imprimir("Igual", yytext()); }
";" { imprimir("Punto y coma", yytext()); }
"," { imprimir("Coma", yytext()); }
"<" { imprimir("Mayor que", yytext()); }
"  " { imprimir("Espacio Blanco", yytext()); }
" " { imprimir("Espacio Blanco", yytext()); }
"if" { imprimir("Instruccion if", yytext()); }
"else" { imprimir("Instruccion else", yytext()); }
"while" { imprimir("Instruccion while", yytext()); }
"for" { imprimir("Instruccion for", yytext()); }
"do" { imprimir("Instruccion do", yytext()); }
"switch" { imprimir("Instruccion switch", yytext()); }
"case" { imprimir("Instruccion case", yytext()); }
"default" { imprimir("Instruccion default", yytext()); }
"break" { imprimir("Instruccion break", yytext()); }
"continue" { imprimir("Instruccion continue", yytext()); }
"return" { imprimir("Instruccion return", yytext()); }
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
"printf" { imprimir("Imprimir valor", yytext()); }
"cin" { imprimir("Entrada estandar cin", yytext()); }
"cout" { imprimir("Salida estandar cout", yytext()); }
"endl" { imprimir("Fin de linea endl", yytext()); }
{ESPACIO_BLANCO} { /* Ignorar espacio en blanco */ }
{ESPACIO} { /* Ignorar espacios */ }
{ID} { imprimir("Identificador", yytext()); }
{ENTERO} { imprimir("Numero entero", yytext()); }
{PUNTO_FLOTANTE} { imprimir("Numero de punto flotante", yytext()); }
{OPERADORES_MATEMATICOS} { imprimir("Operadores matematicos", yytext()); }
{SIMBOLOS} { imprimir("Simbolo", yytext()); }
{POSICION} { imprimir("Posicion", yytext()); }
{SIGNO} { imprimir("Signo", yytext()); }
\"[^\"]*\" { imprimir("Cadena", yytext()); } // Reconoce las cadenas entre comillas
"!" { imprimir("Operador de negacion", yytext()); }
"\"" { imprimir("Comillas dobles", yytext()); }
"#" { imprimir("Simbolo de preprocesador", yytext()); }
"%" { imprimir("Operador modulo", yytext()); }
"&" { imprimir("Operador bit a bit AND", yytext()); }
"/" { imprimir("Operador de division", yytext()); }
"(" { imprimir("Parentesis izquierdo", yytext()); }
")" { imprimir("Parentesis derecho", yytext()); }
"=" { imprimir("Operador de asignacion", yytext()); }
"?" { imprimir("Signo de interrogacion", yytext()); }
"¡" { imprimir("Signo de exclamacion de apertura", yytext()); }
"¿" { imprimir("Signo de interrogacion de apertura", yytext()); }
"<<" { imprimir("Operador de insercion", yytext()); }
">>" { imprimir("Operador de extraccion", yytext()); }
"endl" { imprimir("Fin de linea endl", yytext()); }
"&&" { imprimir("Operador logico AND", yytext()); }
"||" { imprimir("Operador logico OR", yytext()); }
"++" { imprimir("Operador de incremento", yytext()); }
"--" { imprimir("Operador de decremento", yytext()); }
":" { imprimir("Dos puntos", yytext()); }
"%:" { imprimir("Simbolo de concatenacion", yytext()); }
".*" { imprimir("Operador de puntero a miembro", yytext()); }
".->" { imprimir("Operador de puntero a miembro", yytext()); }
"->" { imprimir("Operador de acceso a miembro", yytext()); }
"..." { imprimir("Elipsis", yytext()); }
. { 
    if (!yytext().matches("\\s")) {
        throw new RuntimeException("Caracter inválido \"" + yytext() +
        "\" en la línea " + yyline + ", columna " + yycolumn);
    }
}
