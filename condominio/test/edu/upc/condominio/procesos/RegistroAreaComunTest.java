package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RegistroAreaComunTest {
	
	@Test
	public void registroAreasComun(){
		
		RegistroAreaComun registroareacomun= new RegistroAreaComun();
		
		registroareacomun.registrarAreaComun("A01", "Piscina", "Bloque01", 100, "Disponible");
		registroareacomun.registrarAreaComun("A02", "Gimnasio", "Bloque02", 100, "Disponible");
		registroareacomun.registrarAreaComun("A03", "Sauna", "Bloque03", 100, "Disponible");

	
		assertEquals(3,registroareacomun.getareas().size());
		System.out.println("cantidad de registros  " + registroareacomun.getareas().size());
		
		try{
			registroareacomun.registrarAreaComun("A01", "Piscina", "Bloque01", 100, "Disponible");
			fail();
		}catch(Exception ex){
			assertEquals("AREA YA REGISTRADO",ex.getMessage());
			System.out.println(ex.getMessage());
			
		}
		
	
		}

}
