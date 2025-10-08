public class Q2 {

    public static void main(String[] args) {
        double preco = 5.0;
        int ingressos = 120;
        double despesa = 200.0;
        
        double lucro, receita;
        double maiorLucro = 0.0;
        double melhorPreco = 0.0;
        int melhorQtd = 0;

        System.out.println("Preço\t\tIngressos\tLucro");

        for (double p = preco; p >= 1.0; p -= 0.5) {
            int qtd = ingressos + (int)(((preco - p) / 0.5) * 26);
            receita = p * qtd;
            lucro = receita - despesa;

            System.out.printf("R$ %.2f\t\t%d\t\tR$ %.2f%n", p, qtd, lucro);

            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                melhorPreco = p;
                melhorQtd = qtd;
            }
        }

        System.out.println("\nLucro máximo:");
        System.out.printf("R$ %.2f com %d Total de ingressos vendidos \n(lucro de R$ %.2f)%n\n",
                          melhorPreco, melhorQtd, maiorLucro);
    }
}


