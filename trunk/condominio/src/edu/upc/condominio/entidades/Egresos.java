package edu.upc.condominio.entidades;

public class Egresos {
	
  private String ingresoId;
  private Usuario idUsuario;
  private String tipoDeEgreso; 
  private String motivo;
  private String fecha;
  private int valor;
  
	public Egresos (
			  String ingresoId,
			  Usuario idUsuario,
			  String tipoDeEgreso, 
			  String motivo,
			  String fecha,
			  int valor){
		  
		  this.ingresoId = ingresoId;
		  this.idUsuario =  idUsuario;
		  this.tipoDeEgreso = tipoDeEgreso; 
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

	public String getTipoDeEgreso() {
		return tipoDeEgreso;
	}

	public void setTipoDeEgreso(String tipoDeEgreso) {
		this.tipoDeEgreso = tipoDeEgreso;
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
