package zzzExamen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements impuestos {
	public String codigoFactura;
	public int codigoPedido;
	public String dniCliente;
	public ArrayList<ProductoPedido> cargarproducto;
	public double total;

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public ArrayList<ProductoPedido> getProductosPedidos() {
		return cargarproducto;
	}

	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.cargarproducto = productosPedidos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Factura(String codigoFactura, int codigoPedido, String dniCliente) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		cargarproducto = new ArrayList<>();
		this.total = 0;
	}

	public Factura() {
		super();
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.dniCliente = "";
		cargarproducto = new ArrayList<>();
		this.total = 0;
	}

	// este metodo lee de un csv y lo carga en un arrayList
	public ArrayList<ProductoPedido> cargarProductos(String fichero) {
		ArrayList<ProductoPedido> productos = new ArrayList<>();
		File ficherocsv = new File(fichero);

		try {
			String cadena;
			String[] trozo;
			Scanner entrada = entrada = new Scanner(ficherocsv);
			entrada.nextLine();
			while (entrada.hasNext()) {
				cadena = entrada.nextLine();
				trozo = cadena.split(";");
				if (Integer.parseInt(trozo[0]) == this.codigoPedido) {
					productos.add(new ProductoPedido(Integer.parseInt(trozo[0]), Integer.parseInt(trozo[1]), trozo[2],
							trozo[3], trozo[4], Double.parseDouble(trozo[5]), Double.parseDouble(trozo[6])));
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return productos;
	}

	@Override
	public double totalSinIVA() {
		double suma = 0;
		// TODO Auto-generated method stub
		for (ProductoPedido i : this.cargarProductos("ProductosPedidos.csv")) {
			suma += i.getPrecioKg() * i.getKg();
		}

		this.total = suma;
		return this.total;
	}

	@Override
	public double ivaReducido() {
		// TODO Auto-generated method stub
		double coniva = 0;
		coniva = this.total * 0.04;

		return coniva;
	}

//	public static void main(String[] args) {
//		Factura f = new Factura();
//		f.setCodigoPedido(1000);
//		f.setProductosPedidos(f.cargarProductos("ProductosPedidos.csv"));
//		System.out.println(f.totalSinIVA());
//		System.out.println(f.ivaReducido());
//	}

}
