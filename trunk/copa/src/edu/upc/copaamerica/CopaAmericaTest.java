package edu.upc.copaamerica;


public class CopaAmericaTest {


	
	public static void main(String[] args) {
		
/*		Equipo equipo1 = new Equipo();
		Equipo equipo2 = new Equipo();
		
		equipo1.setNombre("Selecci�n Peruana");
		equipo1.setPais("Per�");
		
		equipo2.setNombre("Selecci�n Uruguaya");
		equipo2.setPais("Uruguay");		
		
				
		System.out.println ("El 1er equipo es: " + equipo1.getPais());
		System.out.println ("El 2do equipo es: " + equipo2.getPais());
		
		Equipo equipo3 = new Equipo("Selecci�n Argentina", "Argentina");
		
		System.out.println ("El 3ro equipo es: " + equipo3.getPais());*/
		
		Equipo equipo1 = Equipo.crearEquipo();
		Equipo equipo2 = Equipo.crearEquipo();
		
		equipo1.setNombre("Selecci�n Peruana");
		equipo1.setPais("Per�");
		
		equipo2.setNombre("Selecci�n Uruguaya");
		equipo2.setPais("Uruguay");		
		
				
		System.out.println ("El 1er equipo es: " + equipo1.getPais());
		System.out.println ("El 2do equipo es: " + equipo2.getPais());
		
		Equipo equipo3 = Equipo.crearEquipo("Selecci�n Argentina", "Argentina");
		
		System.out.println ("El 3ro equipo es: " + equipo3.getPais());		
	}

}
