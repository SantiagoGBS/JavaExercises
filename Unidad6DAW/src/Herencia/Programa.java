package Herencia;

public class Programa {
	public static void main(String[] args) {

		// Crear un consultor y dos empleados
		Consultor c = new Consultor("Luis", "1234", 200, 15);
		Empleado e1 = new Empleado("Juan", "5678", 30000);
		Empleado e2 = new Empleado("Patricia", "3425", 40000);

		// Hacer un array de Trabajadores (3)
		Trabajador[] trabajadores = new Trabajador[3];
		trabajadores[0] = c;
		trabajadores[1] = e1;
		trabajadores[2] = e2;
		double mayor = 0;
		String nombreMayor = "";
		/*
		 * // Bucle hay que imprimir por pantalla los objetos // y sus pagas y mostrar
		 * la paga mayor. for (int i = 0; i < trabajadores.length; i++) {
		 * System.out.print((trabajadores[i].toString()));
		 * System.out.print((trabajadores[i].calcularPaga()));
		 * 
		 * if (mayor < trabajadores[i].calcularPaga()) { mayor =
		 * trabajadores[i].calcularPaga(); nombreMayor = trabajadores[i].getNombre(); }
		 * } System.out.println(nombreMayor + " \n es el empleado que más cobra:" +
		 * mayor + "$");
		 */
		// si es un empleado paga+100 si es un consultor paga +50

		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] instanceof Consultor) {
				System.out.print(trabajadores[i] + "" + (trabajadores[i].calcularPaga() + 50));
			}
			if (trabajadores[i] instanceof Empleado) {
				System.out.print(trabajadores[i] + "" + (trabajadores[i].calcularPaga() + 100));
			}

		}
	}
}
