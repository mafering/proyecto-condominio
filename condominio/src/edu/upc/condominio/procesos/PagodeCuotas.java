package edu.upc.condominio.procesos;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Vivienda;

public class PagodeCuotas {

	public ArrayList<Cuota> listaCuotas;
	
	public PagodeCuotas(){}
	
	
	public PagodeCuotas(ArrayList<Cuota> listaCuotas){
		this.listaCuotas=listaCuotas;
	}
	
	public ArrayList<Cuota> listaCuotas(String codVivienda){
		
		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){			
			if(bean.getVivienda().equals(codVivienda) && bean.getTipoPago()==null){		
				lstDeuda.add(bean);
			}			
		}
		
		return lstDeuda;
		
	}
	

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
	
}
