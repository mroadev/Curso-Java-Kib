package cl.clase.test2;

public class Colaborador extends Trabajador {

	@Override
	public int calcularSueldo(int sueldoBase) {
		// TODO Auto-generated method stub
		int colacion = 100000;
		int sueldoTotal = colacion + sueldoBase;
		
		return sueldoTotal;
	}


	
}
