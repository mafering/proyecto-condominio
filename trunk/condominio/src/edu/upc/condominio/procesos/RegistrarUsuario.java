package edu.upc.condominio.procesos;

import java.util.ArrayList;
import java.util.Date;

import edu.upc.condominio.entidades.Residente;
import edu.upc.condominio.entidades.TipoUsuario;
import edu.upc.condominio.entidades.Usuario;
import edu.upc.condominio.entidades.Visita;
import edu.upc.condominio.entidades.Vivienda;

public class RegistrarUsuario {

		private ArrayList<Usuario> usuarios;

		public RegistrarUsuario() {
			usuarios = new ArrayList<Usuario>();
		}

		public ArrayList<Usuario> getUsuarios() {
			return usuarios;
		}
		
		public void registrarUsuario(String idUsuario, 
			String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda) {
			Usuario usuario= new Usuario(idUsuario, nombreUsuario,tipoUsuario,vivienda);
			usuarios.add(usuario);
		}
		
		public void registrarUsuario(String idUsuario, 
				String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda, Residente residente) {
				Usuario usuario= new Usuario(idUsuario, nombreUsuario,tipoUsuario,vivienda, residente);
				usuarios.add(usuario);
		}
		
		public void registrarUsuario(String idUsuario, 
				String nombreUsuario, TipoUsuario tipoUsuario, Vivienda vivienda, Usuario usuarioMayor) {
				
				if ((usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 2) &&
					(usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 4)  ){
					throw new RuntimeException("No puede crear usuarios");
				}
				
				if (!usuarioMayor.getVivienda().getIdVivienda().equals(vivienda.getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
					throw new RuntimeException("No puede crear usuarios de otras viviendas");
				}

				if (usuarioMayor.getVivienda().getIdVivienda().equals(vivienda.getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
					if(tipoUsuario.getIdTipoUsuario() != 1){
						throw new RuntimeException("Solo puede crear usuarios de Tipo Contactos");	
					}
				}

				for(Usuario usuario: usuarios){
					if(usuario.getIdUsuario().equals(idUsuario)){
						throw new RuntimeException("El usuario ya se encuentra registrado");
						
					}
				}
				
				Usuario usuario= new Usuario(idUsuario, nombreUsuario,tipoUsuario,vivienda);
				usuarios.add(usuario);
		}
		public void modificarUsuario(Usuario usuarioAntes, Usuario usuarioModificado, Usuario usuarioMayor) {
				
				if ((usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 2) &&
					(usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 4)  ){
					throw new RuntimeException("No puede modificar usuarios");
				}
				
				if (!usuarioMayor.getVivienda().getIdVivienda().equals(usuarioAntes.getVivienda().getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
					throw new RuntimeException("No puede modificar usuarios de otras viviendas");
				}

				if (usuarioMayor.getVivienda().getIdVivienda().equals(usuarioAntes.getVivienda().getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
					if(usuarioAntes.getTipoUsuario().getIdTipoUsuario() != 1){
						throw new RuntimeException("No Puedes modificar usuarios de Tipo Contactos");	
					}
				}
				
				int posicion = usuarios.indexOf(usuarioAntes);
				usuarios.set(posicion, usuarioModificado);
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
		
		public String getNombreUsuario(String idUsuario) {
			String resultado = "";
			for(Usuario usuario: usuarios){
				if(usuario.getIdUsuario().equals(idUsuario)){
					resultado = usuario.getNombreUsuario();
				}
			}
			return resultado;
		}
		
		public void eliminarUsuario(Usuario usuarioEliminar, Usuario usuarioMayor) {
			
			if ((usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 2) &&
				(usuarioMayor.getTipoUsuario().getIdTipoUsuario()!= 4)  ){
				throw new RuntimeException("No puede eliminar usuarios");
			}
			
			if (!usuarioMayor.getVivienda().getIdVivienda().equals(usuarioEliminar.getVivienda().getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
				throw new RuntimeException("No puede eliminar usuarios de otras viviendas");
			}

			if (usuarioMayor.getVivienda().getIdVivienda().equals(usuarioEliminar.getVivienda().getIdVivienda()) && (usuarioMayor.getTipoUsuario().getIdTipoUsuario()== 2)){
				if(usuarioEliminar.getTipoUsuario().getIdTipoUsuario() != 1){
					throw new RuntimeException("No Puedes eliminar usuarios diferentes de Tipo Contacto");	
				}
			}
			usuarios.remove(usuarioEliminar);
	}
	
		
		
		
	
}
