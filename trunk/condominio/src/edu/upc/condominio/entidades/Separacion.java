package edu.upc.condominio.entidades;

import java.util.Date;

public class Separacion {

	String idSeparacion;
	AreaComun areaComun;
	Residente residente;
	Date fecha;
	int cantidadPersonas;
	String responsable;
	String comentario;
	
	public String getIdSeparacion() {
		return idSeparacion;
	}
	public void setIdSeparacion(String idSeparacion) {
		this.idSeparacion = idSeparacion;
	}
	public AreaComun getAreaComun() {
		return areaComun;
	}
	public void setAreaComun(AreaComun areaComun) {
		this.areaComun = areaComun;
	}
	public Residente getResidente() {
		return residente;
	}
	public void setResidente(Residente residente) {
		this.residente = residente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
