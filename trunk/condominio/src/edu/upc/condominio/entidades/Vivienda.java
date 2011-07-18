package edu.upc.condominio.entidades;

public class Vivienda {
	private String idVivienda;
	private String ubicacion;
	private int numero;
	private double metraje;
	private String tipo;
	private String idResidente;

	public Vivienda(String idVivienda, String ubicacion, int numero,
			double metraje, String tipo, String idResidente) {

		this.idVivienda = idVivienda;
		this.ubicacion = ubicacion;
		this.numero = numero;
		this.metraje = metraje;
		this.tipo = tipo;
		this.idResidente = idResidente;
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

	public String getIdResidente() {
		return idResidente;
	}

	public void setIdResidente(String idResidente) {
		this.idResidente = idResidente;
	}

}
