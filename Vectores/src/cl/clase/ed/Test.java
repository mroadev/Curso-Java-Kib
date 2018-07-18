package cl.clase.ed;

public class Test {

	public static void main(String[] args) {
		Pila pila = new Pila();
		
		pila.MostrarPila();
		pila.Agregar(100);
		pila.Agregar(30);
		pila.Agregar(-400);
		pila.Agregar(200);
		pila.Agregar(20);
		pila.Agregar(500);
		pila.Agregar(13);
		pila.Agregar(67);
		pila.Agregar(234);
		pila.Agregar(10);
		pila.MostrarPila();
		pila.Agregar(11);
		pila.Agregar(12);
		pila.Quitar();
		pila.MostrarPila();
	}

}
