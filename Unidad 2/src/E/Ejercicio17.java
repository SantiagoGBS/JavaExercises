package E;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*7. Escriba un programa que solicite un n�mero, y si �ste es de dos cifras, muestre por 
			pantalla los siguientes valores: 
			 Suma de sus dos d�gitos. 
			 Cu�ntos de sus d�gitos son pares. 
			Nota: para saber si es de dos cifras, comp�relo con 9 y 99. Para calcular los d�gitos use 
			la divisi�n entera y el resto.*/
		int n=0;
		int i=0;
		int suma=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n<99 && n>9) {
			while(n!=0) {
				n=n%10;
				i++;
				//suma=suma+n;
			}
			System.out.println("La suma de sus digitos es "+i );
		}

	}

}
