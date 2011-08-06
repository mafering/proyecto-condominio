package edu.upc.condominio.procesos;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.procesos.RegistroVisitante;
import static org.junit.Assert.*;
public class RegistroVisitanteTest {
	RegistroVisitante registroVisitante;
	@Before
	public void Inicio() {
		registroVisitante = new RegistroVisitante();
	}

	@Test
	public void registrarUnVisitante() {
		registroVisitante.registrarVisitante("vis0001", "jaime", "ruiz");
		assertEquals(1, registroVisitante.getVisitante().size());
	}

	@Test
	public void registrarVariosVisitantes() {
		registroVisitante.registrarVisitante("vis0001", "mirtha", "jimenez");
		registroVisitante.registrarVisitante("vis0002", "elizabeth", "rojas");
		registroVisitante.registrarVisitante("vis0003", "carlos", "Luna");
		registroVisitante.registrarVisitante("vis0004", "freddy", "ortiz");
		assertEquals(4, registroVisitante.getVisitante().size());
	}

}
