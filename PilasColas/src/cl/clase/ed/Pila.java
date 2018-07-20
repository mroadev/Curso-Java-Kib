package cl.clase.ed;

public class Pila implements Accion {

	public int[] pila;
	public int puntero=0;
	public int[] pilapaso;
	
	public Pila() {
		pila = new int[10];
		pilapaso = new int[10];
	}
	
	@Override
	public void Agregar(int valor) {
		if(puntero < 10) {
			pila[puntero]=valor;
			puntero++;
		}else {
			System.out.println("La Pila está Llena");
		}
	}

	@Override
	public int Quitar() {
		int aux = pila[puntero-1];
		if(puntero > 0) {
			puntero=puntero-1;
			pila[puntero]=0;
		}
		return aux;
	}

	@Override
	public void Mostrar() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Pila[" + i + "] = " + pila[i]);
		}
		
	}

	@Override
	public void Borrar() {
		puntero=0;
		pila = null;
		pila =new int[10];
	}

	@Override
	public void Ordenar() {
		if(puntero != 0) {
			//Si Pila no está vacía, la ordena
			for (int k = 0; k < puntero - 1; k++)
				for (int f = 0; f < puntero - 1; f++)
					if (pila[f] > pila[f + 1])
					{
						int aux;
						aux = pila[f];
						pila[f] = pila[f + 1];
						pila[f + 1] = aux;
					}	
		}else {
			System.out.println("La Pila está Vacia");
		}
		
	}

	@Override
	public int Extraer(int indice) {
		int aux;
		aux = pila[indice];
		if(indice > 0) {
			int pos=0;
			for(int i = indice+1; i > puntero; i++) {
					pilapaso[pos] = pila[i];
					pos++;
			}
			int posind=indice;
			for(int j = 0; j<pos; j++) {
				pila[posind]=pilapaso[j];
				posind++;
			}
		}else if(indice==0) {
			
		}
		return aux;
	}

	@Override
	public int Tamano() {
		return puntero+1;
	}

}
