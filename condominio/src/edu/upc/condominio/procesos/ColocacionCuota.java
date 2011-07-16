package edu.upc.condominio.procesos;

import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;

public class ColocacionCuota {

	
	private ArrayList<Cuota> cuotas;
	
	public ColocacionCuota(){
		cuotas = new ArrayList<Cuota>();
	}
	
	private int periodo;
	double importe;
	Date fechaVencimiento;
	private String codigoVivienda;
	
	public void registrarCuotas(String codigoVivienda, int periodo, 
								double importe, Date fechaVencimiento){
		Cuota cuota = new Cuota();
		cuota.setCodigoVivienda(codigoVivienda);
		cuota.setPeriodo(periodo);
		cuota.setImporte(importe);
		cuota.setFechaVencimiento(fechaVencimiento);
		cuotas.add(cuota);
	}
	
	public ArrayList<Cuota>  getCuotas(){
		return cuotas;
	}
	
	
	public ArrayList<Cuota> buscaCuotaVivienda(String codigoVivienda){
		ArrayList<Cuota> resultado = new ArrayList<Cuota>();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getCodigoVivienda().equals(codigoVivienda)){
				resultado.add(cuota);
			}
			
		}
		return resultado;
	}
	
	public ArrayList<Cuota>  buscaCuotaViviendaPeriodo(String codigoVivienda, int periodo){
		ArrayList<Cuota> resultado = new ArrayList<Cuota>();
		for(Cuota cuota: cuotas)
		{
			if (cuota.getCodigoVivienda().equals(codigoVivienda) && 
				cuota.getPeriodo() == periodo)	
			{
				resultado.add(cuota);
			}
			
		}
		return resultado;
	}

	public void eliminaCuota(String codigoVivienda, int periodo){
		
		
	}
	public void actualizarCuotas(){
		
		
	}
	
	
}
