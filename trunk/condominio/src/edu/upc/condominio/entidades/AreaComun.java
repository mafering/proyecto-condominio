package edu.upc.condominio.entidades;

public class AreaComun {
	String idAreaComun;
	String tipoArea;
	String ubicaci�n;
	Integer capacidadPersonas;
	String estado;
	
	String fecha;
	String responsable;
    String comentario;
   
   
	public AreaComun(String idAreaComun, String tipoArea, String ubicaci�n,int capacidadPersonas, 
	        String estado){

	this.idAreaComun=idAreaComun;
	this.tipoArea=tipoArea;
	this.ubicaci�n=ubicaci�n;
	this.capacidadPersonas=capacidadPersonas;
	this.estado=estado;

	}
/*
	public String gettipoArea(){
		return this.tipoArea;
	}*/

	public String getIdAreaComun() {
		return idAreaComun;
	}

	public void setIdAreaComun(String idAreaComun) {
		this.idAreaComun = idAreaComun;
	}

	public String getTipoArea() {
		return tipoArea;
	}

	public void setTipoArea(String tipoArea) {
		this.tipoArea = tipoArea;
	}

	public String getUbicaci�n() {
		return ubicaci�n;
	}

	public void setUbicaci�n(String ubicaci�n) {
		this.ubicaci�n = ubicaci�n;
	}

	public Integer getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(Integer capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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