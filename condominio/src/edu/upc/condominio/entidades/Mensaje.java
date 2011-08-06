package edu.upc.condominio.entidades;

public class Mensaje {

	private String idMensaje;
	private Post post;
	private String contenido;
	private Contacto contacto;
	
	public Mensaje(String idMensaje,  Post post, String contenido, Contacto contacto){
		this.idMensaje = idMensaje;
		this.post = post;
		this.contenido = contenido;
		this.contacto = contacto;
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

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	
	
	
}
