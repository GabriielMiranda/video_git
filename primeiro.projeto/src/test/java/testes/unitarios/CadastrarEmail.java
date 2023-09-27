package testes.unitarios;

public class CadastrarEmail {

	public static boolean validarEmail (String email) {
		return email.matches("[A-Za-z0-9+_.-]+@(.+)$");
		
		
	}

	}


