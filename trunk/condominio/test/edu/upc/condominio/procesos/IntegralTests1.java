package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Vivienda;

public class IntegralTests1 {

	// caso 1. Residente con 3 cuotas vencidas de pago y va pagar 2 cuotas,

	ColocacionCuota cuota;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;

	@Before
	public void Inicio() throws ParseException {
		// Creando Residente
		regResidente = new RegistroResidente();
		regResidente.registrarResidente("12345678", "Eva María",
				"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");
		regResidente.registrarResidente("12345679", "Eva María",
				"Terrazas Garcia", 25, "evamari2@hotmail.com", "12345");
		
		// Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		regVivienda.registrarVivienda("viv0002", "los alamos", 1799, 25.5,
				"casa", regResidente.getResidente("12345679"));
		
		// creando cuotas
		cuota = new ColocacionCuota();
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201105, 2000,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201106, 1500,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201107, 800,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201108, 1200,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2011"));
		
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"), 201105, 2000,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/05/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"), 201106, 1500,
				new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
	}

	@Test
	public void PagandoCuotasVencidas() throws ParseException {

		PagodeCuotas pagoCuota = new PagodeCuotas(cuota.getCuotas());
		//Obtiene vivienda a pagar cuotas
		Vivienda vivienda = regVivienda.getVivienda("viv0001");
		
		Date fechaActual = new SimpleDateFormat("dd/MM/yyyy")
				.parse("10/08/2011");
		//verifica si tiene cuotas pendientes de pago x vivienda
		assertEquals(4, cuota.buscaCuotasPendientesPorVivienda(vivienda).size());
	
		
		ConsultaDeMorosos consultaMoroso = new ConsultaDeMorosos(
				cuota.getCuotas());

		
		assertEquals(3, consultaMoroso.listaCuotasMorosos(fechaActual,vivienda ).size());
		
		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201105),
				"C", fechaActual);


		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201106),
				"C", fechaActual);

		

		assertEquals(1, consultaMoroso.listaCuotasMorosos(fechaActual,vivienda ).size());

		//verifica si tiene cuotas pendientes de pago x vivienda
		assertEquals(2, cuota.buscaCuotasPendientesPorVivienda(vivienda).size());
	
		
	}

}
