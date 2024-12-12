import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10 .Faça um programa que verifique se um número é ímpar.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número");
        int num = in.nextInt();

        /* if (num % 2 == 1) {
            System.out.println("O número " + num + " é impar");
        } else {
            System.out.println("O número " + num + " é par");
        }*/

        /* if (num % 2 != 0) {
            System.out.println("O número " + num + " é impar");
        } else {
            System.out.println("O número " + num + " é par");
        }*/

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
    }
}