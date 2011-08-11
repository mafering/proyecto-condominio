package edu.upc.condominio.procesos;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Vivienda;

public class PagodeCuotas {

	//public ArrayList<Cuota> listaCuotas;
	 ArrayList<Cuota> lista;
	 ArrayList<Cuota> listadeuda=new ArrayList<Cuota>();
	
	
	public PagodeCuotas(ArrayList<Cuota> lista){
		this.lista = lista;
	}
	
//	private ArrayList<Cuota> cuotasporpagar;
	
	public void agregar(Cuota ent){
		lista.add(ent);
		}
	public void pagarCuota(Cuota cuota, String tipoPago, Date fechaPago)
	{		
		int posicion = lista.indexOf(cuota);
		Cuota pagoCuota= lista.get(posicion);
		pagoCuota.setTipoPago(tipoPago);
		pagoCuota.setFechaPago(fechaPago);
		lista.set(posicion, pagoCuota);
		
	}
	public ArrayList<Cuota> listardeudas(){
		 ArrayList<Cuota> listadeuda=new ArrayList<Cuota>();
		for (Cuota ent1:lista){
			if(ent1.getTipoPago().equals("")){
			listadeuda.add(ent1);			
			}
		}
		return listadeuda;	
		}
	
	public ArrayList<Cuota> getCuotas(){
		//listar(lista);
		return lista;
	}
	
	
	
	public void acualizar(Cuota ent){
		// ArrayList<Cuota> listadeuda=new ArrayList<Cuota>();
		int c=0;
		for (Cuota ent1: lista){
		if(ent1.getVivienda().equals(ent.getVivienda())){
		lista.set(c, ent);
		return;
		}
		c++;

		}
		//return listadeuda;
		}
	

		}
	
/*	public PagodeCuotas(ArrayList<Cuota> listaCuotas){
		this.listaCuotas=listaCuotas;
	}*/
	
	/*public ArrayList<Cuota> listaCuotas(String codVivienda){
		
		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){			
			if(bean.getVivienda().equals(codVivienda) && bean.getTipoPago()==null){		
				lstDeuda.add(bean);
			}			
		}
		
		return lstDeuda;
		
	}*/
	
/*	
public String listar(){
	
}
		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){			
			if(bean.getVivienda().equals(listacuotas.)) && bean.getTipoPago()==null){		
				lstDeuda.add(bean);
			}			
		}
		
		return lstDeuda;
	

	public void PagarPeriodoCuota(String viviendaId, int periodo,
			String tipoPago) {
		
		
		for(Cuota bean:listaCuotas){			
			if(bean.getVivienda().equals(viviendaId) && bean.getPeriodo()==periodo){		
				//listaCuotas.set(i,pago);
				bean.setTipoPago(tipoPago);
				System.out.println("Pago Realizado:" + viviendaId + " del periodo: " +  periodo);
				//  bean.setFechaPago("15/07/2011");
			}
		
		}

		
	}
	
}*/
