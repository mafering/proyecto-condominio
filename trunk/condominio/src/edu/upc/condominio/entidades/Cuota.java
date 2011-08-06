package edu.upc.condominio.entidades;

import java.util.Date;

public class Cuota {
	

	private int periodo;
	double importe;
	Date fechaVencimiento;
	
	private Vivienda vivienda;
	private String tipoPago;
	private Date fechaPago;
	
	public Cuota(){
		
	}
	
	public Cuota(Vivienda vivienda, 
				int periodo, 
				double importe, 
				Date fechaVencimiento,
				String tipoPago,
				Date fechaPago){
		
		this.vivienda = vivienda;
		this.periodo = periodo;
		this.importe = importe;
		this.fechaVencimiento = fechaVencimiento;
		this.tipoPago =  tipoPago;
		this.fechaPago = fechaPago;
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

	
		public Vivienda getVivienda() {
			return vivienda;
		}

		public void setVivienda(Vivienda vivienda) {
			this.vivienda = vivienda;
		}
		
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

	
	
	
}