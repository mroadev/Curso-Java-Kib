package cl.clase.test1;

public class Persona {
	private int identificacion;
	private String nombre;
	private int edad;
	
	
	public Persona() {
	}

	public Persona(int identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}

	public Persona(int identificacion, String nombre, int edad) {
		//super(); Se borra porque hace referencia a clase Object
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Getter and Setter
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
