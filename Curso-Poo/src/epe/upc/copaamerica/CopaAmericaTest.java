package epe.upc.copaamerica;



public class CopaAmericaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Equipo equipo1 = Equipo.crearEquipo();
		//Equipo equipo1 = new Equipo();
		equipo1.setNombre("Selecci�n Peruana");
		equipo1.setPais("Per�");
		Equipo equipo2 = Equipo.crearEquipo();
		//Equipo equipo2 = new Equipo();
		equipo2.setNombre("Selecci�n Uruguaya");
		equipo2.setPais("Uruguay");
		
		Equipo equipo3 = Equipo.crearEquipo();
		//Equipo equipo3 = Equipo("Selecci�n Argentina", "Argentina");
		equipo3.setNombre("Selecci�n Argentina");
		equipo3.setPais("Argentina");
		System.out.println("El equipo 1 es de "+ equipo1.getPais());
		System.out.println("El equipo 2 es de "+ equipo2.getPais());
		System.out.println("El equipo 3 es de "+ equipo3.getPais());
		
	}

}
