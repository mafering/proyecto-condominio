package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Vivienda;

public class IntegralTests2 {

	// caso 2. Residente sin cuotas vencidas, 
	//realiza pago de cuota pendiente y administrador 
	//verifica si vivienda tiene morosidad 

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
				"Terrazas Garcia", 25, "evamaria3@hotmail.com", "12345");
		
		// Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		regVivienda.registrarVivienda("viv0002", "los alamos", 1760, 25.5,
				"casa", regResidente.getResidente("12345678"));
		
		// creando 1 cuota  a pagar en agosto 2011
		cuota = new ColocacionCuota();
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201108, 1200,
				new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201109, 1200,
				new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2011"));
	}

	@Test
	public void PagandoCuotasVencidas() throws ParseException {

		PagodeCuotas pagoCuota = new PagodeCuotas(cuota.getCuotas());
		
		Date fechaActual = new SimpleDateFormat("dd/MM/yyyy")
				.parse("10/08/2011");
		//Vivienda a Realizar Pago de Cuotas
		Vivienda vivienda = regVivienda.getVivienda("viv0001");
		//Cuotas Pendientes a Pagar
		assertEquals(2, cuota.buscaCuotasPendientesPorVivienda(vivienda).size());
	
		//Sin Cuotas Vencidas
		ConsultaDeMorosos consultaMoroso = new ConsultaDeMorosos(
				cuota.getCuotas());
		assertEquals(0, consultaMoroso.listaCuotasMorosos(fechaActual).size());

		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201108),
				"C", fechaActual);

		//Cuotas Pendientes a Pagar
		assertEquals(1, cuota.buscaCuotasPendientesPorVivienda(vivienda).size());
	
		//Administrador Verifica Morosidad de Vivienda
		assertEquals(0, consultaMoroso.listaCuotasMorosos(fechaActual, vivienda).size());

		

	}

}

