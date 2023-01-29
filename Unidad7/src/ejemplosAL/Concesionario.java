package ejemplosAL;

import java.util.ArrayList;

public class Concesionario {

	ArrayList<Coche> miscoches; // miscoches es un arraylist de Coches

	public Concesionario() {
		this.miscoches = new ArrayList<Coche>();
	}

	public ArrayList<Coche> getMiscoches() {
		return miscoches;
	}

	public void setMiscoches(ArrayList<Coche> miscoches) {
		this.miscoches = miscoches;
	}

	public static void main(String[] args) {
		Concesionario c = new Concesionario();
		Coche c1 = new Coche("1234FFF", "opel", "corsa", 3);
		Coche c2 = new Coche("2222FFF", "Seat", "corsa", 5);
		Coche c3 = new Coche("3333FFF", "audi", "corsa", 3);
		Coche c4 = new Coche("4444FFF", "Mini", "cooper", 5);
		// Añadir objetos al arraylist
		c.getMiscoches().add(c1);
		c.getMiscoches().add(c2);
		c.getMiscoches().add(c3);
		c.getMiscoches().add(c4);
		// recorrer objetos del array list
		for (int i = 0; i < c.getMiscoches().size(); i++) {
			System.out.println(c.getMiscoches().get(i));
		}
		System.out.println("For each");
		for (Coche x : c.getMiscoches()) {
			System.out.println(x);
		}
		// borrar un elemnto del arraylist
		c.getMiscoches().remove(1);
		System.out.println("Borro el elemento que esta en la posicion 1");
		for (Coche x : c.getMiscoches()) {
			System.out.println(x);
		}
		// borar un objeto
		System.out.println("Borro el objeto c3");
		c.getMiscoches().remove(c3);
		for (Coche x : c.getMiscoches()) {
			System.out.println(x);
		}
	}
}
