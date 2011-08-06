package edu.upc.condominio.entidades;

public class Usuario{
	
	Residente residente;
	String idUsuario;
	String nombreUsuario;
	TipoUsuario tipoUsuario;
	Vivienda vivienda;
	
	public Usuario(String idUsuario, String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.tipoUsuario = tipoUsuario;
		this.vivienda = vivienda;
	}
	
	public Usuario(String idUsuario, String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda, Residente residente){
		this.idUsuario =idUsuario; 
		this.nombreUsuario = nombreUsuario;
		this.tipoUsuario =tipoUsuario; 
		this.residente = residente;
		this.vivienda = vivienda;
	}
	
	
	public Usuario(){
		
	}
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}
	public Residente getResidente() {
		return residente;
	}
	public void setResidente(Residente residente) {
		this.residente = residente;
	}
	
	
	
	
	
	
}
