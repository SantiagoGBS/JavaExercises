package E;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* 6. Escriba un programa que calcule el resto de la divisi�n de dos n�meros enteros. Para 
		ello utilice el operador m�dulo (%). */
		int c=2;
		int i=0;
		int n=0;
		int a=0;
		int op=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba dos numeros enteros");
		n=s.nextInt();
		a=s.nextInt();
		while(i<c && n<0) {
			i++;
			
			op=n%2;
			
		}System.out.println("El resto de los dos numeros es "+op);
	}

}
