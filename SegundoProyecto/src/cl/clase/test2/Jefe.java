package cl.clase.test2;

public class Jefe extends Trabajador {

	@Override
	public int calcularSueldo(int sueldoBase) {
		// TODO Auto-generated method stub
		int bono = 100000;
		int gastosVarios = 200000;
		int sueldoTotal = sueldoBase + bono + gastosVarios;
		
		return sueldoTotal;
	}
	
}
