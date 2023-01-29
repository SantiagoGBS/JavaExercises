package E;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*9. Escriba un programa en el que se declaren dos variables, a y b, se pida un valor para 
		cada una de ellas, y se intercambien dichos valores.*/
		int a=0;
		int b=0;
		int aux=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Introduzca el valor de A");
		a=s.nextInt();
		System.out.println("Introduzca el valor de B");
		b=s.nextInt();
		aux=a;
		a=b;
		b=aux;
		System.out.println("Ahora los valores son "+a+" para a y "+b+" para b");
		
	}

}
