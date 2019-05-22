package informacionEstudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoEstudianteTest {

	@Test
	public void promedioEs() {
		System.out.println("Promedio en español");
		assertTrue(InfoEstudiante.promediarEs() == 3);
		
	}
	
	@Test
	public void promedioIn() {
		System.out.println("Promedio con en ingles");
		
		
		assertTrue(InfoEstudiante.promediarIn() == 3.95);
		
	}
	
}
