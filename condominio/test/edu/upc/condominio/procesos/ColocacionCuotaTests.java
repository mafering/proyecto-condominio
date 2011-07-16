package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class ColocacionCuotaTests {

	
	@Before
	public void Inicio(){
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void registrarUnaCuota() throws ParseException {
		String codigoVivienda = "V0001";
		int periodo = 201101;
		double importe = 150.00;
		Date fechaVencimiento = new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011");
		ColocacionCuota cuota = new ColocacionCuota();
		cuota.registrarCuotas(codigoVivienda, periodo, importe, fechaVencimiento); 
		
		assertEquals(1, cuota.getCuotas().size());
	}
}
