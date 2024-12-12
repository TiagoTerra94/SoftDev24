import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 18. Dado um conjunto de n números inteiros inseridos pelo utilizador,
        // faça um algoritmo que calcule a média dos valores maiores que 4.

        Scanner in = new Scanner(System.in);

        double soma = 0;
        double cont = 0;

        // System.out.println("Insira um número. Insira 0 para parar");
        //double numero = in.nextDouble();

        double numero /*= 1*/;

        //while (numero != 0) {
        do {
            System.out.println("Insira um número. Insira 0 para parar");
            numero = in.nextDouble();

            if (numero > 4) {
                soma += numero;
                cont++;
            }
        } while (numero != 0);

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}