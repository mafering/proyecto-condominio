package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Contacto;
import edu.upc.condominio.entidades.Mensaje;
import edu.upc.condominio.entidades.Post;


public class RegistrarMensaje {

	private ArrayList<Mensaje> mensajes;

	public RegistrarMensaje() {
		mensajes= new ArrayList<Mensaje>();
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}
	
	void registrarMensaje(String idMensaje,  Post post, String contenido, Contacto contacto) {
		Mensaje mensaje= new Mensaje ( idMensaje,   post,  contenido,  contacto);
		mensajes.add(mensaje);
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
