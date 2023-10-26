import java.util.Locale;
import java.util.Scanner;

public class Jogadores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogador[] jogadores = new Jogador[3];
		float menorAltura = Float.MAX_VALUE;
		float maiorPeso = 0;
		char inicialNome = ' ';

		for (int i = 0; i < 3; i++) {
			Jogador jogador = new Jogador();

			System.out.println("Digite o número da camisa:");
			jogador.num = input.nextInt();

			System.out.println("Digite o peso:");
			jogador.peso = input.nextFloat();

			System.out.println("Digite a altura:");
			jogador.altura = input.nextFloat();

			System.out.println("Digite a letra inicial do nome:");
			jogador.inicialNome = input.next().charAt(0);

			jogadores[i] = jogador;
		}

		for (int i = 0; i < 3; i++) {
			if (jogadores[i].peso > maiorPeso) {
				maiorPeso = jogadores[i].peso;
			}

			if (jogadores[i].altura < menorAltura) {
				menorAltura = jogadores[i].altura;
				inicialNome = jogadores[i].inicialNome;
			}
		}
		Locale.setDefault(Locale.US);
		System.out.println("\\n\\n");
		System.out.println("A inicial do jogador mais baixo é: " + inicialNome);
		System.out.println("O jogador mais pesado tem: " + maiorPeso + " quilos");
	}
}

class Jogador {
	int num;
	float peso;
	float altura;
	char inicialNome;
}

// O programa basicamente coleta informações sobre jogadores e determina o jogador mais pesado e o jogador mais baixo com base nos dados inseridos pelo usuário.