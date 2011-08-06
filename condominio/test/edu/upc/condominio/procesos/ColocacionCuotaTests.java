package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Cuota;


public class ColocacionCuotaTests {

	ColocacionCuota cuota;
	RegistroVivienda regVivienda;
	

			
	/*		@Before
	public void Inicio(){
		cuota = new ColocacionCuota();
	}
	*/	
	
	@Test
	public void registrarVariasCuotas() throws ParseException{
		//Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,"casa", "res0001");
		regVivienda.registrarVivienda("viv0002", "panamerica", 2145,100.5, "edificio", "res0001");
		regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,"casa", "res0002");
		regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,"Edificio", "res0003");

		cuota = new ColocacionCuota();
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201101, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011"), "", null);
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201102, 180.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"), "", null);
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201103, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2011"), "", null);
		

		//assertEquals(3, cuota.getCuotas().size());
		
	}
	
	
/*	@Test
	public void registrarCuotas() throws ParseException{
		
		assertEquals(0, cuota.getCuotas().size());
		
		cuota.registrarCuotas("V0001", 201101, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011"));
		assertEquals(1, cuota.getCuotas().size());
		
		cuota.registrarCuotas("V0001", 201102, 180.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"));
		cuota.registrarCuotas("V0001", 201103, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2011"));
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
*/
	
}