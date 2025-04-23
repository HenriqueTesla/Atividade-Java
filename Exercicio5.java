import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 100);

        System.out.println("Número validado: " + numero);
        sc.close();
    }
}