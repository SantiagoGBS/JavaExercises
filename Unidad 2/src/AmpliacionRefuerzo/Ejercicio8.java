package AmpliacionRefuerzo;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Escriba un programa que eleve un número a una potencia, utilizando dos métodos: 
a) utilizando la función potencia Math.pow()
b) usando un bucle, sin recurrir al operador potencia
*/
		int n=0;
		int a=1;
		int bu=1;
		int po=0;
		int i=1;
		int su=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Escrinba un numero y a que potencia quiere elevarlo");
		n=s.nextInt();
		a=s.nextInt();
		while(i<=a) {
			
			bu=bu*n;
			i++;
			
		}
		
		po=(int) Math.pow(n, a);
		System.out.println(po+" y "+bu);
	}

}
