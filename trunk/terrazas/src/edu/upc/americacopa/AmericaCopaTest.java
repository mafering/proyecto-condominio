package edu.upc.americacopa;

public class AmericaCopaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Equipo equipo1 = new Equipo();
		equipo1.setNombre("Selecci{on Preruana");
		equipo1.setPais("Peru");

		Equipo equipo2 = new Equipo();
		equipo2.setNombre("Seleciccion Uruguaya");
		equipo2.setPais("Uruguay");

		
		Equipo equipo3 = new Equipo("Selecci{on Arg","Argentina");
		
		System.out.println("El equipo 1 es de " + equipo1.getPais());
		System.out.println("El equipo 2 es de " + equipo2.getPais());
		System.out.println("El equipo 3 es de " + equipo3.getPais());
		

	}

}
