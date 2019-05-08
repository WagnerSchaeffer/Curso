package cap3;

public class OperadoresIncrementaisEDecrementais {

	public static void main(String[] args) {

		int x = 3;
		System.out.println("Resultado: " + (++x + 2));// pré-incremental
		System.out.println("Valor de x: " + x);

		x = 3;
		System.out.println("Resultado: " + (x++ + 2));// pós-incremental
		System.out.println("Valor de x: " + x);

		System.out.println("----------------------------------------");

		x = 3;
		System.out.println("Resultado: " + (--x + 2));// pré-incremental
		System.out.println("Valor de x: " + x);

		x = 3;
		System.out.println("Resultado: " + (x-- + 2));// pós-incremental
		System.out.println("Valor de x: " + x);

	}

}
