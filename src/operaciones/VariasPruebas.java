package operaciones;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculadoraTestDivide.class, CalculadoraTestMultiplica.class, CalculadoraTestResta.class,
		CalculadoraTestSuma.class })
public class VariasPruebas {

}
