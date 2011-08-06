package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Visitante;

public class ConsultaVisitanteTests {

	ConsultaVisitante objConsulta;
	
	RegistroVisita regVisita;
	RegistroVisitante regVisitante;
	
	ArrayList<Visita> visitas;
	
	Visitante visitante;
	Visita visita;
	@Before
	public void Inicio() throws Exception {
		regVisita = new RegistroVisita();
		regVisitante = new RegistroVisitante();
		// *registrando visitante
		String dni = "41401524";
		regVisitante.registrarVisitante(dni, "Jenny", "Arteaga");
		// obtiene el objeto visitante para el registro de visita
		visitante = regVisitante.getVisitante(dni);
		// *registrando fecha de visita
		visita = regVisita.registrarVisita(visitante, "viv001",
				new SimpleDateFormat("dd/MM/yyyy hh:mm")
						.parse("10/07/2011 10:00"));
		// registrando el ingreso y salida de la visita
		regVisita.registrarIngresoSalidaVisita(visita, new SimpleDateFormat(
				"dd/MM/yyyy hh:mm").parse("10/07/2011 10:20"),
				new SimpleDateFormat("dd/MM/yyyy hh:mm")
						.parse("10/07/2011 18:30"));

		// *registrando visitante
		dni = "41404713";
		regVisitante.registrarVisitante(dni, "Carla", "Angulo");
		// obtiene el objeto visitante para el registro de visita
		visitante = regVisitante.getVisitante(dni);
		// *registrando fecha de visita
		visita = regVisita.registrarVisita(visitante, "viv002",
				new SimpleDateFormat("dd/MM/yyyy hh:mm")
						.parse("15/07/2011 15:00"));
		// registrando el ingreso y salida de la visita
		regVisita.registrarIngresoSalidaVisita(visita, new SimpleDateFormat(
				"dd/MM/yyyy hh:mm").parse("15/07/2011 15:20"),
				new SimpleDateFormat("dd/MM/yyyy hh:mm")
						.parse("15/07/2011 19:30"));

		// *registrando visitante
		dni = "07080770";
		regVisitante.registrarVisitante(dni, "Yessica", "Perez");
		// obtiene el objeto visitante para el registro de visita
		visitante = regVisitante.getVisitante(dni);
		// *registrando fecha de visita
		visita = regVisita.registrarVisita(visitante, "viv003",
				new SimpleDateFormat("dd/MM/yyyy hh:mm")
						.parse("20/07/2011 16:00"));				
		
		objConsulta = new ConsultaVisitante(regVisita.getVisitas());
	}
	
	@Test
	public void consultarVisitantes() {
		assertEquals(2, objConsulta.getListado(2011, 07).size());
	}
	
	
}
