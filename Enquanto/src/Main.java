import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

			Scanner SC = new Scanner(System.in);
			
			int x = SC.nextInt();
			
			int soma = 0;
			while (x != 0) {
				soma = soma + x;
				x = SC.nextInt();
			}
		
			System.out.println(soma);
			SC.close();
	}
}
