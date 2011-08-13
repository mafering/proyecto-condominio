package edu.upc.condominio.procesoslogica;

import java.util.ArrayList;

import edu.upc.condominio.entidades.AreaComun;


public interface AreaComunSeparacionLogica {

	public void separacionValida(String idAreaComun, String fecha);
	public void responsableValido(String responsableDni, String fecha);
	public void capacidadValida(String idAreaComun, int cantidadPersonasPorAsistir);
	
	public void separar(String idAreaComun, 
			String fecha,
			int cantidadPersonasPorAsistir,
			String responsableDni,
		    String comentario);
	
	public void listadeReservas();
	
}
