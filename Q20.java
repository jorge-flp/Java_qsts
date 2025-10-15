import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE CÁLCULO DE MÉDIAS ---");
            System.out.println("1. Média Aritmética (2 notas)");
            System.out.println("2. Média Ponderada (3 notas e pesos)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.next();
                opcao = 0;            
            }

            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("\nPrograma encerrado. Até mais!");
                    break;
                default:
                    if (opcao != 3) { 
                        System.out.println("\nOpção inválida! Escolha 1, 2 ou 3.");
                    }
                    break;
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static void calcularMediaAritmetica(Scanner scanner) {
        System.out.println("\n--- Média Aritmética ---");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("A Média Aritmética é: %.2f%n", media);
    }

    private static void calcularMediaPonderada(Scanner scanner) {
        System.out.println("\n--- Média Ponderada ---");
        
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double p2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double p3 = scanner.nextDouble();

        double somaNotasPonderadas = (n1 * p1) + (n2 * p2) + (n3 * p3);
        double somaPesos = p1 + p2 + p3;
        
        if (somaPesos > 0) {
            double media = somaNotasPonderadas / somaPesos;
            System.out.printf("A Média Ponderada é: %.2f%n", media);
        } else {
            System.out.println("Erro: A soma dos pesos deve ser maior que zero.");
        }
    }
}