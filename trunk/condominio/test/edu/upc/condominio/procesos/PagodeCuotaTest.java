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
	
	 PagodeCuotas pago; 
	
	
	@Test
	public void PagodeCuotas() throws ParseException {

		
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
				
				
		pago = new PagodeCuotas(cuota.getCuotas());
		pago.PagarPeriodoCuota("viv0001", 201101, "contado");
		


	}

}
