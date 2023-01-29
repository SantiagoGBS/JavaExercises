package E;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*8. Escriba un programa que pregunte al usuario su edad, y luego compruebe si es mayor 
		de 21 años. Si es mayor deberá escribir un 1 y si es menor un 0. El ejercicio se debe 
		resolver usando operadores relacionales.*/
		int a=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Cuantos años tienes");
		a=s.nextInt();
		if(a>21) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
