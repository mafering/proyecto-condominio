package numero;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeroTests {

	@Test
	public void crearNumeroyObtenerValor(){
		int dato = 256;
		
		Numero num = new Numero(dato);
		
		assertEquals(256, num.getValor(), 0);
		
	}
	
}

