package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.TipoUsuario;

public class RegistrarTipoUsuario {

		private ArrayList<TipoUsuario> tipoUsuarios;

		public RegistrarTipoUsuario() {
			tipoUsuarios = new ArrayList<TipoUsuario>();
		}

		public ArrayList<TipoUsuario> getTipoUsuario() {
			return tipoUsuarios;
		}
		
		void registrarTipoUsuario(int idTipoUsuario, String descripcion) {
			TipoUsuario tipoUsuario= new TipoUsuario(idTipoUsuario, descripcion);
			tipoUsuarios.add(tipoUsuario);
		}
		
		public TipoUsuario getTipoUsuario(int idTipoUsuario) {
			TipoUsuario resultado = new TipoUsuario();
			for(TipoUsuario tipoUsuario: tipoUsuarios){
				if(tipoUsuario.getIdTipoUsuario() == idTipoUsuario){
					resultado = tipoUsuario;
				}
			}
			return resultado;
		}
		
		
	
	
}
