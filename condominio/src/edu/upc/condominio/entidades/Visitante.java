package edu.upc.condominio.entidades;

public class Visitante {

	public String dni;
	public String nombres;
	public String apellidos;

	public Visitante(String dni, String nombres, String apellidos) {
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
