package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Residente;
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
		
		void registrarUsuario(String idUsuario, 
				String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda, Residente residente) {
				Usuario usuario= new Usuario(idUsuario, nombreUsuario,tipoUsuario,vivienda, residente);
				usuarios.add(usuario);
		}
		
		
		public Usuario getUsuarios(String idUsuario) {
			Usuario resultado = new Usuario();
			for(Usuario usuario: usuarios){
				if(usuario.getIdUsuario().equals(idUsuario)){
					resultado = usuario;
				}
			}
			return resultado;
		}
		
		
	
}
