package primeiro.projeto;

public class terceiroProjeto {

	public static void main(String[] args) {

		int idadePermitida = 18;
		int minhaIdade = 17;

		if (minhaIdade >= idadePermitida) {

			System.out.println("Voce pode tirar habilitação");

		} else {

			System.out.println("Não é permitido tirar habilitação");

		}
		
		int mediaPassar = 9;
		int nota1 = 2;
		int nota2 = 5;
		int nota3 = 10;
		int media = (nota1 + nota2 + nota3)/3;
		
		
		if(media >= mediaPassar) {
			System.out.println("Voce passou de ano");
		}else {
			
			System.out.println("Voce não passou de ano");
			
			
		}
		

	}
}
