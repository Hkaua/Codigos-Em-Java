import java.util.Stack;
import java.util.Scanner;

class Arvore {
    int x;
    Arvore dir;
    Arvore esq;

    public Arvore(int x) {
        this.x = x;
        dir = null;
        esq = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Arvore raiz = null;
        Arvore aux;
        Stack<Arvore> pilha = new Stack<>();
        int op;
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1 - Inserir na Árvore binária");
            System.out.println("2 - Exibir Árvore em ordem");
            System.out.println("3 - Exibir Árvore em pré-ordem");
            System.out.println("4 - Exibir Árvore em pós-ordem");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.println("Inserir na árvore binária...");
                System.out.print("Digite o valor: ");
                int valor = scanner.nextInt();
                Arvore novo = new Arvore(valor);
                System.out.println("Valor " + novo.x + " adicionado na árvore");

                if (raiz == null) {
                    raiz = novo;
                } else {
                    flag = false;
                    aux = raiz;
                    while (!flag) {
                        if (novo.x >= aux.x) {
                            if (aux.dir == null) {
                                aux.dir = novo;
                                flag = true;
                            } else {
                                aux = aux.dir;
                            }
                        } else {
                            if (aux.esq == null) {
                                aux.esq = novo;
                                flag = true;
                            } else {
                                aux = aux.esq;
                            }
                        }
                    }
                }
            } else if (op == 2) {
                if (raiz == null) {
                    System.out.println("Árvore vazia");
                } else {
                    System.out.println("Exibindo os valores na árvore em ordem");
                    aux = raiz;
                    pilha.clear();

                    do {
                        while (aux != null) {
                            pilha.push(aux);
                            aux = aux.esq;
                        }
                        if (!pilha.isEmpty()) {
                            aux = pilha.pop();
                            System.out.print(aux.x + " ");
                            aux = aux.dir;
                        }

                    } while (!pilha.isEmpty() || aux != null);

                    System.out.println();
                }
            } else if (op == 3) {
                System.out.println("Exibindo os valores na árvore em pré-ordem...");
                if (raiz == null) {
                    System.out.println("Árvore vazia");
                } else {
                    aux = raiz;
                    pilha.clear();
                    while (aux != null) {
                        pilha.push(aux);
                        System.out.print(aux.x + " ");
                        aux = aux.esq;
                    }

                    if (!pilha.isEmpty()) {
                        aux = pilha.pop();
                        aux = aux.dir;
                    }

                    System.out.println();
                }
            } else if (op == 4) {
                System.out.println("Exibindo os valores na árvore em pós-ordem...");
           
            } else if (op == 5) {
                System.out.println("Até mais, obrigado!");
            } else {
                System.out.println("Opção Inválida");
            }

        } while (op != 5);

        scanner.close();
    }
}

