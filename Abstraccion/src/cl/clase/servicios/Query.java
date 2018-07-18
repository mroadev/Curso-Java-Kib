package cl.clase.servicios;

public abstract class Query {
	
	private int descuento;
	
	public Query(int desc) {
		descuento = desc;
	}
	
	public abstract int calculo(int valor);
	
	public abstract int conteo(int valor);
	
	public void mensaje(String mensaje) {
		System.out.println("Mensaje producto : " + mensaje);
	}
	
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}
