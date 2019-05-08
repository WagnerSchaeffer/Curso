package cap2;

public class PromocaoDeTiposPrimitivos {

	public static void main(String[] args) {

		byte b = 10;
		short s = b;

		System.out.println("S: " + s);

		// ---------------------------------------------

		short ss = 12;
		byte bb = (byte) ss;

		System.out.println("BB: " + bb);

	}

}
