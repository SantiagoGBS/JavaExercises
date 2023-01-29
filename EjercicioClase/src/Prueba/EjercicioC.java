package Prueba;

import java.util.Scanner;

public class EjercicioC {

	public static void main(String[] args) {
		/*Crea un programa que lea números enteros desde teclado hasta que introduce un 3. Si el 
			primer número introducido es impar muestra el número de pares que se han introducido por 
			teclado. Si el primer número es par muestra la suma de los impares mayores que 3.*/
		int n=1;
		int c=0;
		int aux=0;
		int cp=0;
		int suma=0;
		Scanner s=new Scanner(System.in);
		for(int i=3; i!=n;i+=0) {
			System.out.println("Dame un numero");
			n=s.nextInt();
			c++;
			if(c==1) {
				aux=n;
			}
			if(n%2==0) {
				cp++;
			}
			if(n%2!=0 & n>3) {
				suma=suma+n;
			}
		}if(aux%2==0) {
			System.out.println("Los pares son" +c);
		}else 
			System.out.println("La suma es " +suma);
	}

}
