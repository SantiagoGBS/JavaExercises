package zzzExamen2;

public class Cliente extends Persona {

	public String metodoPago;

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
	}

	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + "]";
	}

}
