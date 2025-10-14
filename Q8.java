import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_PESSOAS = 6;

        int countIdadePeso = 0;
        int somaIdadeAlturaBaixa = 0;
        int countAlturaBaixa = 0;
        int countOlhosAzuis = 0;
        int countRuivasSemAzul = 0;

        System.out.println("--- Início da Análise Demográfica de " + NUMERO_PESSOAS + " Pessoas ---");

        for (int i = 1; i <= NUMERO_PESSOAS; i++) {
            System.out.println("\n===== DADOS DA PESSOA #" + i + " =====");

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            System.out.print("Cor dos Olhos (A=Azul, P=Preto, V=Verde, C=Castanho): ");
            String olhos = scanner.next().toUpperCase();

            System.out.print("Cor dos Cabelos (P=Preto, C=Castanho, L=Louro, R=Ruivo): ");
            String cabelo = scanner.next().toUpperCase();
            
            if (idade > 50 && peso < 60.0) {
                countIdadePeso++;
            }

            if (altura < 1.50) {
                somaIdadeAlturaBaixa += idade;
                countAlturaBaixa++;
            }

            boolean temOlhosAzuis = olhos.equals("A");

            if (temOlhosAzuis) {
                countOlhosAzuis++;
            }

            if (cabelo.equals("R") && !temOlhosAzuis) {
                countRuivasSemAzul++;
            }
        }
        
        double mediaIdadeAlturaBaixa = 0.0;
        if (countAlturaBaixa > 0) {
            mediaIdadeAlturaBaixa = (double) somaIdadeAlturaBaixa / countAlturaBaixa;
        }

        double porcentagemOlhosAzuis = (double) countOlhosAzuis / NUMERO_PESSOAS * 100.0;

        
        System.out.println("\n=============================================");
        System.out.println("            RESUMO DEMOGRÁFICO               ");
        System.out.println("=============================================");

        System.out.println("1) Pessoas com idade > 50 E peso < 60 kg: " + countIdadePeso);

        if (countAlturaBaixa > 0) {
            System.out.printf("2) Média das idades (Altura < 1,50 m): %.2f anos\n", mediaIdadeAlturaBaixa);
        } else {
            System.out.println("2) Não houve pessoas com altura < 1,50 m para calcular a média de idade.");
        }

        System.out.printf("3) Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);

        System.out.println("4) Pessoas ruivas que NÃO possuem olhos azuis: " + countRuivasSemAzul);

        System.out.println("=============================================");

        scanner.close();
    }
}