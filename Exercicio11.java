public class Exercicio11 {
    public static void main(String[] args) {
        int[] vetor = {3, 5, 8, 2, 9, 4, 7, 1, 6, 10};
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}