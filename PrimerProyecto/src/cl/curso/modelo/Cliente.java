package cl.curso.modelo;

public class Cliente {
	//Atributos Privados
	private int codigoCliente;
	private String nombreCliente;
	private int edadCliente;
	private String tipoCliente;

	// Constructor
	
	
	// Getter and Setter
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getEdadCliente() {
		return edadCliente;
	}
	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
}
