import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoAcao = "";
        double precoCompra;
        double precoVenda;
        double lucroTotal = 0;
        int lucroMaior1000 = 0;
        int lucroMenor200 = 0;

        System.out.println("--- Análise de Lucro de Ações ---");
        System.out.println("Para finalizar, digite 'F' como tipo de ação.");

        do {
            System.out.print("\nDigite o tipo/código da ação ('F' para finalizar): ");
            tipoAcao = scanner.next();

            if (tipoAcao.equalsIgnoreCase("F")) {
                break; 
            }

            System.out.print("Digite o preço de compra: R$");
            precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda: R$");
            precoVenda = scanner.nextDouble();
            double lucroAcao = precoVenda - precoCompra;
            lucroTotal += lucroAcao;
            System.out.printf("-> Lucro da Ação %s: R$%.2f%n", tipoAcao, lucroAcao);

            if (lucroAcao > 1000.00) {
                lucroMaior1000++;
            } else if (lucroAcao < 200.00) {
                lucroMenor200++;
            }

        } while (true);

        scanner.close();

        System.out.println("\n--- Relatório de Lucros ---");
        
        if (lucroTotal != 0 || lucroMaior1000 > 0 || lucroMenor200 > 0) {
            System.out.printf("1. Lucro Total da Operação: R$%.2f%n", lucroTotal);
            System.out.println("2. Quantidade de ações com lucro > R$1000,00: " + lucroMaior1000);
            System.out.println("3. Quantidade de ações com lucro < R$200,00: " + lucroMenor200);
        } else {
            System.out.println("Nenhuma ação válida foi inserida para a análise.");
        }
    }
}