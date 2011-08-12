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


	RegistroVisitante regVisitante;
	RegistroVisita registrovisita;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;
	ConsultaVisitante objConsulta;
	ArrayList<Visita> visitas;
	
	Visitante visitante;
	Visita visita;
		
		@Before
		public void Inicio() throws Exception {
			// Creando Residente
			regResidente = new RegistroResidente();
			regResidente.registrarResidente("12345678", "Eva María",
					"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");

			regResidente.registrarResidente("12345679", "José Antonio",
					"Lopez Roque", 41, "joseantonio@hotmail.com", "12367");

			regResidente.registrarResidente("12345677", "Cesar Gustavo",
					"Aguilar Cardenas", 32, "cesargustavo@hotmail.com", "12389");

			// Creando Vivienda
			regVivienda = new RegistroVivienda();
			regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
					"casa", regResidente.getResidente("12345678"));
			regVivienda.registrarVivienda("viv0002", "panamerica", 2145, 100.5,
					"edificio", regResidente.getResidente("12345679"));
			regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
					"casa", regResidente.getResidente("12345679"));
			regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
					"Edificio", regResidente.getResidente("12345677"));

			regVisitante = new RegistroVisitante();
			regVisitante.registrarVisitante("vis0001", "mirtha", "jimenez");
			regVisitante.registrarVisitante("vis0002", "elizabeth", "rojas");
			regVisitante.registrarVisitante("vis0003", "carlos", "Luna");
			regVisitante.registrarVisitante("vis0004", "freddy", "ortiz");
			
			registrovisita = new RegistroVisita();
			//registra visitas
			Visita objVisita1 = registrovisita.registrarVisita(regVisitante.getVisitante("vis0001"),regVivienda.getVivienda("viv0001"),new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"));
			Visita objVisita2 = registrovisita.registrarVisita(regVisitante.getVisitante("vis0002"),regVivienda.getVivienda("viv0002"),new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2011"));
			Visita objVisita3 = registrovisita.registrarVisita(regVisitante.getVisitante("vis0003"),regVivienda.getVivienda("viv0003"),new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2011"));
			
			registrovisita.registrarIngresoSalidaVisita(objVisita1,
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("10/08/2011 10:30"),
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("10/08/2011 15:30")); 
					
			registrovisita.registrarIngresoSalidaVisita(objVisita2,
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("11/08/2011 10:30"),
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("11/08/2011 15:30")); 
					
			registrovisita.registrarIngresoSalidaVisita(objVisita3,
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("12/08/2011 10:30"),
					new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("12/08/2011 15:30")); 
			
			
		
		objConsulta = new ConsultaVisitante(registrovisita.getVisitas());
	}
	
	@Test
	public void consultarVisitantes() {
		assertEquals(3, objConsulta.getListado(2011, 8).size());
	}
	
	
}
