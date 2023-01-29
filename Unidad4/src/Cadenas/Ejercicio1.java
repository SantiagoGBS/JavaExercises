package Cadenas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String palabra="";
		Scanner s=new Scanner(System.in);
		palabra=s.next();
		String mayuscula=(palabra.substring(0, 1)).toUpperCase()+palabra.substring(1);
		System.out.println(mayuscula);
		
		

	}

}
