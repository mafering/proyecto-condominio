package edu.upc.condominio.procesos;

import java.text.ParseException;

import org.junit.Test;

import edu.upc.condominio.procesos.EgresosRegistros;
import edu.upc.condominio.entidades.Usuario;

	
	public class EgresosRegistrosTest {

		@Test
		public void mantenimiento() throws ParseException{
			

			EgresosRegistros egresosNuevo = new EgresosRegistros();
			egresosNuevo.egresosAgregarRegistro("1", usuarioNuevo1, "Gastos Administrativos", "Hojas Bond A4", "01/07/2011", 100);
			
			egresosNuevo.egresosAgregarRegistro("1", usuarioNuevo2, "Gastos Mantenimiento", "Edificios y Residencias", "04/07/2011", 200);
			egresosNuevo.egresosAgregarRegistro("1", usuarioNuevo3, "Gastos Activos Fijos", "Servidor", "20/08/2011", 1300);			
			
			
		}
		
	}
