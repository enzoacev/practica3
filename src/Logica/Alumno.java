package Logica;

public class Alumno {

	int id;
	String nombre;
	String apellido;
	
	//metodos
	public void mostrarNombre() {
		System.out.println("hola, soy un alumno");

	}

	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
