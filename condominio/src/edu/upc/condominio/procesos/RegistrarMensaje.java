package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Contacto;
import edu.upc.condominio.entidades.Mensaje;
import edu.upc.condominio.entidades.Post;
import edu.upc.condominio.entidades.Usuario;


public class RegistrarMensaje {

	private ArrayList<Mensaje> mensajes;

	public RegistrarMensaje() {
		mensajes= new ArrayList<Mensaje>();
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}
	
	public void registrarMensaje(String idMensaje,  Post post, String contenido, Usuario usuario) {
		
		if (usuario.getTipoUsuario().getIdTipoUsuario()==3 && post.getSeccion().getIdSeccion().equals("P003")) {
			throw new RuntimeException("No Puede Escribir Mensajes solo Visualizar");
		}
		if (usuario.getTipoUsuario().getIdTipoUsuario()==3 && !post.getSeccion().getIdSeccion().equals("P003")) {
			throw new RuntimeException("No Puede Escribir Mensajes solo Visualizar");
		}
				
		Mensaje mensaje= new Mensaje ( idMensaje,   post,  contenido,  usuario);
		mensajes.add(mensaje);
	}
	
	
}
