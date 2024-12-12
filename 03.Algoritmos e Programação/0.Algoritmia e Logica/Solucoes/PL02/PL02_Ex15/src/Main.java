import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 14. Faça um programa que utilize a estrutura ENQUANTO
        // para ler 50 números e calcule e exiba a média aritmética deles.

        // 15. Refaça o exercício usando a estrutura PARA.

        Scanner in = new Scanner(System.in);
        int quantidade = 50;

        // int i = 1;
        double soma = 0;
        //while (i <= quantidade) {
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Insira um número");
            double numero = in.nextDouble();
            // soma = soma + numero;
            soma += numero;
            //i++;
        }

        double media = soma / quantidade;
        System.out.println("A média é: " + media);
    }
}