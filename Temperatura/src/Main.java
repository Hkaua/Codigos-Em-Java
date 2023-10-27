import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char resp = 's';
	
		while (resp != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = SC.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = SC.next().charAt(0);
		}

		SC.close();
	}
}
