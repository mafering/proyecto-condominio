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

	@Test
	public void PagodeCuotas() throws ParseException {

		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		Date fecha=format.parse("2011/07/22");
		
		
		ColocacionCuota obj=new ColocacionCuota();
		obj.registrarCuotas("viv0001",201110,10.4, format.parse("2011/07/21"));
		obj.registrarCuotas("viv0002",201111, 50.8,format.parse("2011/07/23"));
		obj.registrarCuotas("viv0003", 201112,30.8, format.parse("2011/07/13"));
		PagodeCuota obj_cuotas=new PagodeCuota(obj.getCuotas());
		assertEquals(3, obj_cuotas.listaCuotas.size());
		obj_cuotas.PagarCuota("viv0001",201110,"C");
		assertEquals(2, obj_cuotas.listaCuotas.size());



	}

}
