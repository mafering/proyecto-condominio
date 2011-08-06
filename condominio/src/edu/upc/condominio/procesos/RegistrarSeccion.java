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
	
	public void registrarSeccion(String idSeccion, String descripcion) {
		Seccion seccion= new Seccion(idSeccion, descripcion);
		secciones.add(seccion);
	}
	
	public Seccion getSeccion(String idSeccion) {
		Seccion resultado = new Seccion();
		for(Seccion seccion: secciones){
			if(seccion.getIdSeccion().equals(idSeccion)){
				resultado = seccion;
			}
		}
		return resultado;
	}
	
}
