package edu.upc.condominio.procesos;

import java.util.ArrayList;

import edu.upc.condominio.entidades.Ingresos;
import edu.upc.condominio.entidades.Usuario;
import edu.upc.condominio.procesos.EgresosRegistros;

public class IngresosRegistro {
	
	private static ArrayList<Ingresos> ingresosTabla = new ArrayList<Ingresos>();

	
	public void ingresosAgregarRegistro(
			  String ingresoId,
			  Usuario idUsuario,
			  String tipoDeIngreso, 
			  String motivo,
			  String fecha,
			  int valor){
		
		ingresosValidacionesSaldoCaja(valor);
		
		Ingresos  egresoRegistro = new Ingresos(ingresoId, idUsuario, tipoDeIngreso, motivo, fecha, valor); 
		ingresosTabla.add(egresoRegistro);

		System.out.println("Se registro con exito el INGRESO: S/." + valor +"\n" +
		"el saldo actual es: S/. " + EgresosRegistros.cajaSaldo);

	}


	private void ingresosValidacionesSaldoCaja(int valor) {
		EgresosRegistros.cajaSaldo = EgresosRegistros.cajaSaldo + valor;		
	}
	
	
	
}
