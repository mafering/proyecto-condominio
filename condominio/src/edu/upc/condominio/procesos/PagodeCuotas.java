package edu.upc.condominio.procesos;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Vivienda;

public class PagodeCuotas {

	
	ArrayList<Cuota> lista;
	ArrayList<Cuota> listadeuda = new ArrayList<Cuota>();

	public PagodeCuotas(ArrayList<Cuota> lista) {
		this.lista = lista;
	}

	

	public void agregar(Cuota ent) {
		lista.add(ent);
	}

	public void pagarCuota(Cuota cuota, String tipoPago, Date fechaPago) {
		int posicion = lista.indexOf(cuota);
		Cuota pagoCuota = lista.get(posicion);
		pagoCuota.setTipoPago(tipoPago);
		pagoCuota.setFechaPago(fechaPago);
		lista.set(posicion, pagoCuota);

	}

	public ArrayList<Cuota> listardeudas() {
		ArrayList<Cuota> listadeuda = new ArrayList<Cuota>();
		for (Cuota ent1 : lista) {
			if (ent1.getTipoPago().equals("")) {
				listadeuda.add(ent1);
			}
		}
		return listadeuda;
	}

	public ArrayList<Cuota> getCuotas() {
		
		return lista;
	}

	public void acualizar(Cuota ent) {

		int c = 0;
		for (Cuota ent1 : lista) {
			if (ent1.getVivienda().equals(ent.getVivienda())) {
				lista.set(c, ent);
				return;
			}
			c++;

		}

	}

}
