package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;


public class ColocacionCuotaTests {


	ColocacionCuota cuota;
	
	@Before
	public void Inicio(){
		cuota = new ColocacionCuota();
	}
	
	@Test
	public void registrarUnaCuota() throws ParseException {
		cuota.registrarCuotas("V0001", 201101, 150.00, 
					new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011")); 
		assertEquals(1, cuota.getCuotas().size());
	}
	
	@Test
	public void registrarVariasCuotas() throws ParseException{
		cuota.registrarCuotas("V0001", 201101, 150.00, 
					new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011"));
		cuota.registrarCuotas("V0001", 201102, 180.00, 
				new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"));
		cuota.registrarCuotas("V0001", 201103, 150.00, 
				new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2011"));
		assertEquals(3, cuota.getCuotas().size());
		
	}
	@Test
	public void registrarCuotas() throws ParseException{
		
		assertEquals(0, cuota.getCuotas().size());
		
		cuota.registrarCuotas("V0001", 201101, 150.00, 
					new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011"));
		assertEquals(1, cuota.getCuotas().size());
		
		cuota.registrarCuotas("V0001", 201102, 180.00, 
				new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"));
		cuota.registrarCuotas("V0001", 201103, 150.00, 
				new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2011"));
		assertEquals(3, cuota.getCuotas().size());
		try{
			cuota.registrarCuotas("V0001", 201103, 160.00, 
				new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2011"));
			fail();
		}catch(Exception ex){
			assertEquals("Cuota ya ha sido Registrada para la vivienda y Periodo", ex.getMessage());
		}
		assertEquals(3, cuota.getCuotas().size());
	}
}