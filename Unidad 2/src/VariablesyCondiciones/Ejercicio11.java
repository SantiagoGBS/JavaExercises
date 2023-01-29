package VariablesyCondiciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int num=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Escriba un numero ");
		
		num=s.nextInt();
		
		if (num>99999) {
			System.out.println("El numero tiene 6 cifras");
		}	else if(num>9999){
				System.out.println("El numero tiene 5 cifras");
		}		else if(num>999) {
					System.out.println("El numero tiene 4 cifras");
	}				else if (num>99) {
						System.out.println("El numero tiene 3 cifras");
	}					else if (num>9){
							System.out.println("El numero tiene 2 cifra");
	}						else 
								System.out.println("El numero tiene 1 cifra");
		
	}

}
