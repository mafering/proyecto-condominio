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



public class ConsultaDeMorososTests {


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
		obj.registrarCuotas("V0102",2011,110.4, format.parse("2011/07/30"));
		obj.registrarCuotas("D1201",2011, 250.8,format.parse("2011/07/28"));
		obj.registrarCuotas("D2012", 2011,330.20, format.parse("2011/10/28"));
		
		ArrayList<Cuota> lstCuotas=obj.getCuotas();
		
		ConsultaDeMorosos obj_morosos= new ConsultaDeMorosos(lstCuotas,lstVivienda,lstResidente);
		// FECHA DEBE SER MAYOR A LA FECHA DE VENCIMIENTO
		obj_morosos.listaCuotasMorosos(format.parse("2011/08/11"));
		
		
	}
	
	
}
