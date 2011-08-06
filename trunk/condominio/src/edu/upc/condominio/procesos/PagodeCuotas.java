package edu.upc.condominio.procesos;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;

public class PagodeCuotas {

	public ArrayList<Cuota> listaCuotas;
	
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
	
    public String PagarCuota(Cuota pago){
		
    	int i=0;
    	for(Cuota bean:listaCuotas){			
			if(bean.getVivienda().equals(pago.getVivienda()) && bean.getTipoPago()==null){		
				listaCuotas.set(i,pago);
				return "OK PAGO "+pago.getFechaPago();
			}	
			i++;
		}
		
		return "NO SE PAGO";
	}
	
}
