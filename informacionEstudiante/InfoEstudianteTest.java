package informacionEstudiante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoEstudianteTest {

	@Test
	public void promedio0() {
		System.out.println("Promedio con 0... en español");
		Asignatura español = new Asignatura(0.0, 0.0);
		InfoEstudiante.promediarEs();
		assertTrue(InfoEstudiante.promediarEs() == 0.0);
		
	}
	
	@Test
	public void promedio10y0() {
		System.out.println("Promedio con 0 y 10... en español");
		
		Asignatura español = new Asignatura(10.0, 0.0);
		InfoEstudiante.promediarEs();
		assertTrue(InfoEstudiante.promediarEs() == 5.0);
		
	}
	
}
