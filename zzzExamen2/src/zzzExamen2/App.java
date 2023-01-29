package zzzExamen2;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		String linea;
		ArrayList<Empleado> empleados = bbdd.cargaEmpleados();

		if (args.length == 0) {
			for (Empleado i : empleados) {
				System.out.println(i.toString());
				i.asignarPedidosTurno("Pedidos.csv");
				for (Pedido u : i.getPedidosAsignados()) {
					i.generarFactura(u);
				}
			}
		} else {
			linea = args[0].split("=")[1];
			System.out.println(linea);
			for (Empleado i : empleados) {
				System.out.println(i.toString());
				if (i.getDni().equals(linea)) {
					i.asignarPedidosTurno("Pedidos.csv");
					for (Pedido u : i.getPedidosAsignados()) {
						i.generarFactura(u);
					}
				}

			}

		}

	}
}
