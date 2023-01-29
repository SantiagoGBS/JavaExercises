package EDD;

import java.util.Scanner;
import java.util.Stack;

public class PruebaPila {

	public static void main(String[] args) {
		Pila<Integer> mipila = new Pila();
		Pila<Double> reales = new Pila();
		Pila<String> expresion = new Pila();
		Stack<Integer> pila = new Stack<>();

		mipila.push(1);
		mipila.push(3);
		mipila.push(5);
		mipila.print();

		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una expresion");
		String parentesis = sc.next();

		for (int i = 0; i < parentesis.length(); i++) {
			// Para cada caracter del string
			// Si es ( hacemos un push ("(")
			// Si es ) hacemos un pop();
			if (parentesis.charAt(i) == '(') {
				expresion.push("(");
				System.out.println("*********");
				expresion.print();
			}
			if (parentesis.charAt(i) == '(') {
				expresion.pop(")");
				System.out.println("*********");
				expresion.print();
			}

		}
		if (expresion.isEmpty()) {
			System.out.println("La expresion es correcta");

		} else
			System.out.println("La expresion no es correcta");

	}

}
