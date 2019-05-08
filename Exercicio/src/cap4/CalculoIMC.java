package cap4;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		double IMC;
		System.out.println("Informe Peso(kg): ");
		double peso = numeros.nextDouble();

		System.out.println("Informe Altura(m): ");
		double altura = numeros.nextDouble();
		
		IMC = peso / (altura * altura);
		System.out.print("Seu IMC é: "+ IMC+ " considerado ");
		if(IMC<=18.5) {
			System.out.println("abaixo do peso normal ");
		}else if(IMC<=25) {
			System.out.println("com peso normal");
		}else if(IMC<=30) {
			System.out.println("acima do peso normal");
		}else{
			System.out.println("com obesidade");
		}
		numeros.close();
	}

}
