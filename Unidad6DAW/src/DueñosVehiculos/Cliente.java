package DueñosVehiculos;

public class Cliente {

	// Atributos
	private NIF dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private double saldo;
	Vehiculo[] v = new Vehiculo[5];

	// METODOS

	public Cliente() {
		super();
		this.dni = null;
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.saldo = 0;
		this.v = null;
	}

	public Cliente(NIF dni, String nombre, String apellido, String direccion, double saldo, Vehiculo[] v) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.saldo = saldo;
		this.v = v;
	}

	public NIF getDni() {
		return dni;
	}

	public void setDni(NIF dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Vehiculo[] getV() {
		return v;
	}

	public void setV(Vehiculo[] v) {
		this.v = v;
	}

}