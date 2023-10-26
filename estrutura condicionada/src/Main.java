import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		int hora;

		System.out.println("quantas horas?");
		hora = SC.nextInt();

		if (hora < 12) {
			System.out.println("bom dia");
		} else {
			if (hora < 18) {
				System.out.println("boa tarde");
			} else {
				System.out.println("boa noite");
			}

			SC.close();
		}
	}
}
