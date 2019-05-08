package cap3;

public class Compra {

	public static void main(String[] args) {
		
		double valor = 4000;
		
		double resultado = valor <= 1000 ? valor : valor <= 3000 ? valor * 0.95 : valor *0.90;
		
		System.out.println("Valor da compra: "+valor);
		System.out.println("Valor a pagar: "+resultado);
		
//		String resultado =  (valor <= 3000 && valor > 1000 ? "Desconto é de 5%" : "");
//		System.out.print(resultado);
//		resultado = (valor <= 1000 ? "Desconto é de 0%":"");
//		System.out.print(resultado);
//		resultado = (valor >3000 ? "Desconto é de 10%":"");
//		System.out.print(resultado);
	}

}
