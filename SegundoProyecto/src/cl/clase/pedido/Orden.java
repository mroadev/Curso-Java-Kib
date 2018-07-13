package cl.clase.pedido;

import java.time.LocalDate;

public class Orden {
	
	private int idOrden;
	private LocalDate fechaServicio;
	private String comentario;
	
	public Orden() {
		
	}
	
	public Orden(int _idOrden, LocalDate _fechaServicio, String _comentario) {
		idOrden=_idOrden;
		fechaServicio=_fechaServicio;
		comentario=_comentario;
	}
	
	public int getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}
	public LocalDate getFechaServicio() {
		return fechaServicio;
	}
	public void setFechaServicio(LocalDate fechaServicio) {
		this.fechaServicio = fechaServicio;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
