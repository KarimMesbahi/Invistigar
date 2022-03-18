package Tarea3_2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuentaTest {

	
	
	@Test
	public void testEstado() {
		System.out.println("jfkashdfkj");
		Cuenta cue = new Cuenta();
		double resultado = 0.0;
		double result = cue.estado();
		assertEquals(resultado, result, 0.0);
	}
	
	
	
	
	
	
	
	
	
/**
	@Test(expected = ArithmeticException.class)
	public void testIngresar() throws Exception {
		System.out.println("Exception neg");
		double cantidad = -5.5;
		try {
			
			Cuenta.ingresar(cantidad);
			
		} catch (Exception e) {
			System.out.println("Exp suui");
	}
	
	}**/
}
