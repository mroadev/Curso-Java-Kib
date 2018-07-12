package cl.curso.modelo;

public class Producto {
	//Atributos Privados
	private int codigoProducto;
	private String marca;
	private String nombreProducto;
	private int precio;
	private int Stock;
	
	// Constructor
	public Producto() {
		
	}
	
	public Producto(int _codigoProducto,String _marca, String _nombreProducto, int _precio,int _Stock) {
		codigoProducto = _codigoProducto;
		marca = _marca;
		nombreProducto = _nombreProducto;
		precio = _precio;
		Stock = _Stock;
	}
	
	// Getter and Setter
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}

	
	
}
