package cap4;

import java.util.Scanner;

public class CalculoMediaEscolar {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		double media;
		System.out.println("Digite nota1: ");
		double nota1 = numeros.nextDouble();

		System.out.println("Digite nota2: ");
		double nota2 = numeros.nextDouble();
		
		System.out.println("Digite nota3: ");
		double nota3 = numeros.nextDouble();

		media = (nota1 + nota2 + nota3) /3;
		
		if(media<5) {
			System.out.print("Aluno Reprovado");
		}else if(media<=7) {
			System.out.print("Alune em Recuperação");
		}else {
			System.out.print("Aluno Aprovado");
		}
		
		System.out.println(" com a média: " + media);
		numeros.close();
		
	}

}
