package edu.upc.condominio.entidades;

import java.util.Date;

public class Cuota {
	
	private String idVivienda;
	private int periodo;
	double importe;
	Date fechaVencimiento;
	
	public Cuota(){
		
	}
	
	public Cuota(String idVivienda, int periodo, 
			 double importe, Date fechaVencimiento){
		this.idVivienda = idVivienda;
		this.periodo = periodo;
		this.importe = importe;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public String getCodigoVivienda() {
		return idVivienda;
	}
	
	public void setCodigoVivienda(String idVivienda) {
		this.idVivienda = idVivienda;
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

	//----------- Atilio
	
		private Vivienda vivienda;
		private Date fechaPago;
		private String tipoPago;
		
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

		
		
		//--------------------------------
	
	
	
}