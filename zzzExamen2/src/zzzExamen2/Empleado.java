package zzzExamen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona {

	public int turno;
	public ArrayList<Pedido> pedidosAsignados;

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public ArrayList<Pedido> getPedidosAsignados() {
		return this.pedidosAsignados;
	}

	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}

	public Empleado(String dni, String nombre, String apellidos, String direccion, int turno) {
		super(dni, nombre, apellidos, direccion);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<>();
	}

	public Empleado() {
		super();
		this.turno = 0;
		this.pedidosAsignados = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + "]";
	}

	public void asignarPedidosTurno(String fichero) {
		File ficherocsv = new File("Pedidos.csv");

		try {
			String cadena;
			String[] trozo;
			Scanner entrada = entrada = new Scanner(ficherocsv);
			entrada.nextLine();
//			Factura f = new Factura();
			Pedido p = new Pedido();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				trozo = cadena.split(";");
				if (Integer.parseInt(trozo[3]) == this.turno) {
					this.pedidosAsignados.add(new Pedido(Integer.parseInt(trozo[0]), trozo[1],
							Double.parseDouble(trozo[2]), Integer.parseInt(trozo[3])));
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Factura generarFactura(Pedido p) {
		Factura f = new Factura(p.getCodigoPedido() + "_" + p.getDniCliente(), p.getCodigoPedido(), p.getDniCliente());
		BD bbdd = BD.getInstance();
		bbdd.cargarParametrosConexion();
		try {
			File facturaFile = new File("Factura" + p.getDniCliente() + ".txt");
			PrintWriter salida = new PrintWriter(facturaFile);
			salida.println("Factura: " + f.getCodigoFactura());
			salida.println("Cliente: " + f.getDniCliente());
			salida.println("*******************PRODUCTO**********************");
			int acumulador = 0;
			for (ProductoPedido i : f.cargarProductos("ProductosPedidos.csv")) {
				acumulador++;
				salida.println(acumulador + i.toString());
			}
			salida.println("\t" + "Total: " + f.totalSinIVA());
			salida.println("\t" + "IVA: " + f.ivaReducido());
			salida.println("\t" + p.getDescuento());
			System.out.println(f.totalSinIVA());
			System.out.println(f.ivaReducido());
			System.out.println(p.getDescuento());
			double total = (f.totalSinIVA() + f.ivaReducido() - p.getDescuento());
			salida.println("\t" + "IMPORTE TOTAL: " + total);
			salida.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double totaltodo = f.getTotal() + f.ivaReducido() - p.getDescuento();
		try {
			ResultSet rset = bbdd.consultaBD("insert into Factura values ('" + f.codigoFactura + "'," + f.codigoPedido
					+ ",'" + f.dniCliente + "'," + totaltodo + ")");
			rset = bbdd.consultaBD("commit");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;

	}

//	public static void main(String[] args) {
//		Empleado empleado = new Empleado();
//		empleado.setTurno(1);
//		empleado.asignarPedidosTurno("Pedidos.csv");
//		ArrayList<Pedido> pedidos = empleado.getPedidosAsignados();
//		for (Pedido i : pedidos) {
//			System.out.println(i.toString());
//			empleado.generarFactura(i);
//		}
//	}

}
