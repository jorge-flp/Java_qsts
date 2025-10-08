import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nGrupo " + i + ":");
            int[] valores = new int[4];

            // Lê os 4 valores A, B, C e D
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor " + (char)('A' + j) + ": ");
                valores[j] = entrada.nextInt();
            }

            
            System.out.print("Ordem lida: ");
            mostrar(valores);

            int[] crescente = valores.clone();
            Arrays.sort(crescente);
            System.out.print("Ordem crescente: ");
            mostrar(crescente);


            int[] decrescente = crescente.clone();
            for (int j = 0; j < decrescente.length / 2; j++) {
                int temp = decrescente[j];
                decrescente[j] = decrescente[decrescente.length - 1 - j];
                decrescente[decrescente.length - 1 - j] = temp;
            }
            System.out.print("Ordem decrescente: ");
            mostrar(decrescente);
        }

        entrada.close();
    }

    public static void mostrar(int[] vetor) {
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
