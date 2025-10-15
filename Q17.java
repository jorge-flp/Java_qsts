import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal = 0;
        int audiencia;
        int totalAudiencia = 0;
        int aud4 = 0;
        int aud5 = 0;
        int aud7 = 0;
        int aud12 = 0;

        System.out.println("--- Cálculo de Porcentagem de Audiência ---");
        System.out.println("Canais válidos: 4, 5, 7, 12.");
        System.out.println("Para finalizar, digite 0 como número do canal.");

        do {
            System.out.print("\nDigite o número do canal (4, 5, 7, 12 ou 0 para finalizar): ");
            canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.print("Digite a quantidade de audiência para o Canal " + canal + ": ");
                audiencia = scanner.nextInt();
                
                totalAudiencia += audiencia;

                switch (canal) {
                    case 4:
                        aud4 += audiencia;
                        break;
                    case 5:
                        aud5 += audiencia;
                        break;
                    case 7:
                        aud7 += audiencia;
                        break;
                    case 12:
                        aud12 += audiencia;
                        break;
                }
            } else {
                System.out.println("Canal inválido! Digite 4, 5, 7, 12 ou 0 para finalizar.");
            }

        } while (true); 

        scanner.close();

        System.out.println("\n--- Resultado da Audiência ---");
        
        if (totalAudiencia > 0) {
            double perc4 = (double) aud4 * 100 / totalAudiencia;
            double perc5 = (double) aud5 * 100 / totalAudiencia;
            double perc7 = (double) aud7 * 100 / totalAudiencia;
            double perc12 = (double) aud12 * 100 / totalAudiencia;

            System.out.println("Total de audiência registrada: " + totalAudiencia);
            System.out.printf("Canal 4: %d espectadores (%.2f%%)%n", aud4, perc4);
            System.out.printf("Canal 5: %d espectadores (%.2f%%)%n", aud5, perc5);
            System.out.printf("Canal 7: %d espectadores (%.2f%%)%n", aud7, perc7);
            System.out.printf("Canal 12: %d espectadores (%.2f%%)%n", aud12, perc12);
        } else {
            System.out.println("Nenhuma audiência válida foi registrada.");
        }
    }
}