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

	public void eliminarCuota(String codigoVivienda, int periodo){
		
	}
	
	public void actualizarCuotas(){
		
		
	}
	
	
}
