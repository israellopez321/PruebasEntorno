package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

    Calculadora calc;

    @BeforeEach
    void crearCalculadora() {
        calc = new Calculadora(20,10);
    }

    @AfterEach
    void borrarCalculadora() {
        calc = null;
    }

    @Test
    void testSuma() {
        assertEquals(30, calc.suma());
    }

    @Test
    void testMultiplica() {
        assertEquals(200, calc.multiplica());
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide());
    }

    @Test
    void testResta() {
        assertEquals(10, calc.resta());
    }

    @Test
    void testResta2() {
        assertTrue(calc.resta() == 10, "Resultado erroneo");
    }

    @Test
    void testDivide2() {
        assertEquals(2, calc.divide());
    }
}
