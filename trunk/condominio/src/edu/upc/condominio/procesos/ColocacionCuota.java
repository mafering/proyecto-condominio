package edu.upc.condominio.procesos;

import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;

public class ColocacionCuota {

	
	private ArrayList<Cuota> cuotas;
	
	public ColocacionCuota(){
		cuotas = new ArrayList<Cuota>();
	}
	
	public void registrarCuotas(String codigoVivienda, int periodo, 
								double importe, Date fechaVencimiento){
		
		for(Cuota cuota: cuotas){
			if (cuota.getCodigoVivienda().equals(codigoVivienda) && 
					cuota.getPeriodo() == periodo)	
				{
					throw new RuntimeException("Cuota ya ha sido Registrada para la vivienda y Periodo");
				}
		}
		Cuota cuota = new Cuota(codigoVivienda, 
				periodo, importe, fechaVencimiento);
		cuotas.add(cuota);
	}
	
	public ArrayList<Cuota>  getCuotas(){
		return cuotas;
	}
	
	
	public ArrayList<Cuota> buscaCuotasPorVivienda(String codigoVivienda){
		ArrayList<Cuota> resultado = new ArrayList<Cuota>();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getCodigoVivienda().equals(codigoVivienda)){
				resultado.add(cuota);
			}
			
		}
		return resultado;
	}
	
	public Cuota  buscaCuotaPorViviendaYPeriodo(String codigoVivienda, int periodo){
		Cuota cuotaResultado= new Cuota();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getCodigoVivienda().equals(codigoVivienda) && 
				cuota.getPeriodo() == periodo)	
			{
				cuotaResultado = cuota;
			}
			
		}
		return cuotaResultado;
	}

}

