import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int countMaior50 = 0;

        double somaAltura10_20 = 0.0;
        int countAltura10_20 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = sc.nextDouble();
            
            if (idade > 50) {
                countMaior50++;
            }
            
            if (idade >= 10 && idade <= 20) {
                somaAltura10_20 += altura;
                countAltura10_20++;
            }
        }
        
        System.out.println("Número de pessoas com mais de 50 anos: " + countMaior50);
        
        if (countAltura10_20 > 0) {
            double mediaAltura10_20 = somaAltura10_20 / countAltura10_20;
            System.out.printf("Média das alturas das pessoas entre 10 e 20 anos: %.2f metros%n", mediaAltura10_20);
        } else {
            System.out.println("Não há pessoas entre 10 e 20 anos.");
        }
        
        sc.close(); 

    }
}
