package edu.upc.condominio.procesos;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.procesos.RegistroVivienda;
import static org.junit.Assert.*;

public class RegistroViviendaTest {
	RegistroVivienda registroVivienda;
	RegistroResidente regResidente;

	@Before
	public void Inicio() {
		// Registrando Residentes
		regResidente = new RegistroResidente();

		regResidente.registrarResidente("12345678", "Eva María",
				"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");

		regResidente.registrarResidente("12345679", "José Antonio",
				"Lopez Roque", 41, "joseantonio@hotmail.com", "12367");

		regResidente.registrarResidente("12345677", "Cesar Gustavo",
				"Aguilar Cardenas", 32, "cesargustavo@hotmail.com", "12389");

		registroVivienda = new RegistroVivienda();
	}

	@Test
	public void registrarUnavivienda() {
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		assertEquals(1, registroVivienda.getVivienda().size());
	}

	@Test
	public void registroVariasVivienda() {
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		registroVivienda.registrarVivienda("viv0002", "panamerica", 2145,
				100.5, "edificio", regResidente.getResidente("12345679"));
		registroVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", regResidente.getResidente("12345679"));
		registroVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
				"Edificio", regResidente.getResidente("12345677"));
		assertEquals(4, registroVivienda.getVivienda().size());
	}

	@Test
	public void registrarViviendas() {

		RegistroVivienda registroVivienda = new RegistroVivienda();
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		registroVivienda.registrarVivienda("viv0002", "panamerica", 2145,
				100.5, "edificio", regResidente.getResidente("12345678"));
		registroVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", regResidente.getResidente("12345678"));
		assertEquals(3, registroVivienda.getVivienda().size());
		try {
			registroVivienda.registrarVivienda("viv0003", "lurigancho", 782,
					120.5, "Edificio", regResidente.getResidente("12345678"));
			fail();
		} catch (Exception ex) {
			assertEquals("ya se encuentra registrada la vivienda",
					ex.getMessage());
		}
		assertEquals(3, registroVivienda.getVivienda().size());
	}

}
