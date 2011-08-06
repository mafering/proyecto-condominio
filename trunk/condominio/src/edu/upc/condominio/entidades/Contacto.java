package edu.upc.condominio.entidades;

public class Contacto extends Usuario {
	
	private Residente residente;
	
	
	public Contacto(){
	}
	
	public Contacto(String idUsuario, TipoUsuario tipoUsuario, Residente residente, Vivienda vivienda){
		this.idUsuario =idUsuario; 
		this.tipoUsuario =tipoUsuario; 
		this.residente = residente;
		this.vivienda = vivienda;
	}
	
	public Residente getResidente() {
		return residente;
	}

	public void setResidente(Residente residente) {
		this.residente = residente;
	}

	
	
	

}
