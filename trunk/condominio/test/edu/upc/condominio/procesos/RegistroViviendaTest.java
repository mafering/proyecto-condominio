package edu.upc.condominio.procesos;

import java.text.ParseException;
import org.junit.Test;

import edu.upc.condominio.procesos.RegistroVivienda;
import static org.junit.Assert.*;

public class RegistroViviendaTest {

	@Test
	public void registrarUnavivienda() {
		RegistroVivienda registroVivienda = new RegistroVivienda();
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", "res0001");
		assertEquals(1, registroVivienda.getVivienda().size());
	}

	@Test
	public void registroVariasVivienda() {
		RegistroVivienda registroVivienda = new RegistroVivienda();
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", "res0001");
		registroVivienda.registrarVivienda("viv0002", "panamerica", 2145,
				100.5, "edificio", "res0001");
		registroVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", "res0002");
		registroVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
				"Edificio", "res0003");
		assertEquals(4, registroVivienda.getVivienda().size());
	}

	@Test
	public void registrarViviendas() throws ParseException {

		RegistroVivienda registroVivienda = new RegistroVivienda();
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", "res0001");
		registroVivienda.registrarVivienda("viv0002", "panamerica", 2145,
				100.5, "edificio", "res0001");
		registroVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", "res0002");
		registroVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
				"Edificio", "res0003");
		assertEquals(4, registroVivienda.getVivienda().size());
	}

}
