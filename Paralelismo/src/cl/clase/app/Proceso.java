package cl.clase.app;

public class Proceso {

	public  void ejecutar(String proceso) {
		for(int i=0; i<1000; i++) {
			mensaje(proceso + " Contador : " + i);
		}
	}
	
	public void mensaje(String mensaje) {
		System.out.println("Proceso : " + mensaje);
	}
}
