package edu.upc.condominio.procesos;


import java.util.ArrayList;
import edu.upc.condominio.entidades.Egresos;
import edu.upc.condominio.entidades.Usuario;

public class EgresosRegistros {

	public static int cajaSaldo = 400;
	int cajaSaldoConsulta;
	
	private static ArrayList<Egresos> egresosTabla = new ArrayList<Egresos>();

	
	public void egresosAgregarRegistro(
			  String egresoId,
			  Usuario idUsuario,
			  String tipoDeEgreso, 
			  String motivo,
			  String fecha,
			  int valor){
		
		
		cajaSaldoConsulta=0;
		egresosValidacionesSaldoCaja(valor, tipoDeEgreso, motivo);
		
		
		
		if (cajaSaldoConsulta==0){
			Egresos  egresoRegistro = new Egresos(egresoId, idUsuario, tipoDeEgreso, motivo, fecha, valor); 
			egresosTabla.add(egresoRegistro);
			cajaSaldo = cajaSaldo - valor;
			System.out.println("Se registro con exito el EGRESO: S/.-" + valor +"\n" +
					"*** el saldo actual es: S/. " + cajaSaldo);
		}
    
				
	}


	private void egresosValidacionesSaldoCaja(int valor, String tipoDeEgreso, String motivo) {
		if ((cajaSaldo - valor) <= 0 ){
			cajaSaldoConsulta = 1;
			System.out.println("No existe fondo, para " + tipoDeEgreso + " - " +
					motivo + ": S/. " + valor);
		}
		
	}
	
	
	
}
