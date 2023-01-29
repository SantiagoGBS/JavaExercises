package E;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*2. Escriba un programa en Java que pida dos números enteros al usuario, y determine si 
		el primero es divisible entre el segundo*/ 
		int n=1;
		int a=0;
		
		Scanner s=new Scanner(System.in);
		
		while(n>=0) {
			System.out.println("Escriba dos numeros enteros");
			n=s.nextInt();
			a=s.nextInt();
			if(n%a==0) {
				System.out.println("El numero "+a+" es divisible entre el numero "+n);
			}else {
				System.out.println("El numero "+a+" no es divisible entre el numero "+n);
			}
		}

	}

}
