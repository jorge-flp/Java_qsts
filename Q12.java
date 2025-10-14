import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_DE_ENTRADAS = 10;

        int countPrimos = 0;
        int numero;

        System.out.println("--- Digite " + NUMERO_DE_ENTRADAS + " números inteiros ---");

        for (int i = 1; i <= NUMERO_DE_ENTRADAS; i++) {
            System.out.print("Digite o número #" + i + ": ");
            numero = scanner.nextInt();

            if (isPrime(numero)) {
                countPrimos++;
            }
        }

        System.out.println("\n=============================================");
        System.out.println("Quantidade de números primos digitados: " + countPrimos);
        System.out.println("=============================================");

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
