package cl.clase.app;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Hebra1 hebra = new Hebra1();
		Thread hebra1 = new Thread(hebra);
		
		Hebra2 h = new Hebra2();
		Thread hebra2 = new Thread(h);
		
		hebra1.start();
		hebra2.start();
		
		Thread.sleep(5000);
		hebra1.stop(); //Cuando el metodo está tachado significa que está depreciado y no se utiliza asi.
		
		Thread.sleep(5000);
		hebra2.stop();
		
	}


	
}
