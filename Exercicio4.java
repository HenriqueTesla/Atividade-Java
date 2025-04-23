public class Exercicio4 {
    public static void main(String[] args) {
        int a = 0, b = 1, contador = 0;

        while (contador < 10) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }
    }
}