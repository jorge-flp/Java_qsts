import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPeso1_10 = 0, somaPeso11_20 = 0, somaPeso21_30 = 0, somaPeso31_mais = 0;
        int contagem1_10 = 0, contagem11_20 = 0, contagem21_30 = 0, contagem31_mais = 0;

        for (int i = 0; i < 15; i++) {
            int idade = scanner.nextInt();
            double peso = scanner.nextDouble();

            if (idade >= 1 && idade <= 10) {
                somaPeso1_10 += peso;
                contagem1_10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11_20 += peso;
                contagem11_20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21_30 += peso;
                contagem21_30++;
            } else if (idade >= 31) {
                somaPeso31_mais += peso;
                contagem31_mais++;
            }
        }

        double media1_10 = (contagem1_10 > 0) ? somaPeso1_10 / contagem1_10 : 0.0;
        double media11_20 = (contagem11_20 > 0) ? somaPeso11_20 / contagem11_20 : 0.0;
        double media21_30 = (contagem21_30 > 0) ? somaPeso21_30 / contagem21_30 : 0.0;
        double media31_mais = (contagem31_mais > 0) ? somaPeso31_mais / contagem31_mais : 0.0;

        System.out.printf("Média de 1 a 10 anos: %.2f%n", media1_10);
        System.out.printf("Média de 11 a 20 anos: %.2f%n", media11_20);
        System.out.printf("Média de 21 a 30 anos: %.2f%n", media21_30);
        System.out.printf("Média acima de 31 anos: %.2f%n", media31_mais);

        scanner.close();
    }
}