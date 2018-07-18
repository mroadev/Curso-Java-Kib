package cl.clase.app;

public class Hebra2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<200; i++) {
			System.out.println("Hebra 2 Contador : " + i);
			try {
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
	}
	
}
