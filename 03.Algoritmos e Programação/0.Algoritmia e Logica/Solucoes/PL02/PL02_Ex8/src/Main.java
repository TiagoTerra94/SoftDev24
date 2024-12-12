import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 8. Faça um programa que receba 2 valores e retorne o maior entre eles.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número");
        int n1 = in.nextInt();

        System.out.println("Insira outro número");
        int n2 = in.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior: " + n1);
        } else if (n1 < n2) {
            System.out.println("O segundo número é maior: " + n2);
        } else {
            System.out.println("Os número são iguais: " + n1);
        }
    }
}