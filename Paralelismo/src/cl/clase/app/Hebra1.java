package cl.clase.app;

public class Hebra1 implements Runnable{

	@Override
	public void run() {
		ejecutar("Hebra 1");
	}
	
	public  void ejecutar(String proceso) {
		for(int i=0; i<100; i++) {
			mensaje(proceso + " Contador : " + i);
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
			
		}
	}
	
	public void mensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
