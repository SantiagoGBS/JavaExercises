package AmpliacionRefuerzo1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 6. Escriba un programa que pida al usuario un n�mero, y muestre el mensaje "has 
introducido el numero ---" (mostrando el n�mero que ha sido introducido). Esta acci�n 
debe repetirse hasta que el usuario introduzca el n�mero 0. En ese momento se 
mostrar� el mensaje "Finalizando: Se ha introducido el n�mero 0". Adem�s, se debe 
mostrar cu�ntos n�meros se han introducido y su sum*/
		int n=0;
		int i=0;
		int suma=0;
		int c=0;
		int to=0;
		Scanner s=new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un numero");
			n=s.nextInt();
		System.out.println("Has introducido el numero " +n);
		suma=suma+n;
		to=c+to;
		c++;
	}while(n!=0);
		System.out.println("Finalizado, se ha introducido el numero 0. Has introducido un total de "+to+" numeros y suman  "+suma);
	}
}
