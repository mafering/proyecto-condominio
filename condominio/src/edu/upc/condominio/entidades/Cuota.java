package edu.upc.condominio.entidades;

import java.util.Date;

public class Cuota {
	
	private int periodo;
	double importe;
	Date fechaVencimiento;
	private String codigoVivienda;
	
	public String getCodigoVivienda() {
		return codigoVivienda;
	}
	public void setCodigoVivienda(String codigoVivienda) {
		this.codigoVivienda = codigoVivienda;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	
	
	
	
}