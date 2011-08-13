package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class ConsultaDeMorososTests {
	
	ColocacionCuota cuota;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;
	ConsultaDeMorosos consultaMoroso;
	
	@Before
	public void Inicio() throws ParseException {
		// Creando Residente
		regResidente = new RegistroResidente();
		regResidente.registrarResidente("12345678", "Eva María",
				"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");

		regResidente.registrarResidente("12345679", "José Antonio",
				"Lopez Roque", 41, "joseantonio@hotmail.com", "12367");

		regResidente.registrarResidente("12345677", "Cesar Gustavo",
				"Aguilar Cardenas", 32, "cesargustavo@hotmail.com", "12389");

		// Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", regResidente.getResidente("12345678"));
		regVivienda.registrarVivienda("viv0002", "panamerica", 2145, 100.5,
				"edificio", regResidente.getResidente("12345679"));
		regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", regResidente.getResidente("12345679"));
		regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
				"Edificio", regResidente.getResidente("12345677"));

		cuota = new ColocacionCuota();
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"),201106,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"),201106,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0003"),201106,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0003"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0004"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0004"),201108,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2011"));
		
		PagodeCuotas pagoCuota=new PagodeCuotas(cuota.getCuotas());

		pagoCuota.pagarCuota(cuota.getCuota(regVivienda.getVivienda("viv0001"), 201106)	, "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		pagoCuota.pagarCuota(cuota.getCuota(regVivienda.getVivienda("viv0002"), 201107), "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		
		consultaMoroso = new ConsultaDeMorosos(cuota.getCuotas());

	}

	@Test
	public void consultadeMorosos() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = format.parse("2011/07/31");
		assertEquals(5, consultaMoroso.listaCuotasMorosos(fecha).size());
	}
	
	
	
}
