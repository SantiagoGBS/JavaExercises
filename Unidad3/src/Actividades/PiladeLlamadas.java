package Actividades;

public class PiladeLlamadas {

	public static void main(String[] args) {
		int i=0;
		System.out.println("Soy el programa principal");
		metodo1(i);
		System.out.println("Fin");

	}

	private static void metodo1(int i) {
		System.out.println("Soy el metodo uno");
		i=i+10;
		metodo2(i);
	}

	private static void metodo2(int i) {
		System.out.println("Soy el metodo dos");
		i++;
		System.out.println("El valor de i es "+i);
		
	}

}
