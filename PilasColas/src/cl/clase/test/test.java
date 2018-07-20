package cl.clase.test;

import cl.clase.ed.Pila;

public class test {

	public static void main(String[] args) {
		
		Pila p = new Pila();
		p.Mostrar();
		System.out.println("\n");
		
		p.Agregar(5);
		p.Agregar(19);
		p.Agregar(30);
		p.Agregar(10);
		p.Agregar(3);
		p.Agregar(9);
		p.Agregar(54);
		p.Agregar(1);
		p.Agregar(32);
		p.Agregar(15);
		p.Mostrar();
		System.out.println("\n");
		
		//System.out.println("El Valor Quitado es: " + p.Quitar());
		//System.out.println("\n");
		//p.Mostrar();
		
		p.Ordenar();
		p.Mostrar();
		System.out.println("\n");
		
		System.out.println("El Valor Extraido es: " +p.Extraer(7));
		System.out.println("\n");
		p.Mostrar();

	}

}
