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
		registroVisitante.registrarVisitante("90488299", "jaime", "ruiz");
		assertEquals(1, registroVisitante.getVisitante().size());
	}

	@Test
	public void registrarVariosVisitantes() {
		registroVisitante.registrarVisitante("78686787", "mirtha", "jimenez");
		registroVisitante.registrarVisitante("43409423", "elizabeth", "rojas");
		registroVisitante.registrarVisitante("98708656", "carlos", "Luna");
		registroVisitante.registrarVisitante("45454677", "freddy", "ortiz");
		assertEquals(4, registroVisitante.getVisitante().size());
	}

}
