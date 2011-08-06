package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Seccion;


public class RegistrarSeccion {
	
	private ArrayList<Seccion> secciones;

	public RegistrarSeccion() {
		secciones = new ArrayList<Seccion>();
	}

	public ArrayList<Seccion> getSeccion() {
		return secciones;
	}
	
	void registrarSeccion(String idSeccion, String descripcion) {
		Seccion seccion= new Seccion(idSeccion, descripcion);
		secciones.add(seccion);
	}
	
	/*
	public Visitante getVisitante(String dni) {
		Visitante resultado = new Visitante();
		for(Visitante visitante: visitantes){
			if(visitante.getDni().equals(dni)){
				resultado = visitante;
			}
		}
		return resultado;
	}
	*/
	
}
