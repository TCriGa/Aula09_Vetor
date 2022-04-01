import java.util.Scanner;

public class Exercicio02 {
    /**
     * Faça um programa de lista de chamada que armazene o nome de
     * 10 alunos e apresente a lista completa para o usuário
     */

    public static void main(String[] args) {
        try (Scanner chamada = new Scanner(System.in)) {
            int qdtNome = 10;
            String nome[] = new String[qdtNome];

            for (int i = 0; i < qdtNome; i++) {
                System.out.println("Digite " + (i + 1) + "º nome: ");
                nome[i] = chamada.next();

            }

            System.out.println("--------------------------------------------------------------");
            System.out.println("              Lista de Chamadas                               ");
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < qdtNome; i++) {
                System.out.println("O " + (i + 1) + "º nome do aluno é: " + nome[i]);
            }
        }

    }
}
