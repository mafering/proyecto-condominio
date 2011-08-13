package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.procesoslogica.AreaComunRegistroLogica;


import edu.upc.condominio.entidades.AreaComun;
import edu.upc.condominio.entidades.Cuota;

public class RegistroAreaComun implements AreaComunRegistroLogica {
	
	private int registroExiste = 0;
	private int registroActualizados  = 0;
	
    public static  ArrayList<AreaComun>  areas = new ArrayList<AreaComun>();
    
	public static ArrayList<AreaComun> getAreas() {
		return areas;
	}

	public int getRegistroActualizados() {
		return registroActualizados;
	}

	public void registrar(String idAreaComun, 
			String tipoArea, 
			String ubicación,
			int capacidadPersonas, 
			String estado,
			int cantidadPersonasPorAsistir, 
			String fecha,
			String responsableDni,
		    String comentario){
				
			existe(tipoArea, "Nuevo");
			
			if (registroExiste == 0){
				AreaComun areaComun = new AreaComun(idAreaComun,  tipoArea, ubicación, capacidadPersonas, estado,  cantidadPersonasPorAsistir,fecha, responsableDni,comentario);
				areas.add(areaComun);
				System.out.println("Se registro con éxito el área común : " + tipoArea);
			}		
		}
	
	public  void existe(String idAreaComun, String momento){
		registroExiste = 0;
		for (AreaComun areaComun:areas){
			if (areaComun.getIdAreaComun().equals(idAreaComun)){
				registroExiste = 1;
				if(momento == "Nuevo"){
					System.out.println("El área común: " + idAreaComun + "  existe.");	
					}				
				break;
			}
		}
	}
	
	public void actualizar(String idAreaComun, 
			String tipoArea, 
			String ubicación,
			int capacidadPersonas, 
			String estado){
		
		existe(idAreaComun, "Actualizacion");
		
		if (registroExiste == 0 ) {
			System.out.println("El área común: " + idAreaComun + " NO existe.");
		}else{
				for(AreaComun areaComun:RegistroAreaComun.getAreas()){
	
					if(areaComun.getIdAreaComun().equals(idAreaComun)){
	
							areaComun.setTipoArea(tipoArea);	
							areaComun.setUbicación(ubicación);
							areaComun.setCapacidadPersonas(capacidadPersonas); 
							areaComun.setEstado(estado);
							System.out.println("El área común: " + idAreaComun + ", se ha actualizado satisfactoriamente.");
							registroActualizados++;
							break;
							//mensaje = "El área común se ha reservado satisfactoriamente.";
							//break			
						}
					}	
		}
			
		}

			

}