public class Exemplo01 {

    public static void main(String[] args) {
        int vetorNumero[] = new int[5];

        vetorNumero[0] = 87; // vetor no indice 0 terá valor 87
        vetorNumero[4] = 6; // vetor no indice 4 terá valor 6

        for (int i = 0; i < vetorNumero.length; i++) {
            System.out.println("Índice: " + i + " - valor: " + vetorNumero[i] + ".");
        }

        System.out.println();

        String[] listaAlunos = new String[3];

        listaAlunos[0] = "Rodrigo";
        listaAlunos[1] = "Thay";
        listaAlunos[2] = "Leandro";

        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("Aluno:" + listaAlunos[i]);
        }

    }
}
