import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        String senha;

        System.out.print("Digite a senha: ");
        senha = sc.nextLine();

        while (!senha.equals(SENHA_CORRETA)) {
            System.out.println("Senha incorreta, tente novamente.");
            senha = sc.nextLine();
        }

        System.out.println("Acesso concedido.");
        sc.close();
    }
}