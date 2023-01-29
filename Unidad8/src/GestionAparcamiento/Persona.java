package GestionAparcamiento;

abstract public class Persona implements Valida {
	public String DNI;
	public String Nombre;
	public String Apellidos;
	public int Edad;
	public String Dirección;
	public String Email;

	public Persona(String dNI, String nombre, String apellidos, int edad, String dirección, String email) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
		Dirección = dirección;
		Email = email;
	}

	public Persona() {
		super();
		DNI = "";
		Nombre = "";
		Apellidos = "";
		Edad = 0;
		Dirección = "";
		Email = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad
				+ ", Dirección=" + Dirección + ", Email=" + Email + "]";
	}

	@Override
	public boolean valida(String dni) {
		char[] letradni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int numero = Integer.parseInt(dni.substring(0, 8));

		if (dni.charAt(8) == letradni[numero % 23]) {
			return true;
		} else
			return false;

	}

}
