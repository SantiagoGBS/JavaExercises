package Herencia;

public class Trabajador {
 //Atributos
	protected String nombre;
	protected String puesto;
	protected String NSS;
	protected String telefono;
	
	
	//Métodos
	
	//Constructores
	//Por defecto
	public Trabajador() {
		this.nombre = "";
		this.puesto = "";
		this.NSS = "";
		this.telefono = "";
		
		
	}
	
	
	
	public Trabajador(String nombre, String nSS) {
		
		this.nombre = nombre;
		this.NSS = nSS;
		this.puesto = "";
		this.telefono = "";
		
	}



	//Constructor con todos los parámetros
	public Trabajador(String nombre, String puesto, String nSS, String telefono) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.NSS = nSS;
		this.telefono = telefono;
		
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return nombre + "( NSS " + NSS + ")";
	}
	
	/*public static void main(String[] args) {
		Trabajador t=new Trabajador("Marta", "123");
		System.out.println(t);
	}*/

	
	public double calcularPaga() {
		return 0;
	}
	
	
}
