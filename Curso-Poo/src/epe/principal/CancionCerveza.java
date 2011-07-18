package epe.principal;

public class CancionCerveza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroCervezas = 99;
		String palabra = "botellas";

		while (numeroCervezas > 0) {
			if (numeroCervezas == 1) {
				palabra = "botella"; // nos queda una
			}
			/*
			 * System.out.println(numeroCervezas + " "+ palabra +
			 * " de cerveza en la caja");
			 */
			System.out.println("Sacamos una");
			System.out.println("La pasamos");
			// numeroCervezas--;
			numeroCervezas = numeroCervezas - 1;
			if (numeroCervezas > 0) {
				System.out.println(numeroCervezas + " " + palabra
						+ " de cerveza en la caja");
			} else {
				System.out.println("Se acabo!!! nooo");
			}

		}

	}

}
