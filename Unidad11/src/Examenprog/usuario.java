package Examenprog;

public class usuario {
	protected String DNI;
	protected String nombre;
	protected String apellidos;
	protected String direccion;
	protected String usuario;
	protected String clave;
	protected String genero;

	public usuario(String dNI, String nombre, String apellidos, String direccion, String usuario, String clave,
			String genero) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.usuario = usuario;
		this.clave = clave;
		this.genero = genero;
	}

	public usuario() {
		super();
		DNI = "";
		this.nombre = "";
		this.apellidos = "";
		this.direccion = "";
		this.usuario = "";
		this.clave = "";
		this.genero = "";
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getGenero() {
		return genero;
	}

	public void setTGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "usuario [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", usuario=" + usuario + ", clave=" + clave + ", genero=" + genero + "]";
	}

}
