package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class IntegralTests1 {

	// caso 1. Residente con 3 cuotas pendientes de pago y va pagar 2 cuotas,
	// desea separar area para evento y no puede por deber 1 cuota.

	ColocacionCuota cuota;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;

	@Before
	public void Inicio() throws ParseException {
		// Creando Residente
		regResidente = new RegistroResidente();
		regResidente.registrarResidente("12345678", "Eva María",
				"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");

		// Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));

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
	}

	@Test
	public void PagandoCuotasVencidas() throws ParseException // throws
																// ParseException
																// {
	{

		PagodeCuotas pagoCuota = new PagodeCuotas(cuota.getCuotas());
		ConsultaDeMorosos consultaMoroso = new ConsultaDeMorosos(
				cuota.getCuotas());

		Date fechaActual = new SimpleDateFormat("dd/MM/yyyy")
				.parse("10/08/2011");

		assertEquals(4, cuota.getCuotas().size());

		assertEquals(3, consultaMoroso.listaCuotasMorosos(fechaActual).size());

		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201105),
				"C", fechaActual);

		assertEquals(2, consultaMoroso.listaCuotasMorosos(fechaActual).size());

		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201106),
				"C", fechaActual);

		assertEquals(1, consultaMoroso.listaCuotasMorosos(fechaActual).size());

		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201107),
				"C", fechaActual);

		assertEquals(0, consultaMoroso.listaCuotasMorosos(fechaActual).size());

	}

}
