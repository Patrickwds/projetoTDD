import static org.junit.Assert.*;

import org.junit.Test;



public class CalculadoraTest {

	
	@Test
	public void TestSomarUmMaisUm() {
		int resultado = Calculadora.somar(1,1);
		assertEquals(2, resultado);
	}
	
	@Test
	public void TestSomarDoisMaisDois() {
		int resultado = Calculadora.somar(2,2);
		assertEquals(4, resultado);
	}

	@Test
	public void TestSubiDoisSubiDois() {
		int resultado = Calculadora.subi(50,20);
		assertEquals(30, resultado);
	}
	
	@Test
	public void TestDiviVinteDiviDois() {
		int resultado = Calculadora.divi(20,2);
		assertEquals(10, resultado);
	}
	@Test
	public void TestMultTresVezesDois() {
		int resultado = Calculadora.mult(3,2);
		assertEquals(6, resultado);
	}
}
