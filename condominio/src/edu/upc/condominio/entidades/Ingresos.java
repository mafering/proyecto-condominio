package edu.upc.condominio.entidades;

public class Ingresos {
	
  private String ingresoId;
  private Usuario idUsuario;
  private String tipoDeIngreso; 
  private String motivo;
  private String fecha;
  private int valor;
  
	public Ingresos (
			  String ingresoId,
			  Usuario idUsuario,
			  String tipoDeIngreso, 
			  String motivo,
			  String fecha,
			  int valor){
		  
		  this.ingresoId = ingresoId;
		  this.idUsuario =  idUsuario;
		  this.tipoDeIngreso = tipoDeIngreso; 
		  this.motivo =  motivo;
		  this.fecha = fecha;
		  this.valor = valor;
		  
	}

	public String getIngresoId() {
		return ingresoId;
	}

	public void setIngresoId(String ingresoId) {
		this.ingresoId = ingresoId;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String gettipoDeIngreso() {
		return tipoDeIngreso;
	}

	public void settipoDeIngreso(String tipoDeIngreso) {
		this.tipoDeIngreso = tipoDeIngreso;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	
}

