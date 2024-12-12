import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 6. Faça um programa que receba o valor do quilo de um produto e a
        // quantidade de quilos do produto consumida
        // calculando o valor final a ser pago.

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o preço de 1kg");
        double preco = in.nextDouble();

        System.out.println("Quantos kg comprou?");
        double quantidade = in.nextDouble();

        double precoTotal = preco * quantidade;

        System.out.println("Preço total: " + precoTotal);

    }
}