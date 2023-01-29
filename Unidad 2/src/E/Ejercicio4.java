package E;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=0;
		int alt=0;
		int are=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Escriba una altura");
		alt=s.nextInt();
		System.out.println("Escriba una base");
		base=s.nextInt();
		are=base*alt;
		System.out.println("Un triangulo rectangulo de altura "+alt+" y base "+base+" tiene un area de "+are);
	}

}
