package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.AreaComun;

public class RegistroAreaComun {
private ArrayList<AreaComun> areas;

	
	public RegistroAreaComun () {	
		areas=new ArrayList<AreaComun>();
	}
	
	
	public ArrayList<AreaComun> getareas(){
		return areas;
	}
	
	void registrarAreaComun(String idAreaComun, String tipoArea, String ubicación,int capacidadPersonas, 
		    String estado){
				
		buscartipoArea(tipoArea);
		AreaComun areaComun=new AreaComun(idAreaComun, tipoArea, ubicación,capacidadPersonas, estado);
		areas.add(areaComun);
			}
	
	private void buscartipoArea(String tipoArea){
		for (AreaComun areaComun:areas){
			if (areaComun.gettipoArea().equals(tipoArea)){
				throw new RuntimeException("AREA YA REGISTRADO");
			}
		}
	}


}