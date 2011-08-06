package edu.upc.condominio.entidades;

public class Residente {

	public String dni;
	public String nombres;
	public String apellidos;
	public int edad;
	public String correo;
	public String clave;
	
	public Residente(String dni, String nombres, String apellidos,int edad, 
			         String correo,String clave){
		
		this.dni=dni;
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.edad=edad;
		this.correo=correo;
		this.clave=clave;
	}
	public Residente(){
		
	}
	public String getDni(){
		return this.dni;
	}
	
	public String getCorreo(){
		return this.correo;
	}
	
}
