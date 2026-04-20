package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(20,10);
		int result = calc.suma();
		assertEquals(30, result);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(20,10);
		int result = calc.resta();
		assertEquals(10, result);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(20,10);
		int result = calc.multiplica();
		assertEquals(200, result);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20,10);
		int result = calc.divide();
		assertEquals(2, result);
	}

}
