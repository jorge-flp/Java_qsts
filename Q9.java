import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_PESSOAS = 10;

        int somaIdades = 0;
        int countPesoAltura = 0;
        int countFaixaIdadeAlto = 0; 
        int countAlto = 0;           

        System.out.println("--- Início da Coleta de Dados de " + NUMERO_PESSOAS + " Pessoas ---");

        for (int i = 1; i <= NUMERO_PESSOAS; i++) {
            System.out.println("\n===== DADOS DA PESSOA #" + i + " =====");

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            somaIdades += idade;

            if (peso > 90.0 && altura < 1.50) {
                countPesoAltura++;
            }

            if (altura > 1.90) {
                countAlto++;
                
                if (idade >= 10 && idade <= 30) {
                    countFaixaIdadeAlto++;
                }
            }
        }
        
        double mediaIdades = (double) somaIdades / NUMERO_PESSOAS;

        double porcentagemFaixaIdadeAlto = 0.0;
        if (countAlto > 0) {
            porcentagemFaixaIdadeAlto = (double) countFaixaIdadeAlto / countAlto * 100.0;
        }

        
        System.out.println("\n=============================================");
        System.out.println("            ESTATÍSTICAS DO GRUPO            ");
        System.out.println("=============================================");

        System.out.printf("a) Média das idades das dez pessoas: %.2f anos\n", mediaIdades);

        System.out.println("b) Pessoas com peso > 90 kg E altura < 1,50 m: " + countPesoAltura);

        if (countAlto > 0) {
            System.out.printf("c) %% de pessoas (10-30 anos) ENTRE as que medem > 1,90 m: %.2f%%\n", porcentagemFaixaIdadeAlto);
        } else {
            System.out.println("c) Não houve pessoas com altura superior a 1,90 m para calcular a porcentagem.");
        }

        System.out.println("=============================================");

        scanner.close();
    }
}