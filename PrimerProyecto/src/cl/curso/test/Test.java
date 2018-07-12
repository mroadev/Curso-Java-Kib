package cl.curso.test;

import cl.curso.modelo.Producto;

public class Test {

	public static void main(String[] args) {
		// TIPOS PRIMITIDOS
		
		// Tipos Numéricos 
		int valor; // 32 bit (2^32-1)
		valor = 10;
		System.out.println("El valor int " + valor);
		
		long valor1 = 2000L; // 64 bit (2^64-1)
		System.out.println("El valor long " + valor1);
		
		short valor2 = 32423;
		System.out.println("El valor short " + valor2);
		
		// Boolean
		boolean presente = true;
		System.out.println("El valor Boolean " + presente);
		
		// Punto Flotante
		float valor3 = 23.345f; // 32 bit
		System.out.println("El valor float " + valor3);
		
		double valor4 = 0.000232d;  // 64 bit
		System.out.println("El valor float " + valor4);
		
		// Tipo Caracteres
		char valor5 = 'A';
		System.out.println("El valor char " + valor5);

		String valor6 = "Hola cómo estas";
		System.out.println("El valor String " + valor6);
		
		// fin tipos de datos
		
		// Constantes
		final int EDAD_USUARIO = 20;
		System.out.println("Edad Usuario:" + EDAD_USUARIO);
		
		calcularSuma(); // El método debe ser Static para invocar desde main
		
		int solucion = obtenerSuma(30,50);
		System.out.println("Suma 1: " + solucion);
		System.out.println("Suma 2: " + obtenerSuma(20,30));
		
		// Estructuras de Control
		int dia = 30;
		
		if(dia == 30) {
			System.out.println("Es fin de mes.");
		} else {
			System.out.println("No es fin de mes.");
		}
		
		int opcion = 4;
		switch (opcion) {
		case 1:
			System.out.println("Selecciono opcion 1");
			break;
		case 2:
			System.out.println("Selecciono opcion 2");
			break;
		case 3:
			System.out.println("Selecciono opcion 3");
			break;
		default:
			System.out.println("Seleccion no valida");
			break;
		}
		
		String sexo = "M";
		switch (sexo) {
		case "M":
			System.out.println("Masculino");
			break;
		case "F":
			System.out.println("Femenino");
			break;
		default:
			System.out.println("Investigar");
			break;
		}
		
		// CICLOS
		
		// For
		for(int i=1; i<=10; i++) {
			System.out.println("Contador i " + i);
		}
		
		// While
		int j = 1;
		while(j <= 10) {
			System.out.println("Contador j " + j);
			j++;
		}
		
		// Do While
		int k = 1;
		do {
			System.out.println("Contador k " + k);
			k++;
		}while(k <= 10);
		
		// INSTANCIA DE LA CLASE PRODUCTO
		Producto producto = new Producto(1,"CIC","Escritorio",1500000,10);
		System.out.println("Antes " + producto.getNombreProducto());
		producto.setNombreProducto("Mesa");
		System.out.println("Despues " + producto.getNombreProducto());
		
		// matar objeto, sobretodo cuando trabajan con dispositivos moviles
		producto = null;
		
		Producto prod = new Producto();
		prod.setCodigoProducto(1);
		prod.setMarca("MUEBLES");
		prod.setNombreProducto("Silla");
		prod.setPrecio(50000);
		prod.setStock(1000);
		
		System.out.println("Stock Actual : " + prod.getStock());
		System.out.println("Stock Rebajado : " + rebajarStock(prod).getStock());
		
		System.out.println("Precio Actual : " + prod.getPrecio());
		System.out.println("Precio Rebajado : " + rebajarPrecio(prod).getPrecio());	
		
	}
	
	// Metodo para Rebajar en Una Unidad el Stock de un producto
	public static Producto rebajarStock(Producto Prod) {
		// Restar una unidad del stock
		Prod.setStock(Prod.getStock()-1);
		return Prod;
	}
	
	public static Producto rebajarPrecio(Producto Prod) {
		Prod.setPrecio((int)(Prod.getPrecio()*0.8));
		return Prod;
	}
	
	// Métodos
	public static void calcularSuma() {
		int a = 10;
		int b = 20;
		
		/*
		 * int a, b;
		 * a = 10;
		 * b = 20; 
		 */

		int res = a + b;
		System.out.println("Solucion :" + res);
	}
	
	public static int obtenerSuma(int a, int b) {
		return a + b;
	}
}
