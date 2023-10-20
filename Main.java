public class Main {
    // Método para calcular a soma dos valores do vetor de forma iterativa
    public static int somaIterativa(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }

    // Método para calcular a soma dos valores do vetor de forma recursiva
    public static int somaRecursiva(int[] vetor, int index) {
        if (index == vetor.length) {
            return 0;
        }
        return vetor[index] + somaRecursiva(vetor, index + 1);
    }

    public static void main(String[] args) {
        // Vetor de exemplo com valores definidos por você
        int[] vetor = {10, 20, 30, 40, 50};

        // Calcula a soma dos valores do vetor de forma iterativa
        int somaIterativaResult = somaIterativa(vetor);

        // Calcula a soma dos valores do vetor de forma recursiva
        int somaRecursivaResult = somaRecursiva(vetor, 0);

        // Exibe os resultados das somas no console
        System.out.println("Soma dos valores do vetor (iterativa): " + somaIterativaResult);
        System.out.println("Soma dos valores do vetor (recursiva): " + somaRecursivaResult);
    }
}