package Prueba;

import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		int c=0;
		int aux=0;
		int cont=0;
		int suma=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Dame numeros y pulsa 2 para salir. ");
		while(n!=2) {
			c++;
			n=s.nextInt();
			
			if(n%2==0) {
				cont++;
			}else if(n%2!=0 & n<10) {
				suma=suma+n;
			}if(c==1) {
				aux=n;
			}
		}if(aux%2==0) {
			System.out.println("Hay "+cont+" pares");
		}else {
			System.out.println("La suma es "+suma);
		}
			
	}

}
