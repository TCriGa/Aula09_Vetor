import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Quantos números você quer inserir?");
            int qtdNumeros = leitor.nextInt();

            int listaNumeros[] = new int[qtdNumeros];

            for (int i = 0; i < listaNumeros.length; i++) {
                System.out.println("Insira o valor que será inserido no vetor na posição" + i);
                int numero = leitor.nextInt();
                listaNumeros[i] = numero;

            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("              Lista Números                                   ");
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < listaNumeros.length; i++) {

                System.out.println("Posição " + i + " - valor:" + listaNumeros[i]);
            }
        }
    }
}
