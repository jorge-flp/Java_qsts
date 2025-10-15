import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_ESPECTADORES = 15;
        
        int totalOtimo = 0;
        int somaIdadeOtimo = 0;
        int contagemRegular = 0;
        int contagemBom = 0;

        for (int i = 0; i < TOTAL_ESPECTADORES; i++) {
            int idade = scanner.nextInt();
            int opiniao = scanner.nextInt();

            if (opiniao == 3) {
                totalOtimo++;
                somaIdadeOtimo += idade;
            } else if (opiniao == 1) {
                contagemRegular++;
            } else if (opiniao == 2) {
                contagemBom++;
            }
        }

        double mediaIdadeOtimo = (totalOtimo > 0) ? (double)somaIdadeOtimo / totalOtimo : 0.0;
        double porcentagemBom = ((double)contagemBom / TOTAL_ESPECTADORES) * 100;

        System.out.printf("%.2f%n", mediaIdadeOtimo);
        System.out.println(contagemRegular);
        System.out.printf("%.2f%%%n", porcentagemBom);

        scanner.close();
    }
}