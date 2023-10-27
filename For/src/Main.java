import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int N = SC.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = SC.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);
		
		SC.close();
	}
}
