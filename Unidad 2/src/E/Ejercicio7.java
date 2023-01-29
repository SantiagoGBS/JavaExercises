package E;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*7. Escriba un programa que pida un tiempo en segundos y lo muestre convertido a 
minutos y segundos*/
		int n=0;
		float seg=0f;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Cuantos segundos?");
		n=s.nextInt();
		seg=(float)n/60;
		System.out.println("Son "+seg+" minutos");
		
	}

}
