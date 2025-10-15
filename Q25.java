import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCliente;
        int tipoInvestimento;
        double valorInvestido;

        double totalInvestidoGeral = 0;
        double totalJurosPagos = 0;

        System.out.println("--- Cálculo de Rendimento Mensal ---");
        System.out.println("Códigos: 1=Poupança, 2=Plus, 3=Renda Fixa. (Código cliente <= 0 para finalizar)");

        do {
            System.out.print("\nCódigo do Cliente (<= 0 para finalizar): ");
            codigoCliente = scanner.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Tipo de Investimento (1, 2 ou 3): ");
            tipoInvestimento = scanner.nextInt();

            System.out.print("Valor Investido: R$");
            valorInvestido = scanner.nextDouble();
            
            double taxaMensal = 0.0;
            String nomeTipo = "";

            switch (tipoInvestimento) {
                case 1:
                    taxaMensal = 0.015; // 1.5%
                    nomeTipo = "Poupança";
                    break;
                case 2:
                    taxaMensal = 0.020; // 2.0%
                    nomeTipo = "Plus";
                    break;
                case 3:
                    taxaMensal = 0.040; // 4.0%
                    nomeTipo = "Renda Fixa";
                    break;
                default:
                    System.out.println("Tipo de investimento inválido. Transação ignorada.");
                    continue;
            }
            
            double rendimento = valorInvestido * taxaMensal;
            totalInvestidoGeral += valorInvestido;
            totalJurosPagos += rendimento;

            System.out.printf("Rendimento mensal (%s): R$%.2f%n", nomeTipo, rendimento);

        } while (true);

        scanner.close();

        System.out.println("\n--- Balanço Final ---");
        System.out.printf("Total Investido: R$%.2f%n", totalInvestidoGeral);
        System.out.printf("Total de Juros Pagos: R$%.2f%n", totalJurosPagos);
    }
}