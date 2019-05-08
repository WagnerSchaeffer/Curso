package cap4;

public class ControleDecisaoIfElse {

	public static void main(String[] args) {

		double valorDaCompra = 1000;
		double valorAPagar = 0;

		if (valorDaCompra >= 2000) {
			valorAPagar = valorDaCompra * 0.90;
		} else if (valorDaCompra >= 1000) {
			valorAPagar = valorDaCompra * 0.95;
		} else {
			valorAPagar = valorDaCompra;
		}
		System.out.println("Total a pagar: " + valorAPagar);
	}

}
