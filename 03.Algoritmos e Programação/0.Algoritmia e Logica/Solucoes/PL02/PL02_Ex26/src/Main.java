import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 26. Escreva um programa que converta um valor binário para decimal.

        // 100101 => 1x2^5 + 0x2^4 + 0x2^3 + 1x2^2 + 0x2^1 + 1x2^0 = 32 + 4 + 1 = 37
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor binário");
        int bin = in.nextInt();
        int bin_guardar = bin;
        int dec = 0;
        int pos = 0;

        // 123 / 10 = 12
        // 123 % 10 = 3

        while (bin > 0) {
            int ultimoDigito = bin % 10;

            if (ultimoDigito != 0 && ultimoDigito != 1) {
                System.out.println("Valor introduzido é inválido");
                return;
            }

            dec += ultimoDigito * Math.pow(2, pos);
            pos++;
            bin /= 10;             //bin = bin / 10;
        }
        System.out.println(bin_guardar + "(2) = " + dec + "(10)");
    }
}