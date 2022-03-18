package Tarea3_2;

import static org.junit.Assert.assertEquals;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author karim
 *
 */
public class PruebasUtil {
	
	static Util ut = new Util();

	 @Test
	public void testFactorial() {
		System.out.println("fac Negativo error()");
		int resultado = ut.factorial(0);
		int resEsper = 1;
		assertEquals(resEsper, resultado);
	}

	@Test(expected = StackOverflowError.class)
	public void testFactorialNegativo() {
		
		ut.factorial(-5);
	}
	
	
	/** @Test
	public void testMult() {
		System.out.println("mult()");
		int resultado = ut.multiplicar(8, 4);
		int resEsper = 32;
		assertEquals(resEsper, resultado);

	}
	
	
	
	
	
	
	@Test
	
	public void tesPar() {
		System.out.println("es_Par()");
		int resultado = ut.par(7);
		int resEsper = 0;
		assertEquals(resEsper, resultado);

	}
	
	@BeforeClass
	
	public static void beforeClass() {
		System.out.println("beforeClass()");
		ut = new Util();
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	
	
**/	
}

