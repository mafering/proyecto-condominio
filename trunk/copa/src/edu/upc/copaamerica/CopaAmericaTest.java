package edu.upc.copaamerica;


public class CopaAmericaTest {


	
	public static void main(String[] args) {
		
/*		Equipo equipo1 = new Equipo();
		Equipo equipo2 = new Equipo();
		
		equipo1.setNombre("Selección Peruana");
		equipo1.setPais("Perú");
		
		equipo2.setNombre("Selección Uruguaya");
		equipo2.setPais("Uruguay");		
		
				
		System.out.println ("El 1er equipo es: " + equipo1.getPais());
		System.out.println ("El 2do equipo es: " + equipo2.getPais());
		
		Equipo equipo3 = new Equipo("Selección Argentina", "Argentina");
		
		System.out.println ("El 3ro equipo es: " + equipo3.getPais());*/
		
		Equipo equipo1 = Equipo.crearEquipo();
		Equipo equipo2 = Equipo.crearEquipo();
		
		equipo1.setNombre("Selección Peruana");
		equipo1.setPais("Perú");
		
		equipo2.setNombre("Selección Uruguaya");
		equipo2.setPais("Uruguay");		
		
				
		System.out.println ("El 1er equipo es: " + equipo1.getPais());
		System.out.println ("El 2do equipo es: " + equipo2.getPais());
		
		Equipo equipo3 = Equipo.crearEquipo("Selección Argentina", "Argentina");
		
		System.out.println ("El 3ro equipo es: " + equipo3.getPais());		
	}

}
