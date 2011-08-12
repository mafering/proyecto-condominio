package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.Cuota;
import edu.upc.condominio.entidades.Residente;
import edu.upc.condominio.entidades.Vivienda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;



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
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"),201106,2000, new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"),201106,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0003"),201106,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0003"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0004"),201107,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0004"),201108,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2011"));
		
		PagodeCuotas pagoCuota=new PagodeCuotas(cuota.getCuotas());

		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201106)
				, "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		pagoCuota.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0002"), 201107)
				, "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		
		
		consultaMoroso = new ConsultaDeMorosos(cuota.getCuotas());

	}

	@Test
	public void consultadeMorosos() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = format.parse("2011/07/30");
		assertEquals(4, consultaMoroso.listaCuotasMorosos(fecha).size());
	}
	
/*

	@Test
	public void consultadeMorosos() throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date fecha = format.parse("2011/07/21");
		
		RegistroResidente registroresidente=new RegistroResidente();
		
		registroresidente.registrarResidente("10401030", "Eva María", "Terrazas Garcia",25, "evamaria@hotmail.com", "clave1");
		registroresidente.registrarResidente("40826005", "Atilio", "Tapia", 31, "atilio.tapia@hotmail.com", "1cla");
		registroresidente.registrarResidente("45012212", "Cesar Gustavo", "Aguilar Cardenas",32, "cesargustavo@hotmail.com", "1cla2ve");
		
		ArrayList<Residente> lstResidente=registroresidente.getResidentes();
		
		RegistroVivienda registroVivienda=new RegistroVivienda();
		registroVivienda.registrarVivienda("V0102", "B A", 102, 400,"CASA", "10401030");
		registroVivienda.registrarVivienda("D1201", "D1 S", 122,90, "DPTO.", "40826005");
		registroVivienda.registrarVivienda("D2012", "D2 A", 123, 90,"DPTO.", "45012212");
		ArrayList<Vivienda> lstVivienda=registroVivienda.getVivienda();
		
		
		
		ColocacionCuota obj=new ColocacionCuota();
		obj.registrarCuotas(registroVivienda.getVivienda("V0102"),2011,110.4, format.parse("2011/07/30"),"", null);
		obj.registrarCuotas(registroVivienda.getVivienda("D1201"),2011, 250.8,format.parse("2011/07/28"),"", null);
		obj.registrarCuotas(registroVivienda.getVivienda("D2012"),2011,330.20, format.parse("2011/10/28"),"", null);
		
		ArrayList<Cuota> lstCuotas=obj.getCuotas();
		
		ConsultaDeMorosos obj_morosos= new ConsultaDeMorosos(lstCuotas,lstVivienda,lstResidente);
		// FECHA DEBE SER MAYOR A LA FECHA DE VENCIMIENTO
		obj_morosos.listaCuotasMorosos(format.parse("2011/08/10"));
		
		
	}
	*/
	
	
}
