package codigo;
import java.io.File;

public class Generador {

	public static void main(String[] args) {
		String path="D:/eclipse2/Trabajos/ExamenFinalLP3/src/codigo/";
		String archivo= path + "lenguaje.lex";
		
		File file =new File(archivo);
		jflex.Main.generate(file);

	}

}
