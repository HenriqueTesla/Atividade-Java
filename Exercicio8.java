import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, soma = 0;
        int count = 0;
        char continuar;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                count++;
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        if (count > 0) {
            System.out.println("Média das notas: " + (soma / count));
        } else {
            System.out.println("Nenhuma nota válida inserida.");
        }

        sc.close();
    }
}