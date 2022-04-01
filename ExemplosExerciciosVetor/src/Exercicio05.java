import java.util.Scanner;

public class Exercicio05 {
    /**
     * Faça um programa que permita que o usuário digite o nome de uma
     * banda musical e insira o nome de 3 músicas dessa banda, as músicas
     * deverão ser armazenadas e no final o programa deverá mostrar a
     * seguinte mensagem: NomeDaBanda
     * Musica1
     * Musica2
     * Musica3
     */

    public static void main(String[] args) {
        try (Scanner banda = new Scanner(System.in)) {
            System.out.println("Digite o nome da Banda: ");
            String nomeBanda = banda.nextLine();
            String musica[] = new String[3];

            for (int i = 0; i < musica.length; i++) {
                System.out.println("Digite o nome da " + (i + 1) + "ª música: ");
                musica[i] = banda.nextLine();
            }

            System.out.println();
            System.out.println("Nome da Banda: " + nomeBanda);

            for (int i = 0; i < musica.length; i++) {
                System.out.println();
                System.out.println("Nome da Musica " + (i + 1) + " é: " + musica[i]);
            }
        }

    }
}
