package edu.upc.condominio.entidades;

public class Post {

	private String idPost;
	private String nombrePost;
	private Seccion seccion;
	private Usuario usuario;
	
	public Post(String idPost, String nombrePost, Seccion seccion, Usuario usuario){
		this.idPost = idPost;
		this.nombrePost = nombrePost;
		this.seccion = seccion;
		this.usuario = usuario;
	}
	public Post(){
		
	}

	public String getIdPost() {
		return idPost;
	}

	public void setIdPost(String idPost) {
		this.idPost = idPost;
	}

	public String getNombrePost() {
		return nombrePost;
	}

	public void setNombrePost(String nombrePost) {
		this.nombrePost = nombrePost;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
