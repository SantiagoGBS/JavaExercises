package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerFichero {
public void leer() {
//	Para leer de un fichero primero deberemos crear un objeto file el cual sera el fichero que vayamos a leer
	File fichero = new File("configTienda.txt");
//	Luego crearemos un array de string para guardar el split de la linea leida
	String[] conf;
	try {
//		Luego tendremos que crear un scanner del fichero para poder leer las lineas
		Scanner entrada = new Scanner(fichero);
//		en caso de necesitar pasar una linea podremos poner la siguiente linea
//		entrada.nextLine();
//		Luego crearemos un bucle que recorrera las lineas del archivo
		while(entrada.hasNext()){
//			Dentro del bucle haremos un split de la linea leida, la guardaremos en conf y manejaremos los datos como se necesite
			conf=entrada.nextLine().split("-");
		}
//			una vez hayamos terminado tendremos que cerrar el scanner
		entrada.close();
	} catch (FileNotFoundException e) {
	}
}
}
