package edu.upc.condominio.procesos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Residente;
import edu.upc.condominio.entidades.Vivienda;

public class ConsultaDeMorosos {


	public ArrayList<Cuota> listaCuotas;
	public ArrayList<Vivienda> listaViviendas;
	public ArrayList<Residente> listaResidentes;
	
	public ConsultaDeMorosos(ArrayList<Cuota> listaCuotas,ArrayList<Vivienda> listaViviendas,ArrayList<Residente> listaResidentes){
		this.listaCuotas=listaCuotas;
		this.listaViviendas=listaViviendas;
		this.listaResidentes=listaResidentes;
	}
	 
	
/*
	public ArrayList<Cuota> listaCuotasMorosos(Date fecha){
	
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		
		
		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		
		String viviendaCodigo = "";
		String viviendaUbicacion= "";
		String residenteDni= "";
		String residenteNombre= "";
		String vencimientoFecha= "";
		String vencimientoDias= "";
		String importe= "";
	
		System.out.println("LISTA DE MOROSOS AL : "+format.format(fecha) +"\n");
		
		System.out.println("RESIDENTE			| VIVIENDA			|VENCIMIENTO		   |IMPORTE");
		
		for(Cuota bean:listaCuotas){	
			
			Date fechaPagar=bean.getFechaVencimiento();
			
			if(fechaPagar.compareTo(fecha) < 0 && bean.getTipoPago() == null)
			{				
			
				lstDeuda.add(bean);
				for(Vivienda vivienda:listaViviendas)
					{
					if(vivienda.getIdVivienda().equals(bean.getVivienda().getIdVivienda()))
						{
						viviendaCodigo =  bean.getVivienda().getIdVivienda() ;
						viviendaUbicacion =  vivienda.getUbicacion();						
						
						for(Residente residente:listaResidentes)
							{						
							if(vivienda.getIdResidente().equals(residente.getDni()))
								{
									residenteDni = residente.getDni() + "";
									residenteNombre  = residente.nombres;										
								}
							}
							
						}
					}
				vencimientoFecha = format.format(fechaPagar) + "";
				vencimientoDias  = ((fecha.getTime()-fechaPagar.getTime())/(3600*24*1000)) + "";
				importe =  bean.getImporte() + "";
			}
				
			else
			{
				
				lstDeuda.add(bean);
				for(Vivienda vivienda:listaViviendas)
					{
					if(vivienda.getIdVivienda().equals(bean.getVivienda().getIdVivienda()))
						{
						viviendaCodigo =  bean.getVivienda().getIdVivienda();
						viviendaUbicacion =  vivienda.getUbicacion();						
						
						for(Residente residente:listaResidentes)
							{						
							if(vivienda.getIdResidente().equals(residente.getDni()))
								{
									residenteDni = residente.getDni() + "";
									residenteNombre  = residente.nombres;										
								}
							}
							
						}
					}
				vencimientoFecha = format.format(fechaPagar) + "";
				vencimientoDias  = "NO PAGADOS";
				importe =  bean.getImporte() + "";
				
				
			}
			
			
			System.out.println(residenteDni + ": " + residenteNombre +  "\t\t" + 
							   viviendaCodigo + ": " + viviendaUbicacion + "\t\t\t" +
							   vencimientoFecha + ": " + vencimientoDias  + "  \t" +
							   importe + "");
			
		}
		
		return lstDeuda;
		
	}
	*/
    
	
	
}
