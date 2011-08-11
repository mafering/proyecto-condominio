package edu.upc.condominio.procesos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Vivienda;

public class ColocacionCuota {

	
	private ArrayList<Cuota> cuotas;
	
	
	public ColocacionCuota(){
		cuotas = new ArrayList<Cuota>();
	}
	
	public void registrarCuotas(Vivienda vivienda, int periodo, 
								double importe, Date fechaVencimiento){
		String tipoPago = "";
		Date fechaPago = null;
		
		for(Cuota cuota: cuotas){
			if (cuota.getVivienda().getIdVivienda().equals(vivienda.getIdVivienda()) && 
					cuota.getPeriodo() == periodo)	
				{
					throw new RuntimeException("Cuota ya ha sido Registrada para la Vivienda y Periodo");
				}
		}
		
		Cuota cuota = new Cuota(vivienda, periodo, importe, fechaVencimiento, tipoPago, fechaPago);
		cuotas.add(cuota);
		
	}
	
	public ArrayList<Cuota>  getCuotas(){
		return cuotas;
	}
	
	
	public ArrayList<Cuota> buscaCuotasPorVivienda(Vivienda vivienda){
		ArrayList<Cuota> resultado = new ArrayList<Cuota>();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getVivienda().equals(vivienda)){
				resultado.add(cuota);
			}
			
		}
		return resultado;
	}
	
	public Cuota  getCuota(Vivienda vivienda, int periodo){
		Cuota cuotaResultado= new Cuota();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getVivienda().equals(vivienda) && 
				cuota.getPeriodo() == periodo)	
			{
				cuotaResultado = cuota;
			}
			
		}
		return cuotaResultado;
	}

}

