package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class EscribirFichero {
	public void escribir() {
//		Para escribir un fichero crearemos un archivo con el nombre que queramos
		File facturaFile = new File("nombre");
		try {
//			Luego creamos un printWriter con el archivo
			PrintWriter salida = new PrintWriter(facturaFile);
//			Para escribir una linea en el fichero usaremos println("contenido")
			salida.println("");
//			Cuando hayamos terminado de escribir todas las lineas las guardaremos en el archivo usando flush()
			salida.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
