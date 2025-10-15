import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;
        double somaSalarios = 0;
        int contadorPessoas = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int mulheresSalario200 = 0;
        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';

        System.out.println("--- Análise de Dados de Pessoas ---");
        System.out.println("Para finalizar, digite uma idade negativa.");

        do {
            System.out.print("\nDigite a idade (negativa para finalizar): ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }
            
            do {
                System.out.print("Digite o sexo (M ou F): ");
                String sexoStr = scanner.next().toUpperCase();
                sexo = sexoStr.charAt(0);
            } while (sexo != 'M' && sexo != 'F');

            System.out.print("Digite o salário: R$");
            salario = scanner.nextDouble();

            somaSalarios += salario;
            contadorPessoas++;
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            if (sexo == 'F' && salario <= 200.0) {
                mulheresSalario200++;
            }
            
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

        } while (true);

        scanner.close();

        System.out.println("\n--- Relatório Final ---");

        if (contadorPessoas > 0) {
            double mediaSalarios = somaSalarios / contadorPessoas;
            System.out.printf("1. Média de salários do grupo: R$%.2f%n", mediaSalarios);
            System.out.println("2. Maior idade: " + maiorIdade + " anos");
            System.out.println("3. Menor idade: " + menorIdade + " anos");
            System.out.println("4. Mulheres com salário até R$200,00: " + mulheresSalario200);
            System.out.printf("5. Dados da pessoa com menor salário (R$%.2f): Idade=%d, Sexo=%c%n",
                                menorSalario, idadeMenorSalario, sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado válido foi inserido para a análise.");
        }
    }
}