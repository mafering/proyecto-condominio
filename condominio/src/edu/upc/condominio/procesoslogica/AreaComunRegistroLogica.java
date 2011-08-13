package edu.upc.condominio.procesoslogica;

public interface AreaComunRegistroLogica {
	
		public void registrar(String idAreaComun, 
														String tipoArea, 
														String ubicación,
														int capacidadPersonas, 
														String estado,
														
														int cantidadPersonasPorAsistir,
														String fecha,
														String responsableDni,
													    String comentario);
												
		public void actualizar(String idAreaComun, 
															String tipoArea, 
															String ubicación,
															int capacidadPersonas, 
															String estado);
		
		public void existe(String idAreaComun, String momento);
		
}
