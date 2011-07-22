package edu.upc.condominio.entidades;

import java.util.Date;

public class Cuota {
	
	private String codigoVivienda;
	private int periodo;
	double importe;
	Date fechaVencimiento;
	
	//----------- Atilio
	
	private Vivienda vivienda;
	
	
	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}
	private Date fechaPago;
	private String tipoPago;
	
	
	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	
	
	//--------------------------------
	
	
	public Cuota(){
		
	}
	
	public Cuota(String codigoVivienda, int periodo, 
			 double importe, Date fechaVencimiento){
		this.codigoVivienda = codigoVivienda;
		this.periodo = periodo;
		this.importe = importe;
		this.fechaVencimiento = fechaVencimiento;
	}
	
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