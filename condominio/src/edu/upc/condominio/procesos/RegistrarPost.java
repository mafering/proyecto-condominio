package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Post;
import edu.upc.condominio.entidades.Seccion;
import edu.upc.condominio.entidades.Usuario;

public class RegistrarPost {

	public ArrayList<Post> posts;

	public RegistrarPost() {
		posts = new ArrayList<Post>();
	}

	public ArrayList<Post> getPost() {
		return posts;
	}
	
	public void registraPost(String idPost, String nombrePost, Seccion seccion, Usuario usuario) {


		if (usuario.getTipoUsuario().getIdTipoUsuario()==3) {
				throw new RuntimeException("No Puede Crear Post");
		}

		
		Post post= new Post( idPost,  nombrePost,  seccion,  usuario);
		posts.add(post);
	}
	
	public Post getPost(String idPost) {
		Post resultado = new Post();
		for(Post post: posts){
			if(post.getIdPost().equals(idPost)){
				resultado = post;
			}
		}
		return resultado;
	}
	public Post getPost(String idPost, Usuario usuario) {
		if(usuario.getTipoUsuario().getIdTipoUsuario()==3 && !idPost.equals("P003")){
			throw new RuntimeException("Solo Puede Visualizar el Post de Comite"); 
		}
		Post resultado = new Post();
		for(Post post: posts){
			if(post.getIdPost().equals(idPost)){
				resultado = post;
			}
		}
		return resultado;
	}
	
}
