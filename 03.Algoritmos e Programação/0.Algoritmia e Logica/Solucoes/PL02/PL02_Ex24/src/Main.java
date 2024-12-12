import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 24. Ler N números, determinar o maior, o menor e a média dos N
        // números lidos.

        Scanner in = new Scanner(System.in);
        double soma = 0/*, maior = -9999999, menor = 99999999*/;
        double maior, menor;

        System.out.println("Quantos valores vai inserir?");
        int quant = in.nextInt();

        if (quant > 0) {
            System.out.println("Insira o 1º número");
            double n = in.nextDouble();
            maior = n;
            menor = n;
            soma += n;

            for (int i = 2; i <= quant; i++) {
                System.out.println("Insira o " + i + "º número");
                n = in.nextDouble();

                soma += n;

                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }
            double media = soma / quant;
            System.out.println("A média é: " + media);
            System.out.println("O maior é: " + maior);
            System.out.println("O menor é: " + menor);
        } else {
            System.out.println("Para calcular tem de inserir pelo menos um valor");
        }

    }
}