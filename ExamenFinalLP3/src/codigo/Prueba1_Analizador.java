package codigo;
import java.io.IOException;
import java.io.StringReader;

public class Prueba1_Analizador {

	public static void main(String[] args) throws IOException {
		String expresion = 
				" String return = }30(\" | \"); +-*/}[/";
				
		AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(expresion));
		lexico.yylex();
	}
}

