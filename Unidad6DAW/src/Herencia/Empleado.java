package Herencia;

public class Empleado extends Trabajador{
	protected double sueldo;
	protected double impuestos;
	
	//constructor
	public Empleado(String nombre, String NSS, double sueldo) {
		
		super(nombre,NSS);		
		this.sueldo=sueldo;
		this.impuestos=0.3*sueldo;
		
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	//Sobreescribo el método calcularPaga para el empleado
	public double calcularPaga() {
		return (this.sueldo-this.impuestos)/14;
	}

	@Override
	public String toString() {
		return "Empleado " + super.toString();
	}
	
/*	public static void main(String[] args) {
		Trabajador t=new Trabajador("Marta", "123");
		System.out.println(t.calcularPaga());
		
		Empleado e=new Empleado("Juan", "345", 12000);
		System.out.println(e);
		System.out.println(e.calcularPaga());
		
		
		
	}*/
	
	
	
}
