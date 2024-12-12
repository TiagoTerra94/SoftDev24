import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 9. Faça um programa que receba 4 valores e retorne o menor entre eles.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o 1º número");
        int n1 = in.nextInt();

        System.out.println("Insira o 2º número");
        int n2 = in.nextInt();

        System.out.println("Insira o 3º número");
        int n3 = in.nextInt();

        System.out.println("Insira o 4º número");
        int n4 = in.nextInt();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("O menor é o " + n1);
        } else if (n2 < n3 && n2 < n4) {
            System.out.println("O menor é o " + n2);
        } else if (n3 < n4) {
            System.out.println("O menor é o " + n3);
        } else {
            System.out.println("O menor é o " + n4);
        }

    }
}