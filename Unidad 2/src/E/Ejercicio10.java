package E;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Escriba un programa en Java que convierta euros a dolares (1 euro = 1.286 dolares) 
	y a libras esterlinas (1 euro = 0,865 libras). Imprima los resultados por pantalla. */ 
		float d=0;
		float e=0;
		int p=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Diga cuantos euros quiere convertir");
		p=s.nextInt();
			d=(float)(p*1.286);
			e=(float)(p*0.865);
		
			System.out.println("Son "+d+" dolares y "+e+" libreas");
		
	}

}
