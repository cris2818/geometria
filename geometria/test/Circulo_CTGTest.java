import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;

public class Circulo_CTGTest {
	private Circulo_CTG cir1, cir2, cir3;
	
	@Before
	public void inicioPruebas() { //Creamos los objetos
		cir1 = new Circulo_CTG(7, "circulo");
		cir2 = new Circulo_CTG(0, "circulo");
		cir3 = new Circulo_CTG(-3, "circulo");
	}
	
	@After
	public void finPrueba() { // Eliminamos los objetos
		cir1 = null;
		cir2 = null;
		cir3 = null;
	}

	@Test
	public void testAreaCir1() {
		double area1 = cir1.area();
		assertEquals(153.94, area1, 0.01);
	}
	
	@Test
	public void testAreaCir2() {		
		double area2 = cir2.area();	
		assertEquals(0.00, area2, 0.01);	
	}
	
	@Test
	public void testAreaCir3() {		
		double area3 = cir3.area();		
		assertEquals(28.27, area3, 0.01);
	}

	@Test
	public void testPerimetro1() {
		double p1 = cir1.perimetro();		
		assertEquals(43.98, p1, 0.01);		
	}
	
	@Test
	public void testPerimetro2() {		
		double p2 = cir2.perimetro();		
		assertEquals(0.00, p2, 0.01);	
	}
	
	@Test
	public void testPerimetro3() {		
		double p3 = cir3.perimetro();		
		assertEquals(18.85, p3, 0.01);
	}

}
