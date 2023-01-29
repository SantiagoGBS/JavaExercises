package E;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int op=0;
		String fecha;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Hola \n por favor, introduzca el año en el que nacio");
		n=s.nextInt();
		fecha=String.valueOf(n);
		op=(2021-n);
		System.out.println("Si usted nacio en " +n+" tiene " +op+ " años");
		
		//System.out.println("Introduzca su edad");
	}

}
