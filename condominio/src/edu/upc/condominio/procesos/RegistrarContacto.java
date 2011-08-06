package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Contacto;
import edu.upc.condominio.entidades.Residente;
import edu.upc.condominio.entidades.TipoUsuario;
import edu.upc.condominio.entidades.Vivienda;

public class RegistrarContacto {

	private ArrayList<Contacto> contactos;

	public RegistrarContacto() {
		contactos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	
	void registrarContacto(String idUsuario, TipoUsuario tipoUsuario, 
						Residente residente, Vivienda vivienda) {
		Contacto contacto= new Contacto(idUsuario, tipoUsuario, residente, vivienda);
		contactos.add(contacto);
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
