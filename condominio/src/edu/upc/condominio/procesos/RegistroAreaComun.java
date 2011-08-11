package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.AreaComun;
import edu.upc.condominio.entidades.Cuota;

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
			if (areaComun.getTipoArea().equals(tipoArea)){
				throw new RuntimeException("AREA YA REGISTRADO");
			}
		}
	}
	
	
	public void acualizar(AreaComun area){
		// ArrayList<Cuota> listadeuda=new ArrayList<Cuota>();
		int c=0;
		int d=0;
		for (AreaComun ent1: areas){
		if(ent1.getIdAreaComun().equals(area.getIdAreaComun())){
		areas.set(c, area);
		d=1;
		
		//return;
		}
		c++;
		}
		if (d==0){ 
		throw new RuntimeException("AREA NO ENCONTRADA VERIFIQUE");
		/*}
		else{
			throw new RuntimeException("AREA MODIFICADA");
		}*/
		}
		//return listadeuda;
		}


}