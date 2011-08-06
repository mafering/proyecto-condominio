package edu.upc.condominio.entidades;

public class Seccion {

	private String idSeccion;
	private String nombreSeccion;
	
	public Seccion(String idSeccion, String nombreSeccion) {
		this.idSeccion = idSeccion;
		this.nombreSeccion = nombreSeccion;
		
	}
	public Seccion()
	{
		
	}
	public String getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(String idSeccion) {
		this.idSeccion = idSeccion;
	}
	public String getNombreSeccion() {
		return nombreSeccion;
	}
	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}
	
	
	
}
