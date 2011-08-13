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
/**
 *
 * @author Administrador
 */

public class PagodeCuotaTest {

	ColocacionCuota cuota;
	RegistroVivienda regVivienda;
	RegistroResidente regResidente;

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
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"),201101,2000, new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
		cuota.registrarCuotas(regVivienda.getVivienda("viv0002"),201101,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"));
	}

	
	@Test
	public void PagodeCuotas() throws ParseException //throws ParseException {
	{
		
		PagodeCuotas neg=new PagodeCuotas(cuota.getCuotas());
		assertEquals(2,neg.getCuotas().size());
		neg.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0001"), 201101)
				, "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		System.out.println("cantidad de registros  " + neg.getCuotas().size());
		assertEquals(1,neg.listardeudas().size());
		System.out.println("cantidad de registros con deuda " + neg.listardeudas().size());
		neg.pagarCuota(
				cuota.getCuota(regVivienda.getVivienda("viv0002"), 201101)
				, "C", new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011") );
		assertEquals(0,neg.listardeudas().size());
		System.out.println("cantidad de registros con deuda " + neg.listardeudas().size());


	}

}
