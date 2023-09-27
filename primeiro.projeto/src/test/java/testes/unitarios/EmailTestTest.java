package testes.unitarios;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmailTestTest {

	

	@Test
	public void testEmailValido() {
		assertTrue(CadastrarEmail.validarEmail("gabrielmiranda37@gmail.com.br"));
		assertTrue(CadastrarEmail.validarEmail("gabrielmiranda37@gmail.com"));
		
	}
	@Test
	public void testEmailInvalido() {
		assertFalse(CadastrarEmail.validarEmail("e2etreinamentos"));
		
	}

}
