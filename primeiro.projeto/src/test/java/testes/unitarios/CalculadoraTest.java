package testes.unitarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

private int resultado;
@Test
public void testSomar() {
	int resultado = Calculadora.somar(10, 10);
	assertEquals(20, resultado);
	
	
	}
@Test
public void testDividir() {
	int resultado = Calculadora.dividir(100, 10);
	assertEquals(10, resultado);
	
	
}
@Test(expected = ArithmeticException.class)
public void testDividirPorZero() {
	int resultado = Calculadora.dividir(100, 0);
	
	
}

}
