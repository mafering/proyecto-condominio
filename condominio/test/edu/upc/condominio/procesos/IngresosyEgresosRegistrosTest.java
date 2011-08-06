package edu.upc.condominio.procesos;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import edu.upc.condominio.procesos.EgresosRegistros;
import edu.upc.condominio.entidades.Usuario;

import static org.junit.Assert.assertEquals;
	


	public class IngresosyEgresosRegistrosTest {

		RegistrarTipoUsuario regTipoUsuario ;
		RegistrarUsuario regUsuario ;
		RegistroVivienda regVivienda ;

		
		@Test
			
		public void mantenimiento(){
			
		
			//Creando Vivienda
			regVivienda = new RegistroVivienda();
			regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,"casa", "res0001");
			regVivienda.registrarVivienda("viv0002", "panamerica", 2145,100.5, "edificio", "res0001");
			regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,"casa", "res0002");
			regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,"Edificio", "res0003");
			
			//Registrando Tipos de Usuario
			regTipoUsuario = new RegistrarTipoUsuario();
			regTipoUsuario.registrarTipoUsuario(1, "Contactos");
			regTipoUsuario.registrarTipoUsuario(2, "Contactos Principales");
			regTipoUsuario.registrarTipoUsuario(3, "Miembros de Comite");
			regTipoUsuario.registrarTipoUsuario(4, "Administrador");
			
			//Registrando 4 Usuarios con Tipos diferentes
			regUsuario = new RegistrarUsuario();
			regUsuario.registrarUsuario("u001", "Usuario Prueba 1", 
					regTipoUsuario.getTipoUsuario(1), regVivienda.getVivienda("viv0001"));

				
			EgresosRegistros egresosNuevo = new EgresosRegistros();
			IngresosRegistro ingresosNuevos = new IngresosRegistro();
			
			
			egresosNuevo.egresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Gastos Administrativos", "Hojas Bond A4", "01/07/2011", 100);
			egresosNuevo.egresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Gastos Mantenimiento", "Edificios y Residencias", "04/07/2011", 200);
			egresosNuevo.egresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Gastos Activos Fijos", "Servidor", "20/08/2011", 1300);		
			
			ingresosNuevos.ingresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Actividad", "Pollada para Servidor", "30/08/2011", 2000);
			
			egresosNuevo.egresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Gastos Activos Fijos", "Servidor", "20/09/2011", 1300);
			ingresosNuevos.ingresosAgregarRegistro("1", regUsuario.getUsuarios("u001"), "Actividad", "Canasta Navideña", "24/12/2011", 200);
						
			
			
		}
		
	}
