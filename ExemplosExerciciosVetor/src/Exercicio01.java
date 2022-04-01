import java.util.Scanner;

/**
 * Faça um programa que leia 5 valores inteiros, armazene-os em um
 * vetor, calcule e apresente a soma destes valores
 */

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner vetor = new Scanner(System.in)) {
            int soma = 0;
            int n = 5;

            int VetorSoma[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + "º número: ");
                VetorSoma[i] = vetor.nextInt();
                soma = soma + VetorSoma[i];
            }

            System.out.printf("\nSoma = %d\n", soma);
        }
    }

}
