package edu.upc.copaamerica;

public class Equipo {

	private String nombre = "Sudamerica";
	private String pais;
	private String entrenador;
/*	
	public Equipo()
	{
		
	}

	public Equipo(String nombre, String pais)
	{
		this.nombre = nombre;
		this.pais = pais;
	}*/

	private Equipo()
	{
		
	}

	private Equipo(String nombre, String pais)
	{
		this.nombre = nombre;
		this.pais = pais;
	}

	public static Equipo crearEquipo()
	{
		return new Equipo();
	} 
	
	public static Equipo crearEquipo(String nombre, String pais)
	{
		return new Equipo(nombre,pais);
	} 	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	
	
	
	
}
