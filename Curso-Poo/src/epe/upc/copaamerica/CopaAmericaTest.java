package epe.upc.copaamerica;



public class CopaAmericaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Equipo equipo1 = Equipo.crearEquipo();
		//Equipo equipo1 = new Equipo();
		equipo1.setNombre("Selección Peruana");
		equipo1.setPais("Perú");
		Equipo equipo2 = Equipo.crearEquipo();
		//Equipo equipo2 = new Equipo();
		equipo2.setNombre("Selección Uruguaya");
		equipo2.setPais("Uruguay");
		
		Equipo equipo3 = Equipo.crearEquipo();
		//Equipo equipo3 = Equipo("Selección Argentina", "Argentina");
		equipo3.setNombre("Selección Argentina");
		equipo3.setPais("Argentina");
		System.out.println("El equipo 1 es de "+ equipo1.getPais());
		System.out.println("El equipo 2 es de "+ equipo2.getPais());
		System.out.println("El equipo 3 es de "+ equipo3.getPais());
		
	}

}
