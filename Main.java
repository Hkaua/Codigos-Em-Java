	import java.util.Locale;
	import java.util.Scanner; 
	     
	public class Main {
		public	static void main(String[]args) {
			
			Locale.setDefault(Locale.US);
			Scanner SC = new Scanner(System.in); 
			
			int idade = SC.nextInt();
			int soma = 0;
			int cont = 0;
			
			
			while (idade >= 0) {
				soma = soma + idade;
				cont = cont + 1;
				idade = SC.nextInt();
				}
			if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
			}
			else {
				System.out.println("impossivel calcular!");
			}
				
			SC.close();
	}
}
