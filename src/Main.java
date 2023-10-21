import java.util.Locale;
import java.util.Scanner; 
     // ctrl + shift + o : para fazer as import automatico!!!
public class Main {
	public	static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner SC = new Scanner(System.in); 
		
		double largura = SC.nextDouble();
		double comprimento = SC.nextDouble();
		double metroQuadrado = SC.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado; //ctrl + espaço -> faz com que o nome repetido seja auto complementado 
		
		System.out.printf("AREA = %.2f%n " , area);
		System.out.printf("PREÇO = %.2f%n" , preco);
		
	   	SC.close();
	   	
	   	//estrutura sequencial
		
	}
}
