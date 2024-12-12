import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 24. Ler N números, determinar o maior, o menor e a média dos N
        // números lidos.

        Scanner in = new Scanner(System.in);
        double soma = 0/*, maior = -9999999, menor = 99999999*/;
        double maior = 0, menor = 0;

        //System.out.println("Quantos valores vai inserir?");
        //int quant = in.nextInt();

        int continuar, quant = 0;

        do {
            quant++;
            System.out.println("Insira o " + quant + "º número");
            double n = in.nextDouble();

            if (quant == 1) {
                maior = n;
                menor = n;
                soma += n;
            } else {
                soma += n;

                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }

            System.out.println("Pretende inserir novo valor?    1-Sim    0-Não");
            continuar = in.nextInt();
        } while (continuar != 0);

        if (quant > 0) {
            double media = soma / quant;
            System.out.println("A média é: " + media);
            System.out.println("O maior é: " + maior);
            System.out.println("O menor é: " + menor);
        } else {
            System.out.println("Para calcular tem de inserir pelo menos um valor");
        }

    }
}