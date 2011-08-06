package edu.upc.condominio.entidades;

public class AreaComun {
	String idAreaComun;
	String tipoArea;
	String ubicación;
	Integer capacidadPersonas;
	String estado;

	public AreaComun(String idAreaComun, String tipoArea, String ubicación,int capacidadPersonas, 
	        String estado){

	this.idAreaComun=idAreaComun;
	this.tipoArea=tipoArea;
	this.ubicación=ubicación;
	this.capacidadPersonas=capacidadPersonas;
	this.estado=estado;

	}

	public String gettipoArea(){
		return this.tipoArea;
	}

}