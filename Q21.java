import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votosCandidatos = new int[4]; 
        int votosNulos = 0; 
        int votosBrancos = 0; 
        int totalVotosValidos = 0;
        int totalVotos = 0;
        int voto;
        
        System.out.println("--- URNA ELETRÔNICA SIMULADA ---");
        System.out.println("Códigos:");
        System.out.println("1, 2, 3, 4: Candidatos");
        System.out.println("5: Voto Nulo");
        System.out.println("6: Voto em Branco");
        System.out.println("0: Finalizar a votação");

        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break; 
            }
            
            totalVotos++; 

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                
                    votosCandidatos[voto - 1]++;
                    totalVotosValidos++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto inválido. Por favor, digite um código de 0 a 6.");
                    totalVotos--; 
                    break;
            }

        } while (voto != 0);

        scanner.close();

        System.out.println("\n--- RESULTADO DA VOTAÇÃO ---");

        if (totalVotos > 0) {
            System.out.println("Votos totais lidos: " + totalVotos);
            System.out.println("Votos válidos (Candidatos): " + totalVotosValidos);
            System.out.println("Votos Nulos: " + votosNulos);
            System.out.println("Votos em Branco: " + votosBrancos);

            System.out.println("\nTotal de Votos por Candidato:");
            for (int i = 0; i < votosCandidatos.length; i++) {
                System.out.printf("  Candidato %d: %d votos%n", (i + 1), votosCandidatos[i]);
            }

            double percNulos = (double) votosNulos * 100 / totalVotos;
            double percBrancos = (double) votosBrancos * 100 / totalVotos;

            System.out.println("\n--- PORCENTAGENS ---");
            System.out.printf("Porcentagem de Nulos sobre o total: %.2f%%%n", percNulos);
            System.out.printf("Porcentagem de Brancos sobre o total: %.2f%%%n", percBrancos);

        } else {
            System.out.println("A votação foi encerrada sem o registro de votos.");
        }
    }
}