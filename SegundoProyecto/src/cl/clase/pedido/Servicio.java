package cl.clase.pedido;

public class Servicio {
	
	private int idServicio;
	private String Servicio;
	private String tipoServicio;
	
	public Servicio() {
		
	}
	
	public Servicio(int _idServicio, String _Servicio, String _tipoServicio) {
		idServicio = _idServicio;
		Servicio = _Servicio;
		tipoServicio = _tipoServicio;
	}
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public String getServicio() {
		return Servicio;
	}
	public void setServicio(String servicio) {
		Servicio = servicio;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	
	
}
