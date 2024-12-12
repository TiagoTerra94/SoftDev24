import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 16. Dado uma série de 20 valores inteiros, faça um algoritmo que
        // calcule e escreva a média aritmética destes valores.

        Scanner in = new Scanner(System.in);

        double quantidade = 20;
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Insira o " + i + "º número");
            // double numero = in.nextDouble();
            // soma += numero;
            soma += in.nextDouble();
        }

        // double media = soma / quantidade;
        //System.out.println("A média é: " + media);
        System.out.println("A média é: " + (soma / quantidade));
    }
}