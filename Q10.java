import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_DE_ENTRADAS = 10;

        int somaPares = 0;
        int somaPrimos = 0;
        int numero;

        System.out.println("--- Digite " + NUMERO_DE_ENTRADAS + " números ---");

        for (int i = 1; i <= NUMERO_DE_ENTRADAS; i++) {
            System.out.print("Digite o número #" + i + ": ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            }

            if (isPrime(numero)) {
                somaPrimos += numero;
            }
        }

        System.out.println("\n=============================================");
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);
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