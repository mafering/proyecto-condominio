package edu.upc.condominio.entidades;

public class AreaComun {
	String idAreaComun;
	String tipoArea;
	String ubicación;
	Integer capacidadPersonas;
	String estado;
	
	String fecha;
	String responsable;
    String comentario;
   
   
	public AreaComun(String idAreaComun, 
												String tipoArea, 
												String ubicación,
												int capacidadPersonas, 
												String estado,
												String fecha,
												String responsable,
											    String comentario											
												){
		
	this.idAreaComun=idAreaComun;
	this.tipoArea=tipoArea;
	this.ubicación=ubicación;
	this.capacidadPersonas=capacidadPersonas;
	this.estado=estado;
	
	this.fecha =  fecha;
	this.responsable =  responsable;
	this.comentario = comentario; 

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

	public String getUbicación() {
		return ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
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