import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;

        System.out.println("Digite números positivos (número negativo para encerrar):");
        numero = sc.nextInt();

        while (numero >= 0) {
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println("Soma dos números positivos: " + soma);
        sc.close();
    }
}