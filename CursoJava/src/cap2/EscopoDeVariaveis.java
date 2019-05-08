package cap2;

public class EscopoDeVariaveis {

	/*
	 * Classe que explica o escopo de variáveis e sua importância em Java
	 */
	public static void main(String[] args) {

		String nome = "Ana";
		int idade = 21;

		{
			String telefone = "22 9 88888-8888";
			System.out.println("Nome: " + nome);
			System.out.println("Indade: " + idade);
			System.out.println("Telefone" + telefone);
		}
		System.out.println("Nome: " + nome);
		System.out.println("Indade: " + idade);
//		System.out.println("Telefone" + telefone);
	}

}
