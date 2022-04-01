import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Quantos nomes voce quer inserir?");
            int qtdNomes = leitor.nextInt();

            String[] listaNomes = new String[qtdNomes];

            for (int i = 0; i < listaNomes.length; i++) {
                System.out.println("Digite o nome da posição " + i);
                listaNomes[i] = leitor.next();
            }

            System.out.println("------------------------------------------------");
            System.out.println("                 LISTA NOMES                    ");
            System.out.println("------------------------------------------------");

            for (int i = 0; i < listaNomes.length; i++) {
                System.out.println("Nome posição " + i + " é: " + listaNomes[i]);
            }
        }

    }
}
