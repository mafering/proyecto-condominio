package edu.upc.condominio.procesos;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;

public class PagodeCuota {

	public ArrayList<Cuota> listaCuotas;

	public PagodeCuota(ArrayList<Cuota> listaCuotas){
		this.listaCuotas=listaCuotas;
	}

	/*public ArrayList<Cuota> listaCuotas(String codVivienda){

		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){			
			if(bean.getCodigoVivienda().equals(codVivienda) && bean.getTipoPago()==null){		
				lstDeuda.add(bean);
			}			
		}

		return lstDeuda;

	}*/


	public ArrayList<Cuota> listaCuotas(){

		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){
			if(bean.getTipoPago()==null){
				lstDeuda.add(bean);
			}
		}
		return lstDeuda;

	}

	public void PagarCuota(String codigoVivienda, int periodo, String tipoPago){
		
		for(Cuota bean:listaCuotas){			
			if(bean.getCodigoVivienda().equals(codigoVivienda) && bean.getPeriodo()==periodo){		
				//listaCuotas.set(i,pago);
				bean.setTipoPago(tipoPago);
				//  bean.setFechaPago("15/07/2011");
			}
		
		}
	}
		//return "NO SE PAGO";
		
}

