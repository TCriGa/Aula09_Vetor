import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /**
         * Faça um programa que receba 10 números inteiros, armazene-os e
         * verifique quais numeros são pares, e exiba para o usuário apenas os números
         * pares da lista.
         */

        try (Scanner par = new Scanner(System.in)) {
            int n = 10;

            int numero[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + "º número: ");
                numero[i] = par.nextInt();

            }
            par.nextLine();

            System.out.println("--------------------------------------------------------------");
            System.out.println("         Números Pares                              ");
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                if (numero[i] % 2 == 0) {

                    System.out.println("É um número par: " + numero[i]);

                }
            }

            System.out.println("--------------------------------------------------------------");
            System.out.println("         Números Impares                                      ");
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                if (numero[i] % 2 == 1) {
                    System.out.println("É um número impar: " + numero[i]);
                }
            }
        }

    }
}
