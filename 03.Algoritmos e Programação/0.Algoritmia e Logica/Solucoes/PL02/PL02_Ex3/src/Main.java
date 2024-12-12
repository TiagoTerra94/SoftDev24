import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 3. Crie um algoritmo que após ler dois números inteiros
        // apresenta a sua diferença.

        Scanner in = new Scanner(System.in);

        // sout
        System.out.println("Insira o primeiro número");
        int n1 = in.nextInt();

        System.out.println("Insira o segundo número");
        int n2 = in.nextInt();

        int dif = n1 - n2;
        System.out.println("A diferença é: " + dif);

        // System.out.println("A diferença é: " + (n1 - n2));
    }
}