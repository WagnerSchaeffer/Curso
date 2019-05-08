package cap3;

import java.util.Scanner;

public class CalculandoAumentoDePreco {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		double valorProduto = numeros.nextDouble();

		System.out.print("Informe o percentual de Aumento: ");
		double taxaAumento = numeros.nextDouble();

		Double resultado = valorProduto + valorProduto * (taxaAumento / 100);
		System.out.println("Valor original do produto: " + valorProduto);
		System.out.println("Taxa de aumento: " + taxaAumento + "%");
		System.out.println("Valor final do produto: " + resultado);
		numeros.close();
	}

}
