package edu.upc.condominio.procesos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Visitante;
import edu.upc.condominio.entidades.Vivienda;

public class RegistroVisita {

	private ArrayList<Visita> visitas;
	
	
	public RegistroVisita(){
		visitas = new ArrayList<Visita>();
	}
	
	/*
	 * 
		this.fechaHoraVisita = fechaHoraVisita;
		this.fechaHoraIngreso = fechaHoraIngreso;
		this.fechaHoraSalida = fechaHoraSalida;
		this.idVivienda = idVivienda;
	 */
	
	public Visita registrarVisita(Visitante visitante, 
								Vivienda vivienda, Date fechaHoraVisita){
		
		Visita visita= new Visita(visitante, vivienda, fechaHoraVisita);
		visitas.add(visita);
		return visita;
	}
	
	public void registrarIngresoSalidaVisita(Visita visita, Date fechaHoraIngreso, 
			Date fechaHoraSalida)
	{	
		int posicion = visitas.indexOf(visita);
		Visita visitaActualiza = visitas.get(posicion);
		visitaActualiza.setFechaHoraIngreso(fechaHoraIngreso);
		visitaActualiza.setFechaHoraSalida(fechaHoraSalida);
		visitas.set(posicion, visitaActualiza);
	}
	
	public ArrayList<Visita> getVisitas()
	{
		return visitas;
	}
	

}