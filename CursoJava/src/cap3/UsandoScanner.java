package cap3;

import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);
		double resultado;
		System.out.println("Digite um numero: ");
		double num1 = numeros.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double num2 = numeros.nextDouble();

		resultado = num1 + num2;
		System.out.println(resultado);
		numeros.close();

	}

}
