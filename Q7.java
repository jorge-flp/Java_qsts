import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMaior50 = 0;     
        double somaAltura10_20 = 0.0;   
        int countAltura10_20 = 0;    
        int countPesoMenor40 = 0;     
        
        final int NUMERO_PESSOAS = 5;    

        System.out.println("--- Análise de Dados de " + NUMERO_PESSOAS + " Pessoas ---");

        for (int i = 1; i <= NUMERO_PESSOAS; i++) {
            System.out.println("\n--- Dados da Pessoa #" + i + " ---");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();


            if (idade > 50) {
                countMaior50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAltura10_20 += altura;
                countAltura10_20++;
            }

            if (peso < 40.0) {
                countPesoMenor40++;
            }
        }


        double mediaAltura = 0.0;
        if (countAltura10_20 > 0) {
            mediaAltura = somaAltura10_20 / countAltura10_20;
        }

        double porcentagemPesoMenor40 = (double) countPesoMenor40 / NUMERO_PESSOAS * 100.0;
        
        System.out.println("\n=============================================");
        System.out.println("            RESULTADO DA ANÁLISE             ");
        System.out.println("=============================================");

        System.out.println("a) Pessoas com idade superior a 50 anos: " + countMaior50);

        if (countAltura10_20 > 0) {
            System.out.printf("b) Média das alturas (10 a 20 anos): %.2f metros\n", mediaAltura);
        } else {
            System.out.println("b) Não houve pessoas com idade entre 10 e 20 anos para calcular a média de altura.");
        }

        System.out.printf("c) Porcentagem de pessoas com peso < 40 kg: %.2f%%\n", porcentagemPesoMenor40);
        
        System.out.println("=============================================");

        scanner.close();
    }
}