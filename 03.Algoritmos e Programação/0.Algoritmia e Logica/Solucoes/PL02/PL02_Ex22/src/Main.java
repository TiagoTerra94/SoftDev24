import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 22. Crie um programa que permita converter um valor em Megabytes para Bytes.
        // 1MB = 1024KB
        // 1KB = 1024 Bytes

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor em MB");
        int mb = in.nextInt();

        int bytes = mb * 1024 * 1024;
        System.out.println(mb + "MB são " + bytes + " bytes");
    }
}