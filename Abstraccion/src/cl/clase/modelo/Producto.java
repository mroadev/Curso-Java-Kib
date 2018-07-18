package cl.clase.modelo;

public class Producto {
	private int codigoProducto;
	private String nombre;
	private String tipo;
	private int precio;
	
	public Producto() {
		
	}
	
	
	public Producto(int codigoProducto, String nombre, String tipo, int precio) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}


	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
