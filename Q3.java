import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int totalPessoas = 8;

        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        
        double percFaixa1 = (faixa1 * 100.0) / totalPessoas;
        double percFaixa5 = (faixa5 * 100.0) / totalPessoas;

        
        System.out.println("\n--- Resultado ---");
        System.out.println("Faixa etária 1 (até 15 anos): " + faixa1);
        System.out.println("Faixa etária 2 (16 a 30 anos): " + faixa2);
        System.out.println("Faixa etária 3 (31 a 45 anos): " + faixa3);
        System.out.println("Faixa etária 4 (46 a 60 anos): " + faixa4);
        System.out.println("Faixa etária 5 (acima de 60 anos): " + faixa5);

        System.out.printf("\n%% de pessoas até 15 anos: %.2f%%\n", percFaixa1);
        System.out.printf("%% de pessoas acima de 60 anos: %.2f%%\n", percFaixa5);

        input.close();
    }
}

