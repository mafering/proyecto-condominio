package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Residente;
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
			int numero, double metraje, String tipo, Residente residente) {

		consultaVivienda(idVivienda);
		Vivienda vivienda = new Vivienda(idVivienda, ubicacion, numero,
				metraje, tipo, residente);
		viviendas.add(vivienda);
	}

	public void consultaVivienda(String idVivienda) {
		for (Vivienda vivienda : viviendas) {
			if (vivienda.getIdVivienda().equals(idVivienda)) {
				throw new RuntimeException(
						"ya se encuentra registrada la vivienda");
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
