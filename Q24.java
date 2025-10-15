
import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        boolean primeiroValorLido = false;

        System.out.println("--- Maior e Menor Valor Positivo ---");
        System.out.println("Digite valores inteiros e positivos (0 para finalizar):");

        do {
            System.out.print("Valor: ");
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                continue;
            }
            
            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Valor negativo ignorado.");
                continue;
            }

            if (!primeiroValorLido) {
                maior = valor;
                menor = valor;
                primeiroValorLido = true;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }

        } while (true);

        scanner.close();

        System.out.println("\n--- Resultado ---");

        if (primeiroValorLido) {
            System.out.println("Maior valor positivo digitado: " + maior);
            System.out.println("Menor valor positivo digitado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }
    }
}