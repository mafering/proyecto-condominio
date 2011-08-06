package edu.upc.condominio.entidades;

public class Mensaje {

	private String idMensaje;
	private Post post;
	private String contenido;
	private Usuario usuario ;
	
	public Mensaje(String idMensaje,  Post post, String contenido, Usuario usuario){
		this.idMensaje = idMensaje;
		this.post = post;
		this.contenido = contenido;
		this.usuario = usuario;
	}
	public Mensaje(){}

	public String getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(String idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	
}
