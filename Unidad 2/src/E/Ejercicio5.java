package E;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pi=0;
		int r=0;
		int per=0;
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Digame el radio de una circunferencia");
		r=s.nextInt();
		pi=(int) Math.PI;
		per=2*pi*r;
		System.out.println("El perimetro es "+per);
		
	}

}
