package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.entidades.AreaComun;

public class RegistroAreaComunTest {
	RegistroAreaComun registroAreaComun;
	AreaComunSeparacion areaComunSeparar;
	
	@Before
	public void Inicializar(){
		registroAreaComun = new RegistroAreaComun();	
		areaComunSeparar = new AreaComunSeparacion();
	}
	
	@Test
	public void areasComunesRegistrando(){		
		registroAreaComun.registrar("A01", "Piscina", "Bloque01", 100, "Disponible", 0, "", "", "");
		registroAreaComun.registrar("A02", "Gimnasio", "Bloque02", 100, "Disponible", 0, "", "", "");
		registroAreaComun.registrar("A03", "Sauna", "Bloque03", 100, "Disponible", 0, "", "", "");
		assertEquals(3,registroAreaComun.getAreas().size());
		
		//System.out.println("Registros  agregados: " + registroAreaComun.getAreas().size());
		}
	
	@Test
	public void areasComunesActualizadas(){		
		registroAreaComun.actualizar("A01","Piscina", "Bloque01", 100, "En mantenimiento");
		registroAreaComun.actualizar("A02", "Parrilla", "Bloque02", 100, "Disponible");
		assertEquals(2,registroAreaComun.getRegistroActualizados());
		}
	
	@Test
	public void areasComunesSeparar(){		
		
		areaComunSeparar.separar("A01", "2011/08/13", 230, "40826605", "Regresara mañana a 1eraq hora");
		registroAreaComun.actualizar("A01", "Piscina", "Bloque01", 100, "Disponible");		
		areaComunSeparar.separar("A01", "2011/08/13", 230, "40826605", "Regresara mañana a 1eraq hora");
		registroAreaComun.actualizar("A01", "Piscina", "Bloque01", 300, "Disponible");
		areaComunSeparar.separar("A01", "2011/08/13", 230, "40826605", "Regresara mañana a 1eraq hora");
		
		areaComunSeparar.separar("A01", "2011/08/13", 230, "40826605", "Regresara mañana a 1eraq hora");
		areaComunSeparar.separar("A01", "2011/08/13", 230, "34516798", "Competencia");
		
		areaComunSeparar.separar("A01", "2011/08/14", 230, "12345678", "Que limpien bien los ongos");
		areaComunSeparar.separar("A01", "2011/08/15", 230, "12345678", "Que limpien bien los ongos");
		
		assertEquals(3,areaComunSeparar.getRegistroActualizados());
	
		}	
	
	@Test
	public void consultaAreasComunesReservadas(){
		
		areaComunSeparar.listadeReservas();
		
		System.out.println(areaComunSeparar.getRegistroReservados());		
		//assertEquals(2,areaComunSeparar.getRegistroReservados());
		}
	
}
