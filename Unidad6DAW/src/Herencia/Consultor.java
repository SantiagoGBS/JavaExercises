package Herencia;

public class Consultor extends Trabajador {

	protected int horas;
	protected double tarifa;
	
		
	
	public Consultor(String nombre, String nSS, int horas, double tarifa) {
		super(nombre, nSS);
		this.horas=horas;
		this.tarifa=tarifa;
		
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public double calcularPaga() {
		
		return (this.horas*this.tarifa);
	}
	
	@Override
	public String toString() {
		return "Consultor " + super.toString();
	}
	
	
	public static void main(String[] args) {
		Consultor c=new Consultor("Angel", "678", 15, 10);
		System.out.println(c);
		System.out.println(c.calcularPaga());
	}
	
	
}
