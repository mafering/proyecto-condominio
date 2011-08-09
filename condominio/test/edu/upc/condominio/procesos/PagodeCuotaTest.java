package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
	
	// PagodeCuotas pago; 
	
	
	@Test
	public void PagodeCuotas() throws ParseException //throws ParseException {

		
		//Creando Vivienda
   

/*
		cuota = new ColocacionCuota();
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201101, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011"), "", null);
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201102, 180.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2011"), "", null);
		cuota.registrarCuotas(regVivienda.getVivienda("viv0001"), 201103, 150.00, new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2011"), "", null);
				
				
		pago = new PagodeCuotas(cuota.getCuotas());
		pago.PagarPeriodoCuota("viv0001", 201101, "contado");*/
	
	
	{
		
	    regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,"casa", "res0001");
		regVivienda.registrarVivienda("viv0002", "panamerica", 2145,100.5, "edificio", "res0001");
		regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,"casa", "res0002");
		regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,"Edificio", "res0003");
	
		//Cuota ent=null;
		PagodeCuotas neg=new PagodeCuotas();
		neg.agregar(new Cuota(regVivienda.getVivienda("viv0001"),201101,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"), "",new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011")));
		neg.agregar(new Cuota(regVivienda.getVivienda("viv0002"),201101,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"), "C",new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011")));
		assertEquals(2,neg.getCuotas().size());
		System.out.println("cantidad de registros  " + neg.getCuotas().size());
		assertEquals(1,neg.listardeudas().size());
		System.out.println("cantidad de registros con deuda " + neg.listardeudas().size());
		neg.acualizar(new Cuota(regVivienda.getVivienda("viv0001"),201101,2000,new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2011"), "C",new SimpleDateFormat("dd/MM/yyyy").parse("10/07/2011")));
		assertEquals(0,neg.listardeudas().size());
		System.out.println("cantidad de registros con deuda " + neg.listardeudas().size());


	}

}
