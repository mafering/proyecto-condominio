package edu.upc.condominio.procesos;

import edu.upc.condominio.entidades.AreaComun;
import edu.upc.condominio.procesoslogica.AreaComunSeparacionLogica;

public class AreaComunSeparacion implements AreaComunSeparacionLogica {
	private int valido = 0;
    private int registroActualizados = 0;

	public int getRegistroActualizados() {
		return registroActualizados;
	}

	public void separar(String idAreaComun, String fecha,
			int cantidadPersonasPorAsistir, String responsableDni,
			String comentario) {
		// TODO Auto-generated method stub
		
		
		sepacionValida(idAreaComun, fecha);
		if (valido == 0)  { 			responsableValido(responsableDni, fecha);
			if (valido == 0){ 			capacidadValida(idAreaComun, cantidadPersonasPorAsistir);
				if (valido == 0){  					
						for(AreaComun areaComun:RegistroAreaComun.getAreas()){
							if(areaComun.getIdAreaComun().equals(idAreaComun)){
									areaComun.setFecha(fecha);	
									areaComun.setCantidadPersonasPorAsistir(cantidadPersonasPorAsistir);
									areaComun.setResponsableDni(responsableDni);
									areaComun.setComentario(comentario);
									areaComun.setEstado("Reservado");
									System.out.println("El área común: " + idAreaComun + " - "  +   areaComun.getTipoArea()  + ", quedo RESERVADA.");
									registroActualizados++;
									break;			
								}
							}	
				}
			}
		}
		valido = 0;		

	}

	public void listadeReservas() {
		// TODO Auto-generated method stub
		
	}


		
	public void sepacionValida(String idAreaComun, String fecha) {
		for(AreaComun areaComun:RegistroAreaComun.getAreas()){
			if( ( areaComun.getIdAreaComun().equals(idAreaComun) && 
					( areaComun.getEstado().equals("Reservado")  ||   areaComun.getEstado().equals("En mantenimiento")  ) ) 
					&& areaComun.getFecha().equals(fecha) 
				){
				System.out.println("*Area común " +  areaComun.getIdAreaComun() + "-" + areaComun.getTipoArea()  + ", esta en: " + areaComun.getEstado() 
						+  ", el día " +  areaComun.getFecha());
				valido = 1;
				break;
			}
		}
	}
	
	public void responsableValido(String responsableDni, String fecha) {

		for(AreaComun areaComun:RegistroAreaComun.getAreas()){
			if(areaComun.getResponsableDni().equals(responsableDni) && areaComun.getFecha().equals(fecha)){
				valido = 1;
				System.out.println("**Residente : " +   areaComun.getResponsableDni()  + ", NO  puede separar 2 veces, en la misma fecha: " + fecha );
				break;
			}
		}
		
	}
	
	public void capacidadValida(String idAreaComun, int cantidadPersonasPorAsistir) {
		for(AreaComun areaComun:RegistroAreaComun.getAreas()){
				if(  areaComun.getIdAreaComun().equals(idAreaComun)  &&  cantidadPersonasPorAsistir  > areaComun.getCapacidadPersonas() ){
					System.out.println("***Excede el aforo de " +   areaComun.getCapacidadPersonas() + "per., solicitud " +   areaComun.getCantidadPersonasPorAsistir() + "DENEGADA");
					valido = 1;
					break;
			}
		}	
	}
	
	
	}



