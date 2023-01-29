package zzzExamen2;

public class Pedido {
	public int codigoPedido;
	public String dniCliente;
	public double descuento;
	public int turno;

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

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Pedido(int codigoPedido, String dniCliente, double descuento, int turno) {
		super();
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.descuento = descuento;
		this.turno = turno;
	}

	public Pedido() {
		super();
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.descuento = 0.0;
		this.turno = 0;
	}

}
