package cl.clase.run;

import java.util.ArrayList;
import java.util.List;

import cl.clase.test1.Afiliado;
import cl.clase.test2.Colaborador;
import cl.clase.test2.Gerente;
import cl.clase.test2.Jefe;
import cl.clase.test2.Trabajador;

public class Prueba {

	public static void main(String[] args) {
		/*
		Afiliado afil = new Afiliado();
		//afil.setIdentificacion(50);
		//afil.setNombre("Pedro");
		afil.setEdad(20);
		afil.setCodigoPlan(1000);
		afil.setPlan("Plan Santa Maria");
		
		System.out.println("Su Identificacion : " + afil.getIdentificacion());
		System.out.println("Su nombre : " + afil.getNombre());
		
		int sueldo = 1000000;
		Trabajador juan = new Jefe();
		int liquidacion = juan.calcularSueldo(sueldo);
		
		System.out.println("Liquidacion : " + liquidacion);
		*/
		
		// Arreglos
		int[] lista = {10,20,30,40};
		//int[][] lista1;
		
		String[] nombres = {"Alvaro","Eduardo","Carla","Pamela"};
		char[] codigos = {'a','b'};
		
		for(int i=0; i< lista.length; i++) {
			System.out.println("Valor del array lista[" + i + "]=" + lista[i]);
		}
		
		System.out.println();
		
		int j=0;
		while(j<nombres.length) {
			System.out.println("Valor del array nombres[" + j + "]=" + nombres[j]);
			j++;
		}
		System.out.println();
		
		int k = 0;
		do {
			System.out.println("Valor del array codigos[" + k + "]=" + codigos[k]);
			k++;
		}while(k < codigos.length);
		
		
		List mlista = new ArrayList();
		mlista.add("Maria");
		mlista.add("Kamila");
		mlista.add("Francisca");
		
		List<String> apellidos = new ArrayList<>();
		apellidos.add("Fuentes");
		apellidos.add("Gonzalez");
		apellidos.add("Tapia");
		
		List<Afiliado> empleados = new ArrayList<>();
		Afiliado afiliado = new Afiliado();
		afiliado.setIdentificacion(10);
		afiliado.setNombre("Marcelo");
		
		empleados.add(afiliado);
		
		empleados.get(0).setNombre("Ricardo");
		System.out.println("Empleado " + empleados.get(0).getIdentificacion() + " - " + empleados.get(0).getNombre());
		
		
		
		
	}

}
