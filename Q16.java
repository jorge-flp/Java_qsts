import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int contadorIdades = 0;

        System.out.println("--- Calculadora de Média de Idades ---");
        System.out.println("Digite as idades uma por uma.");
        System.out.println("Para finalizar e calcular a média, digite 0.");

        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade != 0) {
                somaIdades += idade;
                contadorIdades++;
            }

        } while (idade != 0);

        scanner.close();

        if (contadorIdades > 0) {
            double media = (double) somaIdades / contadorIdades;

            System.out.println("\n--- Resultado ---");
            System.out.println("Total de idades lidas: " + contadorIdades);
            System.out.println("Soma das idades: " + somaIdades);
            System.out.printf("A média das idades é: %.2f%n", media);
        } else {
            System.out.println("\nNenhuma idade foi digitada (além do 0 para finalizar). A média não pode ser calculada.");
        }
    }
}