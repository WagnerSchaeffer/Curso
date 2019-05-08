package cap4;

import java.util.Scanner;

public class VerificaNumero {

	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);

		System.out.println("Informe um numero inteiro: ");
		int i = numeros.nextInt();

		if (i % 2 == 0) {
			System.out.println("Numero " + i + " é par");
		} else {
			System.out.println("Numero " + i + " é impar");
		}

		numeros.close();
	}
}
