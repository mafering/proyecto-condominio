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
	

	public ArrayList<Cuota> listaCuotasMorosos(Date fecha){
		
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("LISTA DE MOROSOS AL : "+format.format(fecha));
		ArrayList<Cuota> lstDeuda=new ArrayList<Cuota>();
		for(Cuota bean:listaCuotas){	
			Date fechaPagar=bean.getFechaVencimiento();			
			if(fechaPagar.compareTo(fecha)<0 && bean.getTipoPago()==null){				
				lstDeuda.add(bean);
				System.out.println("-------------------------\n");
				for(Vivienda vivienda:listaViviendas){
					if(vivienda.getIdVivienda().equals(bean.getCodigoVivienda())){					
						System.out.println("CODIGO DE VIVIENDA :"+ bean.getCodigoVivienda()+" UBICACION :"+vivienda.getUbicacion()+"\n");								
						for(Residente residente:listaResidentes){						
							if(vivienda.getIdResidente().equals(residente.getDni())){								
								System.out.println("RESIDENTE DNI :"+ residente.getDni()+" NOMBRE : "+residente.nombres+"\n");												
							}
						}
						
					}

				}

				System.out.println("FECHA VENCIMIENTo :"+ format.format(fechaPagar)+" DIAS RETRASO : "+((fecha.getTime()-fechaPagar.getTime())/(3600*24*1000))+"\n");
				System.out.println("VALOR PAGO : "+bean.getImporte()+"\n");
				System.out.println("-------------------------\n");
			}
			
		}
		
		return lstDeuda;
		
	}
	
    
	
	
}
