package cl.clase.modelo;

public class Usuario {
	private int codigoUsuario;
	private String usuario;
	private String nombre;
	private String clave;
	
	public Usuario() {
		
	}
	
	public Usuario(int codigoUsuario, String usuario, String nombre, String clave) {
		//super();
		this.codigoUsuario = codigoUsuario;
		this.usuario = usuario;
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}
