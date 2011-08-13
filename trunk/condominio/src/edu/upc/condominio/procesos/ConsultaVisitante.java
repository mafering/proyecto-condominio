package edu.upc.condominio.procesos;

import java.util.ArrayList;
import java.util.Calendar;

import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Visitante;

public class ConsultaVisitante {

	private ArrayList<Visita> visitas;

	public ConsultaVisitante(ArrayList<Visita> visitas) {
		this.visitas = visitas;
	}

	public ArrayList<Visita> getListado(int anio, int mes) {

		ArrayList<Visita> resultado = new ArrayList<Visita>();

		for (Visita visita : visitas) {
			Calendar fecha = null;
			try {
				fecha = Calendar.getInstance();
				if (visita.getFechaHoraIngreso() != null) {
					fecha.setTime(visita.getFechaHoraIngreso());
				} else {
					fecha = null;
				}

			} catch (Exception ex) {
			}

			if (fecha != null) {
				int anioVisita = fecha.get(Calendar.YEAR);
				int mesVisita = fecha.get(Calendar.MONTH) + 1;
				if ((anioVisita == anio) && (mesVisita == mes)) {
					resultado.add(visita);
				}

			}
		}
		return resultado;
	}

}
