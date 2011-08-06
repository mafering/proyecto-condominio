package edu.upc.condominio.procesos;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class TipoUsuarioTests {

	
	RegistrarTipoUsuario regTipoUsuario ;
	RegistrarUsuario regUsuario ;
	RegistroVivienda regVivienda ;
	
	@Before
	public void Inicio() throws Exception {
		//Creando Vivienda
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
		regUsuario.registrarUsuario("u002", "Usuario Prueba 2", 
				regTipoUsuario.getTipoUsuario(2), regVivienda.getVivienda("viv0002"));
		regUsuario.registrarUsuario("u003", "Usuario Prueba 3", 
				regTipoUsuario.getTipoUsuario(3), regVivienda.getVivienda("viv0003"));
		regUsuario.registrarUsuario("u004", "Usuario Prueba 4", 
				regTipoUsuario.getTipoUsuario(4), regVivienda.getVivienda("viv0004"));
	}
	
	@Test
	public void consultarVisitantes() {
		
		
	}
	
}
