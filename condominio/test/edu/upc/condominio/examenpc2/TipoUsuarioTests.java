package edu.upc.condominio.examenpc2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import edu.upc.condominio.procesos.*;
import edu.upc.condominio.entidades.*;

public class TipoUsuarioTests {

	RegistrarTipoUsuario regTipoUsuario;
	RegistrarUsuario regUsuario;
	RegistroVivienda regVivienda;
	RegistroResidente registroresidente = new RegistroResidente();

	RegistrarSeccion regSecciones;
	RegistrarPost regPost;
	RegistrarMensaje regMensaje;

	ArrayList<Usuario> listaUsuarios;

	@Before
	public void Inicio() throws Exception {
		// Creando Residente
		registroresidente = new RegistroResidente();
		registroresidente.registrarResidente("12345678", "Eva María",
				"Terrazas Garcia", 25, "evamaria@hotmail.com", "12345");
		registroresidente.registrarResidente("12345679", "José Antonio",
				"Lopez Roque", 41, "joseantonio@hotmail.com", "12367");
		registroresidente.registrarResidente("12345677", "Cesar Gustavo",
				"Aguilar Cardenas", 32, "cesargustavo@hotmail.com", "12389");
		registroresidente.registrarResidente("12345680", "Cesar Gustavo",
				"Aguilar Cardenas", 32, "cesargustavo2@hotmail.com", "12389");

		// Creando Vivienda
		regVivienda = new RegistroVivienda();
		regVivienda.registrarVivienda("viv0001", "los alamos", 1758, 25.5,
				"casa", registroresidente.getResidente("12345678"));
		regVivienda.registrarVivienda("viv0002", "panamerica", 2145, 100.5,
				"edificio", registroresidente.getResidente("12345679"));
		regVivienda.registrarVivienda("viv0003", "santa rosa", 4201, 90.5,
				"casa", registroresidente.getResidente("12345677"));
		regVivienda.registrarVivienda("viv0004", "lurigancho", 782, 120.5,
				"Edificio", registroresidente.getResidente("12345680"));

		// Registrando Tipos de Usuario
		regTipoUsuario = new RegistrarTipoUsuario();
		regTipoUsuario.registrarTipoUsuario(1, "Contactos");
		regTipoUsuario.registrarTipoUsuario(2, "Contactos Principales");
		regTipoUsuario.registrarTipoUsuario(3, "Miembros de Comite");
		regTipoUsuario.registrarTipoUsuario(4, "Administrador");

		// Registrando 4 Usuarios con Tipos diferentes
		regUsuario = new RegistrarUsuario();
		regUsuario.registrarUsuario("u001", "Usuario Prueba 1",
				regTipoUsuario.getTipoUsuario(1),
				regVivienda.getVivienda("viv0001"));
		regUsuario.registrarUsuario("u002", "Usuario Prueba 2",
				regTipoUsuario.getTipoUsuario(2),
				regVivienda.getVivienda("viv0002"),
				registroresidente.getResidente("12345679"));
		regUsuario.registrarUsuario("u003", "Usuario Prueba 3",
				regTipoUsuario.getTipoUsuario(3),
				regVivienda.getVivienda("viv0003"),
				registroresidente.getResidente("12345677"));
		regUsuario.registrarUsuario("u004", "Usuario Prueba 4",
				regTipoUsuario.getTipoUsuario(4),
				regVivienda.getVivienda("viv0004"),
				registroresidente.getResidente("12345680"));

		regSecciones = new RegistrarSeccion();
		regSecciones.registrarSeccion("S01", "Noticias");
		regSecciones.registrarSeccion("S02", "Foro");
		regSecciones.registrarSeccion("S03", "Asuntos de Comite");

		listaUsuarios = regUsuario.getUsuarios();

	}

	Usuario usuario;

	// 1.-Control de Tipos de Usuario
	@Test
	public void testTipoUsuarioContacto() {
		usuario = regUsuario.getUsuarios("u001");
		int idTipoUsuario = usuario.getTipoUsuario().getIdTipoUsuario();
		// Intentand crear nuevo usuario
		try {
			regUsuario.registrarUsuario("u005", "Usuario Prueba 5",
					regTipoUsuario.getTipoUsuario(1),
					regVivienda.getVivienda("viv0003"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "No puede crear usuarios");
		}
		assertEquals(4, regUsuario.getUsuarios().size());
	}

	@Test
	public void testTipoUsuarioContactoPrincipal() {
		usuario = regUsuario.getUsuarios("u002");

		// Creando Usuario de Vivienda
		try {
			regUsuario.registrarUsuario("u005", "Usuario Prueba 5",
					regTipoUsuario.getTipoUsuario(1),
					regVivienda.getVivienda("viv0002"), usuario);
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "No puede crear usuarios");
		}
		assertEquals(5, regUsuario.getUsuarios().size());

		// creando otro usuario con otra vivienda
		try {
			regUsuario.registrarUsuario("u006", "Usuario Prueba 6",
					regTipoUsuario.getTipoUsuario(1),
					regVivienda.getVivienda("viv0003"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(),
					"No puede crear usuarios de otras viviendas");
		}
		assertEquals(5, regUsuario.getUsuarios().size());
		// creando usuario de vivienda pero de tipo diferente
		try {
			regUsuario.registrarUsuario("u006", "Usuario Prueba 6",
					regTipoUsuario.getTipoUsuario(2),
					regVivienda.getVivienda("viv0002"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(),
					"Solo puede crear usuarios de Tipo Contactos");
		}
		assertEquals(5, regUsuario.getUsuarios().size());

		// Modificando nombre del usuario u005
		Usuario usuarioModificado = new Usuario();
		usuarioModificado = regUsuario.getUsuarios("u005");
		usuarioModificado.setNombreUsuario("Prueba A Modificar Nombre");
		regUsuario.modificarUsuario(regUsuario.getUsuarios("u005"),
				usuarioModificado, usuario);
		assertEquals("Prueba A Modificar Nombre",
				regUsuario.getNombreUsuario("u005"));

		// Eliminando el usuario u005
		Usuario usuarioEliminar = new Usuario();
		usuarioEliminar = regUsuario.getUsuarios("u005");
		regUsuario.eliminarUsuario(usuarioEliminar, usuario);
		assertEquals(4, regUsuario.getUsuarios().size());

	}

	@Test
	public void testTipoUsuarioComite() {
		usuario = regUsuario.getUsuarios("u003");
		int idTipoUsuario = usuario.getTipoUsuario().getIdTipoUsuario();
		// Intentand crear nuevo usuario
		try {
			regUsuario.registrarUsuario("u006", "Usuario Prueba 6",
					regTipoUsuario.getTipoUsuario(1),
					regVivienda.getVivienda("viv0003"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "No puede crear usuarios");
		}
		System.out.println(regUsuario.getUsuarios().size());
		assertEquals(4, regUsuario.getUsuarios().size());
	}

	@Test
	public void testTipoUsuarioAdministrador() {
		usuario = regUsuario.getUsuarios("u004");
		int idTipoUsuario = usuario.getTipoUsuario().getIdTipoUsuario();
		// Creando nuevo usuario

		regUsuario.registrarUsuario("u005", "Usuario Prueba 5",
				regTipoUsuario.getTipoUsuario(1),
				regVivienda.getVivienda("viv0003"), usuario);

		System.out.println(regUsuario.getUsuarios().size());
		assertEquals(5, regUsuario.getUsuarios().size());

		// Intentando crear usuario repetido
		try {
			regUsuario.registrarUsuario("u005", "Usuario Prueba 5",
					regTipoUsuario.getTipoUsuario(1),
					regVivienda.getVivienda("viv0003"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(),
					"El usuario ya se encuentra registrado");
		}
		System.out.println(regUsuario.getUsuarios().size());
		assertEquals(5, regUsuario.getUsuarios().size());
	}

	// 2.-Comunicación - Creacion de Post y Envio de Mensajes
	@Test
	public void testPublicacionPostMensajesDeUsuarios() {
		// registrando Post / usuario de tipo contacto - Seccion de Tipo Noticia
		regPost = new RegistrarPost();

		usuario = regUsuario.getUsuarios("u001");
		regPost.registraPost("P001", "Post Prueba 1",
				regSecciones.getSeccion("S01"), usuario);
		assertEquals(1, regPost.getPost().size());

		// registrando Post / usuario de tipo contacto principal - Seccion de
		// Tipo Foro
		usuario = regUsuario.getUsuarios("u002");
		regPost.registraPost("P002", "Post Prueba 2",
				regSecciones.getSeccion("S02"), usuario);
		assertEquals(2, regPost.getPost().size());

		// registrando Post / usuario de tipo contacto administrador - Seccion
		// de Tipo Comite
		usuario = new Usuario();
		usuario = regUsuario.getUsuarios("u004");
		regPost.registraPost("P003", "Post Prueba 3",
				regSecciones.getSeccion("S03"), usuario);
		assertEquals(3, regPost.getPost().size());

		// registrando Post / usuario de tipo comite intentando crear Post de
		// tipo Noticia
		usuario = regUsuario.getUsuarios("u003");
		try {
			regPost.registraPost("P004", "Post Prueba 4",
					regSecciones.getSeccion("S01"), usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "No Puede Crear Post");
		}
		assertEquals(3, regPost.getPost().size());

		// Envio de Mensajes
		// Escribe Mensaje / usuario de tipo contacto principal - Seccion de
		// Tipo Foro
		regMensaje = new RegistrarMensaje();
		usuario = regUsuario.getUsuarios("u001");
		regMensaje.registrarMensaje("M001", regPost.getPost("P001"), "Hola",
				usuario);
		assertEquals(1, regMensaje.getMensajes().size());

		// Escribe Mensaje/ usuario de tipo contacto principal - Seccion de Tipo
		// Foro
		usuario = regUsuario.getUsuarios("u002");
		regMensaje.registrarMensaje("M002", regPost.getPost("P002"), "Hola",
				usuario);
		assertEquals(2, regMensaje.getMensajes().size());

		// registrando Post / usuario de tipo contacto administrador - Seccion
		// de Tipo Comite
		usuario = new Usuario();
		usuario = regUsuario.getUsuarios("u004");
		regMensaje.registrarMensaje("M003", regPost.getPost("P003"), "Hola",
				usuario);
		assertEquals(3, regMensaje.getMensajes().size());

		// Escribe Mensaje / usuario de tipo comite intenta visualizar post de
		// tipo Foro
		usuario = regUsuario.getUsuarios("u003");
		try {
			regMensaje.registrarMensaje("M004",
					regPost.getPost("P002", usuario), "Foro", usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(),
					"Solo Puede Visualizar el Post de Comite");
		}
		assertEquals(3, regMensaje.getMensajes().size());

		// Escribe Mensaje / usuario de tipo comite intentando escribir en post
		// de comite
		usuario = regUsuario.getUsuarios("u003");
		try {
			regMensaje.registrarMensaje("M004",
					regPost.getPost("P003", usuario), "Comite", usuario);
			fail();
		} catch (Exception ex) {
			assertEquals(ex.getMessage(),
					"No Puede Escribir Mensajes solo Visualizar");
		}
		assertEquals(3, regMensaje.getMensajes().size());

	}

}
