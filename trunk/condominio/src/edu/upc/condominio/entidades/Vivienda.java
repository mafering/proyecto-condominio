package edu.upc.condominio.entidades;

public class Vivienda {
	private String idVivienda;
	private String ubicacion;
	private int numero;
	private double metraje;
	private String tipo;
	
	//------ ATILIO--------
	
	private Residente residente;
	
	

	public Residente getResidente() {
		return residente;
	}

	public void setResidente(Residente residente) {
		this.residente = residente;
	}
	
	// -----------------------------

	public Vivienda(String idVivienda, String ubicacion, int numero,
			double metraje, String tipo, Residente residente) {

		this.idVivienda = idVivienda;
		this.ubicacion = ubicacion;
		this.numero = numero;
		this.metraje = metraje;
		this.tipo = tipo;
		this.residente = residente;
	}
	public Vivienda(){
		
	}
			
	public String getIdVivienda() {
		return idVivienda;
	}

	public void setIdVivienda(String idVivienda) {
		this.idVivienda = idVivienda;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getMetraje() {
		return metraje;
	}

	public void setMetraje(double metraje) {
		this.metraje = metraje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
