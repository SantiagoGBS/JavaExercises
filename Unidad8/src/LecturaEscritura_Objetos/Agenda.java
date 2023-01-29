package LecturaEscritura_Objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> lista;

	public Agenda() {
		this.lista = new ArrayList<>();
	}

	public ArrayList<Contacto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Contacto> lista) {
		this.lista = lista;
	}

	// Carga los contactos del fichero de objetos
	// en el AL atributo de la clase
	public void cargarAgenda(String filename) {
		try {
			FileInputStream fichero = new FileInputStream(filename);
			ObjectInputStream entrada = new ObjectInputStream(fichero);
			Contacto c = null;
			while (entrada != null) {
				try {
					c = (Contacto) entrada.readObject();
					this.getLista().add(c);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					entrada = null;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Guarda los objetos del AL lista en el fichero de objetos
	public void guardarAgenda(String filename) {
		try {
			FileOutputStream fichero = new FileOutputStream(filename);
			ObjectOutputStream salida = new ObjectOutputStream(fichero);

			for (Contacto contacto : this.lista) {
				salida.writeObject(contacto);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//Imprime los contactos de la lista
	public void imprimirAgenda() {
		for (Contacto contacto : this.lista) {
			System.out.println(contacto.getNombreCompleto() + contacto.getTelefono());
		}
	}

//Añade un contacto a la lista
	public void addContacto(Contacto c) {
		this.getLista().add(c);
	}
//Dado el nombre del contacto por parámetro lo elimina de la //lista

	public void eliminarContacto(String nombre) {
		for (int i = 0; i < this.getLista().size(); i++) {
			if (this.getLista().get(i).getNombreCompleto().equalsIgnoreCase(nombre)) {
				this.getLista().remove(i);
			}
		}
	}

	public static void main(String[] args) {
//		//Vamos a cargar la agenda de un fichero llamado //contacto.bin
//Segundo: Leer los contactos del fichero y cargarlos en AL
		Agenda agenda = new Agenda();
		agenda.cargarAgenda("contactos.bin");
		System.out.println("Los contactos de la agenda son: ");
		for (Contacto contacto : agenda.getLista()) {

			System.out.println(contacto);
		}

//Primero hay que cargar los contactos en la el AL y //guardarlos en el fichero

//		Contacto c = new Contacto("Pedro Perez", "123455", "C/Sauce", "pedro@ribera.es");
//		Contacto c1 = new Contacto("Marta López", "132324", "C/Olivo", "marta@ribera.es");
//		Contacto c2 = new Contacto("Carlos García", "345325", "C/Eucalipto", "carlos@ribera.es");
//		agenda.getLista().add(c);
//		agenda.getLista().add(c1);
//		agenda.getLista().add(c2);
//		agenda.guardarAgenda("contactos.bin");

	}

}
