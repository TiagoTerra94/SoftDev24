import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 18. Dado um conjunto de n números inteiros inseridos pelo utilizador,
        // faça um algoritmo que calcule a média dos valores maiores que 4.

        Scanner in = new Scanner(System.in);

        double soma = 0;
        double cont = 0;

        int continuar;
        do {
            System.out.println("Insira um número");
            double numero = in.nextDouble();

            if (numero > 4) {
                soma += numero;
                cont++;
            }

            System.out.println("Pretende inserir novo número?\n1-Sim\n0-Não");
            continuar = in.nextInt();
        } while (continuar != 0);

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}