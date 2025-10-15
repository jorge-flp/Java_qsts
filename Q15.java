import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TOTAL_PESSOAS = 10;
        int simCount = 0;
        int naoCount = 0;
        int mulheresSim = 0;
        int homensNao = 0;
        int totalHomens = 0;

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            String sexo = scanner.next();
            String resposta = scanner.next();

            if (sexo.equalsIgnoreCase("M")) {
                totalHomens++;
                if (resposta.equalsIgnoreCase("N")) {
                    naoCount++;
                    homensNao++;
                } else if (resposta.equalsIgnoreCase("S")) {
                    simCount++;
                }
            } else if (sexo.equalsIgnoreCase("F")) {
                if (resposta.equalsIgnoreCase("S")) {
                    simCount++;
                    mulheresSim++;
                } else if (resposta.equalsIgnoreCase("N")) {
                    naoCount++;
                }
            }
        }
        
        double porcentagemHomensNao = (totalHomens > 0) ? ((double)homensNao / totalHomens) * 100 : 0.0;

        System.out.println(simCount);
        System.out.println(naoCount);
        System.out.println(mulheresSim);
        System.out.printf("%.2f%%%n", porcentagemHomensNao);

        scanner.close();
    }
}