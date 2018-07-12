package cl.empresa.app;

public class Principal {
	
	public static void main(String[] args) {
		
		//String nombre = "Profesor";
		//System.out.println("Hola Mundo " + nombre);
		
		String saludo = Saludar("Profesor");
		
		System.out.println(saludo);
	}
	
	public static String Saludar(String nombre) {
		
		return "Hola " + nombre;
	}

}
