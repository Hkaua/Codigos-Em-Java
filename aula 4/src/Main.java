import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = SC.nextInt();
		// desse jeito vaid ar erro. vai dar linha pendente e nao vai terminar o codigo.
		// tem que botar embaixo esse comando "SC.nextLine();" desse jeito:
		SC.nextLine();
		s1 = SC.nextLine();
		s2 = SC.nextLine();
		s3 = SC.nextLine();

		// next so vai ler uma palavra sozinho
		// nextline ler toda a linha

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// dica: ctrl + Shift + F -> faz com que a o codigo fique organizado.

	}
}