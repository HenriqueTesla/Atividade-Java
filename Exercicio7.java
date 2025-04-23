import java.util.Scanner;
import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(20) + 1;
        int palpite, tentativas = 0;

        do {
            System.out.print("Adivinhe o número (1 a 20): ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
        sc.close();
    }
}