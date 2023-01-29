package E;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*. Escriba un programa en Java que pida dos números enteros al usuario, y determine 
		cuál es mayor, el primero o el segundo. Modifíquelo para considerar también la 
		posibilidad de que sean iguales. */
		int n=1;
		int a=0;
		Scanner s=new Scanner(System.in);
		while(n>=0) {
			System.out.println("Escriba dos numeros");
			n=s.nextInt();
			a=s.nextInt();
			if(n>a) {
				System.out.println("El numero "+n+" es mayor que "+a);
			}else if(a>n){
				System.out.println("El numero "+a+" es mayor que "+n);
			}else if(a==n) {
				System.out.println("Los numeros "+a+" y "+n+" son iguales");
			}
		}
		
	}

}
