import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: R$ ");
        double valorCarro = scanner.nextDouble();

        double valorVista = valorCarro * 0.80; 

        System.out.println("\n=============================================");
        System.out.printf("Opção à Vista (20%% de desconto): R$ %.2f\n", valorVista);
        System.out.println("=============================================");
        
        System.out.println("\nOpções de Financiamento:");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-15s |\n", "Parcelas", "Preço Final (R$)", "Valor Parcela (R$)");
        System.out.println("-----------------------------------------------------------------");

        for (int parcelas = 6; parcelas <= 60; parcelas += 6) {
            
            double percentualAcrescimo = parcelas / 2.0;
            
            double precoFinal = valorCarro * (1 + (percentualAcrescimo / 100.0));
            
            double valorParcela = precoFinal / parcelas;
            
            System.out.printf("| %-20d | %-15.2f | %-15.2f |\n", parcelas, precoFinal, valorParcela);
        }

        System.out.println("-----------------------------------------------------------------");
        
        scanner.close();
    }
}