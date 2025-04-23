import java.util.Scanner;

public class CalculadoraRendimento {

    public static double calcularSimples(double p, double r, int t) {
        return p * (1 + (r / 100) * t);
    }

    public static double calcularComposto(double p, double r, int t) {
        return p * Math.pow((1 + r / 100), t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("=== Calculadora de Rendimento ===");

            System.out.print("Digite o valor do investimento inicial (P): ");
            double p = sc.nextDouble();

            System.out.print("Digite a taxa de juros anual (r) em %: ");
            double r = sc.nextDouble();

            System.out.print("Digite o período do investimento (t) em anos: ");
            int t = sc.nextInt();

            System.out.print("Tipo de capitalização (simples/composta): ");
            sc.nextLine();
            String tipo = sc.nextLine().toLowerCase();

            double montante = 0;

            if (tipo.equals("simples")) {
                montante = calcularSimples(p, r, t);
            } else if (tipo.equals("composta")) {
                montante = calcularComposto(p, r, t);
            } else {
                System.out.println("Tipo de capitalização inválido.");
                continue;
            }

            System.out.printf("Montante final após %d anos: R$ %.2f%n", t, montante);

            System.out.print("Deseja realizar outro cálculo? (s/n): ");
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}