package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.TipoUsuario;
import edu.upc.condominio.entidades.Usuario;
import edu.upc.condominio.entidades.Vivienda;

public class RegistrarUsuario {

		private ArrayList<Usuario> usuarios;

		public RegistrarUsuario() {
			usuarios = new ArrayList<Usuario>();
		}

		public ArrayList<Usuario> getUsuarios() {
			return usuarios;
		}
		
		void registrarUsuario(String idUsuario, 
							String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda) {
			Usuario usuario= new Usuario(idUsuario, nombreUsuario,tipoUsuario,vivienda);
			usuarios.add(usuario);
		}
		
		/*
		public Visitante getVisitante(String dni) {
			Visitante resultado = new Visitante();
			for(Visitante visitante: visitantes){
				if(visitante.getDni().equals(dni)){
					resultado = visitante;
				}
			}
			return resultado;
		}
		*/
		
	
}
