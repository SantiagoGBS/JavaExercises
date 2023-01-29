package objetos;

import java.util.ArrayList;

public class Objeto {
//	en las clases vamos a tener dos tipos de atributos: private sirve para que solo se pueda ver dentro de la clase
	private String atributo1;
//	y protected. Protected solo lo debes poner cuando otras clases vayan a heredar de esta clase
	protected String atributo2;
	private ArrayList<String> atributo3;
//	En el constructor normalmente no vamos a pasar arrays ya que seguramente tengamos un metodo que cargue datos en el por lo tanto no pondremos
//	dicho array en los parametros y le iniciaremos de la siguiente manera
	public Objeto(String atributo1, String atributo2) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = new ArrayList<>();
	}
//	los getters y setters deben quedar de la siguiente manera
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	public ArrayList<String> getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(ArrayList<String> atributo3) {
		this.atributo3 = atributo3;
	}
	
	public void cargarArray() {
//		Para añadir un objeto a un array podremos hacerlo de dos maneras:
//		en esta manera crearemos el objeto dentro del add. Aqui sustituiremos String por el tipo de objeto que necesitemos y pondremos los 
//		parametros necesarios
		this.atributo3.add(new String("parametro"));
//		Tambien tenemos la siguiente manera que es crear un objeto y luego añadir ese objeto al array. Este metodo sirve para cuando
//		necesitas cargar un dato en ese objeto antes de meterlo en el array
		String dato ="";
		this.atributo3.add(dato);
	}
	public void consejos() {
/*
 * Cuando creas un objeto y necesitas acceder a algun atributo cogelos con los getters
 * Revisa bien que metodos tiene cada objeto ya que muchas veces se nos olvida 
 * Para acceder a los metodos de una clase hay que crear antes un objeto de esa clase y se accederia asi: objeto.metodo(); que no se te olviden los
 * parentesis
 */
	}
}
