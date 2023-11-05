
import java.util.Scanner;

public class Main {
    static final int MAX_ALUNOS = 50;
    static Aluno[] alunos = new Aluno[MAX_ALUNOS];
    static int totalAlunos = 0;

    static class Aluno {
        String nome, sobrenome, curso, email, cpf, ra;
        boolean ativo;

        Aluno(String nome, String sobrenome, String curso, String email, String cpf, String ra) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.curso = curso;
            this.email = email;
            this.cpf = cpf;
            this.ra = ra;
            this.ativo = true;
        }
    }

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("SISTEMA CADASTRO");
            System.out.println("1- cadastrar aluno");
            System.out.println("2- remover aluno");
            System.out.println("3- pesquisar aluno");
            System.out.println("4- listar alunos");
            System.out.println("0- sair");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    remover(scanner);
                    break;
                case 3:
                    pesquisar(scanner);
                    break;
                case 4:
                    listar();
                    break;
            }
        } while (op != 0);
        scanner.close();
    }

    static void cadastrar(Scanner scanner) {
        int op;
        do {
            System.out.println("CADASTRAR NOVO ALUNO");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.print("RA: ");
            String ra = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Curso: ");
            String curso = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("1 - continuar");
            System.out.println("0 - sair");
            for (int i = 0; i < MAX_ALUNOS; ++i) {
                if (alunos[i] == null) {
                    alunos[i] = new Aluno(nome, sobrenome, curso, email, cpf, ra);
                    totalAlunos++;
                    break;
                }
            }
            op = scanner.nextInt();
            scanner.nextLine();
        } while (op != 0);
    }

    static void remover(Scanner scanner) {
        // Implementar função de remover aluno
    }

    static void pesquisar(Scanner scanner) {
        System.out.print("Digite o nome do aluno para pesquisar: ");
        String nome = scanner.nextLine();
        for (int i = 0; i < MAX_ALUNOS; ++i) {
            if (alunos[i] != null && alunos[i].nome.contains(nome)) {
                System.out.println();
                System.out.println("Nome: " + alunos[i].nome);
                System.out.println("Sobrenome: " + alunos[i].sobrenome);
                System.out.println("RA: " + alunos[i].ra);
                System.out.println("Email: " + alunos[i].email);
                System.out.println("Curso: " + alunos[i].curso);
                System.out.println("CPF: " + alunos[i].cpf);
                System.out.println("-------------------------");
            }
        }
    }

    static void listar() {
        System.out.println("LISTA DE ALUNOS");
        for (int i = 0; i < MAX_ALUNOS; i++) {
            if (alunos[i] != null && alunos[i].ativo) {
                System.out.println("---------------------------");
                System.out.println();
                System.out.println("Nome: " + alunos[i].nome);
                System.out.println("Sobrenome: " + alunos[i].sobrenome);
                System.out.println("RA: " + alunos[i].ra);
                System.out.println("Email: " + alunos[i].email);
                System.out.println("Curso: " + alunos[i].curso);
                System.out.println("CPF: " + alunos[i].cpf);
                System.out.println("-------------------------");
            }
        }
    }
}
