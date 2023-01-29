package CondicionalesyBucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Leer números hasta que se introduzca un 0.
		 *  Para cada uno indicar si es par o impar.
		 */
		int n=1;
		Scanner s=new Scanner(System.in);
		
		while(n!=0) {
			System.out.println("Escribe un numero");
			n=s.nextInt();
			if(n%2==0 && n!=0) {
				System.out.println("par");
			}else if (n!=0){
				System.out.println("impar");
			}
		}
		
	}

}
