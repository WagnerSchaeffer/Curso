package cap4;

import java.util.Scanner;

public class CalcularIR {

	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);
		double ir;
		double deducao = 0;
		System.out.println("Informe o salário: ");
		double salario = numeros.nextDouble();

		double alicota = 0;

		if (salario <= 1903.98) {
			alicota = 0;
		} else if (salario <= 2826.65) {
			alicota = 7.5;
			deducao = 142.80;
		} else if (salario <= 3751.05) {
			alicota = 15.0;
			deducao = 354.80;
		} else if (salario <= 4664.68) {
			alicota = 22.5;
			deducao = 636.13;
		} else if (salario > 4664.68) {
			alicota = 27.5;
			deducao = 869.36;
		}

		ir = salario * (alicota / 100) - deducao;
		if (ir < 0) {
			ir = 0.00;
		}

		System.out.println("Salário: " + salario);
		System.out.println("Valor do IR a recolher: " + ir);
		numeros.close();
	}

}
