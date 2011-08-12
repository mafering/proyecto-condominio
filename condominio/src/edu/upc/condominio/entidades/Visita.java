package edu.upc.condominio.entidades;

import java.util.Date;

public class Visita {
	
	private String idVivienda;
	private Date fechaHoraVisita;
	private Date fechaHoraIngreso;
	private Date fechaHoraSalida;
	private Visitante visitante;
	private Vivienda vivienda;
	
	public Visita(Visitante visitante, Vivienda vivienda, Date fechaHoraVisita)
	{
		this.fechaHoraVisita = fechaHoraVisita;
		this.visitante = visitante;
		this.vivienda = vivienda;
	} 
	
	public Visita(Visitante visitante, Vivienda vivienda, 
			Date fechaHoraIngreso, Date fechaHoraSalida)
	{
		this.fechaHoraIngreso = fechaHoraIngreso;
		this.fechaHoraSalida = fechaHoraSalida;
		this.vivienda = vivienda;
	} 
	
	public String getIdVivienda() {
		return idVivienda;
	}
	public void setIdVivienda(String idVivienda) {
		this.idVivienda = idVivienda;
	}
	public Date getFechaHoraVisita() {
		return fechaHoraVisita;
	}
	public void setFechaHoraVisita(Date fechaHoraVisita) {
		this.fechaHoraVisita = fechaHoraVisita;
	}
	public Date getFechaHoraIngreso() {
		return fechaHoraIngreso;
	}
	public void setFechaHoraIngreso(Date fechaHoraIngreso) {
		this.fechaHoraIngreso = fechaHoraIngreso;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Vivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
	
	
	
}
