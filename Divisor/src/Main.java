import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, num3, divisor, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro n�mero: ");
        num3 = input.nextDouble();

        System.out.print("Digite o n�mero pelo qual deseja dividir: ");
        divisor = input.nextDouble();

        result = num1 + num2 + num3;

        if (divisor != 0) {
            result = result / divisor;
            System.out.printf("O resultado �: (%.2f + %.2f + %.2f) / %.2f � %.2f\\n", num1, num2, num3, divisor, result);
        } else {
            System.out.println("error: Divis�o por zero n�o � permitida.");
        }

        input.close();
    }
}