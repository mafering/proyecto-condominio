package edu.upc.condominio.procesos;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Visita;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegistroVisitaTest {
	
	RegistroVisitante registroVisitante;
	RegistroVisita registrovisita;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;
	
	@Before
	public void Inicio() {
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

		registroVisitante = new RegistroVisitante();
		registroVisitante.registrarVisitante("vis0001", "mirtha", "jimenez");
		registroVisitante.registrarVisitante("vis0002", "elizabeth", "rojas");
		registroVisitante.registrarVisitante("vis0003", "carlos", "Luna");
		registroVisitante.registrarVisitante("vis0004", "freddy", "ortiz");
		
		registrovisita = new RegistroVisita();
		
	}
	
	@Test
	public void registrovisita() throws ParseException{
		//registra visitas
		Visita objVisita1 = registrovisita.registrarVisita(registroVisitante.getVisitante("vis0001"),regVivienda.getVivienda("viv0001"),new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"));
		Visita objVisita2 = registrovisita.registrarVisita(registroVisitante.getVisitante("vis0002"),regVivienda.getVivienda("viv0002"),new SimpleDateFormat("dd/MM/yyyy").parse("11/08/2011"));
		Visita objVisita3 = registrovisita.registrarVisita(registroVisitante.getVisitante("vis0003"),regVivienda.getVivienda("viv0003"),new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2011"));
		assertEquals(3, registrovisita.getVisitas().size());
		//registra asistencia
		assertEquals(3,registrovisita.getVisitas().size());
		
		registrovisita.registrarIngresoSalidaVisita(objVisita1,
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("10/08/2011 10:30"),
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("10/08/2011 15:30")); 
				
		registrovisita.registrarIngresoSalidaVisita(objVisita2,
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("11/08/2011 10:30"),
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("11/08/2011 15:30")); 
				
		registrovisita.registrarIngresoSalidaVisita(objVisita3,
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("12/08/2011 10:30"),
				new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("12/08/2011 15:30")); 
				
		
	}
		
}
