package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Post;
import edu.upc.condominio.entidades.Seccion;
import edu.upc.condominio.entidades.Usuario;

public class RegistrarPost {

	private ArrayList<Post> posts;

	public RegistrarPost() {
		posts= new ArrayList<Post>();
	}

	public ArrayList<Post> getPost() {
		return posts;
	}
	
	void registrarPost(String idPost, String nombrePost, Seccion seccion, Usuario usuario) {
		Post post= new Post( idPost,  nombrePost,  seccion,  usuario);
		posts.add(post);
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
