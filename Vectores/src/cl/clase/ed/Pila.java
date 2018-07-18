package cl.clase.ed;

public class Pila {
	private int[] lista;
	private int indice = 0;
	
	public Pila() {
		lista = new int[10];
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}
	
	//Metodo Agregar
	public void Agregar(int valor) {
		
		if(indice < 10) {
			lista[indice]=valor;
			indice++;
		}else {
			System.out.println("Pila Llena");
		}
	}

	//Metodo Quitar
	public void Quitar() {
		if(indice != 0) {
			//lista[indice]=0;
			indice--;
		}else {
			System.out.println("Pila Vacia");
		}
	}
	
	public void Ordenar() {
		if(indice != 0) {
			
		}else {
			System.out.println("Pila Vacia");
		}
	}
	
	//Mostrar la Pila
	public void MostrarPila() {
		if(indice != 0) {
			for(int i = 0; i < indice; i++) {
				System.out.println("Indice " + i + " = " + lista[i]);
			}
		}else {
			System.out.println("Pila Vacia");
		}
	}

}
