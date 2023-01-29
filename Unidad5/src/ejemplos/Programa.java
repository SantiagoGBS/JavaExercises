package ejemplos;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona yo = new Persona("11111111h", "Juan", "Pereira", 18);
		System.out.println(yo);
		Persona tu = new Persona();
		System.out.println(tu);
		tu.setdni("22222222H");
		tu.setEdad(25);
		tu.setNombre("Clara");
		tu.setApellidos("garcia");
		System.out.println(tu);

	}

}
