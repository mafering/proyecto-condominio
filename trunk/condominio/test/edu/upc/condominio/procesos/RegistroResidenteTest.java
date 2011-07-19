package edu.upc.condominio.procesos;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegistroResidenteTest {

	@Test
	public void registroresidentes(){
		
		RegistroResidente registroresidente= new RegistroResidente();
		
		registroresidente.registrarResidente("12345678", "Eva Mar�a", "Terrazas Garcia", 
											 25, "evamaria@hotmail.com", "12345");
	 
		registroresidente.registrarResidente("12345679", "Jos� Antonio", "Lopez Roque", 
				 							 41, "joseantonio@hotmail.com", "12367");
	
		registroresidente.registrarResidente("12345677", "Cesar Gustavo", "Aguilar Cardenas",
											 32, "cesargustavo@hotmail.com", "12389");
	
		assertEquals(3,registroresidente.getResidentes().size());
		
		try{
			registroresidente.registrarResidente("12345678", "Maria Judith", "Vergara Poma", 
												 28, "mariajudith@hotmail.com", "45276");
			fail();
		}catch(Exception ex){
			assertEquals("DNI YA REGISTRADO",ex.getMessage());
			
		}
		
		try{
			registroresidente.registrarResidente("12345672", "Maria Judith", "Vergara Poma", 
												 28, "evamaria@hotmail.com", "45276");
			fail();
		}catch(Exception ex){
			assertEquals("CORREO YA REGISTRADO",ex.getMessage());
		
		}
	
		}
}