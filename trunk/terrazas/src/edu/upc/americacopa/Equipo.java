package edu.upc.americacopa;

public class Equipo {

	private String nombre;
	private String pais;

	// construtor sin argumentos
	public Equipo() {

	}
	// construtor con argumentos
	
public Equipo(String nombre, String pais){
	this.nombre = nombre;
	this.pais = pais;
} 
	public static Equipo crearEquipo(){
	return new Equipo();
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

}
