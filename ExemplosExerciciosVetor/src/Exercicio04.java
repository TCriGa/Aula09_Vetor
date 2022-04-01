import java.util.Scanner;

public class Exercicio04 {
    /**
     * Faça um programa que receba de lista de compras sendo que o usuário irá
     * inserir a quantidade de itens que quer adicionar na lista de compras e após
     * inserir a quantidade o programa deverá permitir que o suário insira os
     * produtos nessa lista.
     * Exiba a lista completa para o usuário.
     */
    public static void main(String[] args) {
        try (Scanner compras = new Scanner(System.in)) {
            System.out.println("Digite o número de itens da sua lista de compras: ");
            int listaDeCompras = compras.nextInt();

            String[] itensLista = new String[listaDeCompras];

            compras.nextLine();

            for (int i = 0; i < itensLista.length; i++) {
                System.out.println("Item " + (i + 1) + " --> " + " Insira um produto: ");
                itensLista[i] = compras.nextLine();
            }

            System.out.println("--------------------------------------------------------------");
            System.out.println("              LISTA DE COMPRAS:                               ");
            System.out.println("--------------------------------------------------------------");

            for (int i = 0; i < itensLista.length; i++) {
                System.out.println("Item " + (i + 1) + " -> Produto:  " + itensLista[i]);
            }
        }

    }
}
