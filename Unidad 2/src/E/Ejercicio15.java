package E;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*5. Escriba un programa en Java que muestre por pantalla el valor de una entrada de cine 
		en función de los años de la persona. Así, el precio es de 7 Euros, pero si el usuario tiene 
		menos de 5 años se aplica un 60% de descuento, y si es mayor de 60 años, se aplicará 
		un descuento del 55 %. El precio de la entrada se debe declarar como una constante*/
		int e=7;
		int n=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Indique cuantos años tiene");
		n=s.nextInt();
		if(n<5) {
			e=60%e;
			System.out.println("El precio de la entrada es de " +e);
		}else if(n>60) {
			e=55%e;
			System.out.println("El precio de la entrada es de " +e);
		}else {
			System.out.println("El precio de la entrada es de " +e);
		}
		
	}

}
