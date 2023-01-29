package GestionAparcamiento;

public class Cliente extends Persona {

	public int HoradeLlegada;
	public int DiasdeEstancia;
	public String Vehiculo;

	public Cliente(String dNI, String nombre, String apellidos, int edad, String dirección, String email,
			int horadeLlegada, int diasdeEstancia, String vehiculo) {
		super(dNI, nombre, apellidos, edad, dirección, email);
		HoradeLlegada = horadeLlegada;
		DiasdeEstancia = diasdeEstancia;
		Vehiculo = vehiculo;
	}

	public Cliente() {
		super();
		HoradeLlegada = 0;
		DiasdeEstancia = 0;
		Vehiculo = "";
	}

	public int getHoradeLlegada() {
		return HoradeLlegada;
	}

	public void setHoradeLlegada(int horadeLlegada) {
		HoradeLlegada = horadeLlegada;
	}

	public int getDiasdeEstancia() {
		return DiasdeEstancia;
	}

	public void setDiasdeEstancia(int diasdeEstancia) {
		DiasdeEstancia = diasdeEstancia;
	}

	public String getVehiculo() {
		return Vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		Vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Cliente [HoradeLlegada=" + HoradeLlegada + ", DiasdeEstancia=" + DiasdeEstancia + ", Vehiculo="
				+ Vehiculo + "]";
	}

	public static void main(String[] args) {

		Cliente n = new Cliente();
		if (n.valida("03958196s")) {
			System.out.println("esta bien machote");
		} else
			System.out.println("esta mal");

	}
}
