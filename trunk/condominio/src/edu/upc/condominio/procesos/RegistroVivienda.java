package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Vivienda;

public class RegistroVivienda {

	private ArrayList<Vivienda> viviendas;

	public RegistroVivienda() {

		viviendas = new ArrayList<Vivienda>();
	}

	public ArrayList<Vivienda> getVivienda() {
		return viviendas;
	}

	public void registrarVivienda(String idVivienda, String ubicacion,
			int numero, double metraje, String tipo, String idResidente) {

		consultaUbicacion(ubicacion);
		Vivienda vivienda = new Vivienda(idVivienda, ubicacion, numero,
				metraje, tipo, idResidente);
		viviendas.add(vivienda);
	}

	public void consultaUbicacion(String ubicacion) {
		for (Vivienda vivienda : viviendas) {
			if (vivienda.getUbicacion().equals(ubicacion)) {
				throw new RuntimeException(
						"ya se encuentra registrada la ubicacion");
			}

		}
	}
	
	public Vivienda getVivienda(String idVivienda) {
		Vivienda resultado = new Vivienda();
		for (Vivienda vivienda : viviendas) {
			if (vivienda.getIdVivienda().equals(idVivienda)) {
				resultado = vivienda;
			}

		}
		return resultado;
	}

}
