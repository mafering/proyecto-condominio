package epe.upc.copaamerica;

public class Equipo {

	private String nombre;
	private String pais;
	/*
	//Constructor sin Argumentos
	public Equipo(){
		
	}
	//Constructor con Argumentos
	public Equipo(String nombre, String pais){
		this.nombre = nombre;
		this.pais = pais;
	}
	 */
	
	
	public static Equipo crearEquipo()
	{
		return new Equipo();
	}
	
	private Equipo(){
		
	}
	//Constructor con Argumentos
	private Equipo(String nombre, String pais){
		this.nombre = nombre;
		this.pais = pais;
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
