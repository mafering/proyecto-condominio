package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTests {

	Calculadora calc;
	@Before
	public void Inicio(){
		calc = new Calculadora();
	}
	
	@Test
	public void registrarUnNumeroEnCalculadora() {
		int dato = 15;
		calc.registrarNumero(dato);
		assertEquals(1, calc.getNumeros().size());
	}

	@Test
	public void registrarDosNumerosEnCalculadora() {
		 int dato1 = 15; int dato2 = 3; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 assertEquals(2, calc.getNumeros().size());
	}
	@Test
	public void registrarVariosNumeros() {
		 int dato1 = 15; int dato2 = 3;int dato3 = 15; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(3, calc.getNumeros().size());
	}
	
	@Test
	public void calcularSumatoriaNumeros() {
		 int dato1 = 15; int dato2 = 3;int dato3 = 15; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(33, calc.obtenerSumatoria(),0);
	}
	
	@Test
	public void calcularPromedioNumeros() {
		 int dato1 = 15; int dato2 = 15;int dato3 = 15; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(15.00, calc.obtenerPromedio(), 2);
		 
	}
	
	
	@Test
	public void obtenerMinNumero() {
		 int dato1 = 15; int dato2 = 8;int dato3 = 10; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(8, calc.obtenerMin(), 0);
	}
	
	@Test
	public void obtenerMaxNumero() {
		 int dato1 = 15; int dato2 = 8;int dato3 = 10; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(15, calc.obtenerMax(), 0);
		 
	}
	
	@Test
	public void obtenerMinNegativo() {
		 int dato1 = -5; int dato2 = -2;int dato3 = -8; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(-8, calc.obtenerMinNegativo(), 0);
		 
	}
	
	@Test
	public void obtenerMaxNegativo() {
		int dato1 = -3; int dato2 = -10;int dato3 = -8; 
		 calc.registrarNumero(dato1); 
		 calc.registrarNumero(dato2);
		 calc.registrarNumero(dato3);
		 assertEquals(-3, calc.obtenerMaxNegativos(), 0);
		 
	}
	

}
