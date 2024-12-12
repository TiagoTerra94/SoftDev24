import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 21. Crie um programa que permita converter um valor em bytes para bits.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o total de bytes");
        int bytes = in.nextInt();

        int bits = bytes * 8;

        System.out.println(bytes + "B são " + bits + " bits");

    }
}