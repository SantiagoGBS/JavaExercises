package AmpliacionRefuerzo1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String us="";
		String pas="";
		int i=0;
		Scanner s=new Scanner (System.in);
		
		
		while(i<3) {
			System.out.println("Introduzca su usuario.");
			us=s.next();
			System.out.println( "Introduzca su contraseña");
			pas=s.next();
			
			if (us.equalsIgnoreCase("root") && pas.equalsIgnoreCase("1234")){
				System.out.println("Bienvenido al sistema.");
				break;
			}
			i++;
		}
		
		
		
	}

}
