package edu.upc.condominio.procesos;

import java.util.ArrayList;
import edu.upc.condominio.entidades.Residente; 
import edu.upc.condominio.entidades.Visitante;
public class RegistroResidente {

	private ArrayList<Residente> residentes;
	
	public RegistroResidente () {
		
		residentes=new ArrayList<Residente>();
	}
	
	public ArrayList<Residente> getResidentes(){
		return residentes;
	}
	
	public void registrarResidente(String dni, String nombres, String apellidos,int edad, 
    String correo,String clave){
		
		buscarDni(dni);
		buscarCorreo(correo);
		Residente residente=new Residente(dni, nombres, apellidos,edad, correo,clave);
		residentes.add(residente);
	}
	
	private void buscarDni(String dni){
		for (Residente residente:residentes){
			if (residente.getDni().equals(dni)){
				
				throw new RuntimeException("DNI YA REGISTRADO");
			}
		}
	}
	private void buscarCorreo(String correo) throws RuntimeException {
		for (Residente residente:residentes){
			if (residente.getCorreo().equals(correo)){
				throw new RuntimeException("CORREO YA REGISTRADO");
			}
		}
	}
	public Residente getResidente(String dni) {
		Residente resultado = new Residente();
		for(Residente residente: residentes){
			if(residente.getDni().equals(dni)){
				resultado = residente;
			}
		}
		return resultado;
	}
	

}
