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
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		Date fecha=format.parse("2011/07/21");
		
		RegistroResidente registroresidente=new RegistroResidente();
		
		registroresidente.registrarResidente("12345678", "Eva María", "Terrazas Garcia",25, "evamaria@hotmail.com", "12345");
		registroresidente.registrarResidente("12345679", "José Antonio", "Lopez Roque", 41, "joseantonio@hotmail.com", "12367");
		registroresidente.registrarResidente("12345677", "Cesar Gustavo", "Aguilar Cardenas",32, "cesargustavo@hotmail.com", "12389");
		ArrayList<Residente> lstResidente=registroresidente.getResidentes();
		
		
		RegistroVivienda registroVivienda=new RegistroVivienda();
		registroVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,"casa", "12345678");
		registroVivienda.registrarVivienda("viv0002", "panamerica", 2145,100.5, "edificio", "12345679");
		registroVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,"casa", "12345679");
		ArrayList<Vivienda> lstVivienda=registroVivienda.getVivienda();
		
		ColocacionCuota obj=new ColocacionCuota();
		obj.registrarCuotas("viv0001",2011,10.4, format.parse("2011/07/21"));
		obj.registrarCuotas("viv0002",2011, 50.8,format.parse("2011/07/23"));
		obj.registrarCuotas("viv0003", 2011,30.8, format.parse("2011/07/13"));
		
		ArrayList<Cuota> lstCuotas=obj.getCuotas();
		
		ConsultaDeMorosos obj_morosos=new ConsultaDeMorosos(lstCuotas,lstVivienda,lstResidente);
		// FECHA DEBE SER MAYOR A LA FECHA DE VENCIMIENTO
		obj_morosos.listaCuotasMorosos(format.parse("2011/08/11"));
		
		
	}
	
	
}
