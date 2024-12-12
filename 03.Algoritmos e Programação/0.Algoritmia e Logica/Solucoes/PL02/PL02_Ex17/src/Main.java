import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 16. Dado uma série de 20 valores inteiros, faça um algoritmo que
        // calcule e escreva a média aritmética destes valores.

        // 17. Adapte o exercício anterior considerando que se a média obtida
        // for maior que 8 deverá ser atribuída 10 para a média.

        Scanner in = new Scanner(System.in);

        double quantidade = 20;
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Insira o " + i + "º número");
            // double numero = in.nextDouble();
            // soma += numero;
            soma += in.nextDouble();
        }

        double media = soma / quantidade;
        if (media <= 8) {
            System.out.println("A média é: " + media);
        } else {
            System.out.println("A média é 10");
        }

        /*if (soma / quantidade <= 8) {
            System.out.println("A média é: " + (soma / quantidade));
        } else {
            System.out.println("A média é 10");
        }*/
    }
}