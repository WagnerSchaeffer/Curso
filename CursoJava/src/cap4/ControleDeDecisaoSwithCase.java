package cap4;

public class ControleDeDecisaoSwithCase {

	public static void main(String[] args) {

		char vogal = 'e';

		switch (vogal) {
		case 'A':
			System.out.println("Vogal A");
			break;
		case 'E':
			System.out.println("Vogal E");
			break;
		case 'I':
			System.out.println("Vogal I");
			break;
		case 'O':
			System.out.println("Vogal O");
			break;
		case 'U':
			System.out.println("Vogal U");
			break;

		default:
			System.out.println("Não há vogal correspondente");

		}
	}

}
