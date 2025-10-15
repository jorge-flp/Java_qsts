import java.util.Scanner;

public class Q23{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("--- MENU DE CÁLCULOS TRABALHISTAS ---");

        do {
            System.out.println("\n1. Novo Salário (Reajuste)");
            System.out.println("2. Férias (Salário + 1/3)");
            System.out.println("3. Décimo Terceiro (Proporcional)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Opção inválida. Digite um número.");
                scanner.next();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    calcularNovoSalario(scanner);
                    break;
                case 2:
                    calcularFerias(scanner);
                    break;
                case 3:
                    calcularDecimoTerceiro(scanner);
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado.");
                    break;
                default:
                    if (opcao != 4) {
                        System.out.println("Opção inválida! Escolha 1, 2, 3 ou 4.");
                    }
            }

        } while (opcao != 4);

        scanner.close();
    }

    private static void calcularNovoSalario(Scanner scanner) {
        System.out.println("\n--- NOVO SALÁRIO ---");
        System.out.print("Salário atual: R$");
        double salario = scanner.nextDouble();
        double reajuste;

        if (salario <= 300.0) {
            reajuste = 0.50; // 50%
        } else if (salario <= 600.0) {
            reajuste = 0.15; // 15%
        } else if (salario <= 900.0) {
            reajuste = 0.10; // 10%
        } else {
            reajuste = 0.05; // 5%
        }

        double novoSalario = salario * (1 + reajuste);
        System.out.printf("Novo Salário (Reajuste de %.0f%%): R$%.2f%n", reajuste * 100, novoSalario);
    }

    private static void calcularFerias(Scanner scanner) {
        System.out.println("\n--- CÁLCULO DE FÉRIAS ---");
        System.out.print("Salário mensal: R$");
        double salario = scanner.nextDouble();

        double valorFerias = salario + (salario / 3.0);
        System.out.printf("Valor Bruto a receber nas Férias (Salário + 1/3): R$%.2f%n", valorFerias);
    }

    private static void calcularDecimoTerceiro(Scanner scanner) {
        System.out.println("\n--- DÉCIMO TERCEIRO ---");
        System.out.print("Salário Bruto: R$");
        double salario = scanner.nextDouble();
        System.out.print("Meses trabalhados no ano (1 a 12): ");
        int meses = scanner.nextInt();

        if (meses < 0 || meses > 12) {
            System.out.println("Número de meses inválido. Use um valor entre 1 e 12.");
            return;
        }
        
        // 13º é proporcional aos meses (salário / 12 * meses)
        double decimoTerceiro = (salario / 12.0) * meses;
        System.out.printf("Valor do Décimo Terceiro (Proporcional a %d meses): R$%.2f%n", meses, decimoTerceiro);
    }
}
