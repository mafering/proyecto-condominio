package edu.upc.condominio.procesos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Residente;
import edu.upc.condominio.entidades.Visitante;
import edu.upc.condominio.entidades.Vivienda;

public class ConsultaDeMorosos {

	public ArrayList<Cuota> listaCuotas;
	public ArrayList<Vivienda> listaViviendas;
	public ArrayList<Residente> listaResidentes;

	public ConsultaDeMorosos(ArrayList<Cuota> listaCuotas,
			ArrayList<Vivienda> listaViviendas,
			ArrayList<Residente> listaResidentes) {
		this.listaCuotas = listaCuotas;
		this.listaViviendas = listaViviendas;
		this.listaResidentes = listaResidentes;
	}

	public ConsultaDeMorosos(ArrayList<Cuota> listaCuotas) {
		this.listaCuotas = listaCuotas;
	}

	public ArrayList<Cuota> listaCuotasMorosos(Date fechaActual) {

		ArrayList<Cuota> morosos = new ArrayList<Cuota>();

		for (Cuota cuota : listaCuotas) {

			if ((cuota.getFechaVencimiento().compareTo(fechaActual) < 0)
					&& (cuota.getFechaPago() == null)) {
				morosos.add(cuota);
			}

		}
		return morosos;

	}

	public ArrayList<Cuota> listaCuotasMorosos(Date fechaActual,
			Vivienda vivienda) {

		ArrayList<Cuota> morosos = new ArrayList<Cuota>();

		for (Cuota cuota : listaCuotas) {
			if (vivienda.getIdVivienda().equals(
					cuota.getVivienda().getIdVivienda())) {
				if ((cuota.getFechaVencimiento().compareTo(fechaActual) < 0)
						&& (cuota.getFechaPago() == null)) {
					morosos.add(cuota);
				}
			}
		}
		return morosos;

	}

}
