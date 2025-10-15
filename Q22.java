import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura;
        double somaAlturas = 0;
        int contadorPessoas = 0;

        System.out.println("--- Média de Alturas (Pessoas > 50) ---");
        System.out.println("Digite a idade (<= 0 para finalizar):");

        do {
            System.out.print("Idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro para a idade.");
                scanner.next(); 
                continue;
            }

            if (idade <= 0) {
                break;
            }

            System.out.print("Altura (em metros): ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
            } else {
                System.out.println("Entrada inválida. Digite um número para a altura.");
                scanner.next();
                continue;
            }
            
            if (idade > 50) {
                somaAlturas += altura;
                contadorPessoas++;
            }

        } while (true);

        scanner.close();

        System.out.println("\n--- Resultado ---");

        if (contadorPessoas > 0) {
            double media = somaAlturas / contadorPessoas;
            System.out.println("Total de pessoas > 50 anos: " + contadorPessoas);
            System.out.printf("Média das alturas: %.2f metros%n", media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }
    }
}