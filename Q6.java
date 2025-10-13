import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double totalVista = 0.0;
    double totalPrazo = 0.0;
    double totalGeral = 0.0;

    final int NUMERO_TRASACOES = 15;

    System.out.println("--- Sistema de Cálculo de Transações da Loja ---");
    System.out.println("Códigos: 'V' (À Vista) | 'P' (A Prazo)");

    for (int i = 1; i <= NUMERO_TRASACOES; i++){
        System.out.println("\n--- Transação #" + i + " ---");
   }

   String codigo;
            do {
                System.out.print("Digite o código da transação ('V' ou 'P'): ");
                codigo = sc.next().toUpperCase();
                if (!codigo.equals("V") && !codigo.equals("P")) {
                    System.out.println("Código inválido. Por favor, digite 'V' ou 'P'.");
                }
            } while (!codigo.equals("V") && !codigo.equals("P"));

            double valor;
             do {
                System.out.print("Digite o valor da transação: R$ ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Valor inválido. Digite um número para o valor.");
                    sc.next(); 
                    System.out.print("Digite o valor da transação: R$ ");
                }
                valor = sc.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor deve ser positivo.");
                }
            } while (valor <= 0);

            if (codigo.equals("V")){
              totalVista += valor;
              System.out.println("Transação registrada como à vista.");
             }else if(codigo.equals("P")){
              totalPrazo += valor;
              System.out.println("Transação regidtrada como a prazo");
             
            totalGeral += valor;
            }

            System.out.println("\n=================================");
            System.out.println("   RESUMO FINAL DAS TRANSAÇÕES   ");
            System.out.println("=================================");
            
            double primeiraPrestacao = 0.0;
        if (totalPrazo > 0) {
            primeiraPrestacao = totalPrazo / 3.0; 
        }

        System.out.printf("a) Valor total das compras À VISTA: R$ %.2f\n", totalVista);
        System.out.printf("b) Valor total das compras A PRAZO: R$ %.2f\n", totalPrazo);
        System.out.printf("c) Valor TOTAL das compras efetuadas: R$ %.2f\n", totalGeral);
        System.out.println("---------------------------------------------");
        System.out.printf("d) Valor da 1ª PRESTAÇÃO (em 3x): R$ %.2f\n", primeiraPrestacao);
        System.out.println("=============================================");

        sc.close();
    }
}
