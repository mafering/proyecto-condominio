package edu.upc.condominio.procesos;

import java.util.ArrayList;
import edu.upc.condominio.entidades.Visitante;
public class RegistroVisitante {

	private ArrayList<Visitante> visitantes;

	public RegistroVisitante() {

		visitantes = new ArrayList<Visitante>();
	}

	public ArrayList<Visitante> getVisitante() {
		return visitantes;
	}

	void registrarVisitante(String dni, String nombres, String apellidos) {
		Visitante visitante = new Visitante(dni, nombres, apellidos);
		 visitantes.add(visitante);
	}
	
}
