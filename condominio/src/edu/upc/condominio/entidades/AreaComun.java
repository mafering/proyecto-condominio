package edu.upc.condominio.entidades;

public class AreaComun {
	String idAreaComun;
	String tipoArea;
	String ubicaci�n;
	Integer capacidadPersonas;
	String estado;

	public AreaComun(String idAreaComun, String tipoArea, String ubicaci�n,int capacidadPersonas, 
	        String estado){

	this.idAreaComun=idAreaComun;
	this.tipoArea=tipoArea;
	this.ubicaci�n=ubicaci�n;
	this.capacidadPersonas=capacidadPersonas;
	this.estado=estado;

	}

	public String gettipoArea(){
		return this.tipoArea;
	}

}