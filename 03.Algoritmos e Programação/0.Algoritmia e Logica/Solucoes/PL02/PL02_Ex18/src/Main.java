import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 18. Dado um conjunto de n números inteiros inseridos pelo utilizador,
        // faça um algoritmo que calcule a média dos valores maiores que 4.

        Scanner in = new Scanner(System.in);

        double soma = 0;
        double cont = 0;

        System.out.println("Quantos valores quer inserir?");
        int quant = in.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Insira o " + (i + 1) + "º número");
            double numero = in.nextDouble();

            if (numero > 4) {
                soma += numero;
                cont++;
            } /*else {
                System.out.println("O número inserido não é superior a 4");
            }*/
        }

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}