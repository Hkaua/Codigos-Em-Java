import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, num3, divisor, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        System.out.print("Digite o número pelo qual deseja dividir: ");
        divisor = input.nextDouble();

        result = num1 + num2 + num3;

        if (divisor != 0) {
            result = result / divisor;
            System.out.printf("O resultado é: (%.2f + %.2f + %.2f) / %.2f é %.2f\\n", num1, num2, num3, divisor, result);
        } else {
            System.out.println("error: Divisão por zero não é permitida.");
        }

        input.close();
    }
}