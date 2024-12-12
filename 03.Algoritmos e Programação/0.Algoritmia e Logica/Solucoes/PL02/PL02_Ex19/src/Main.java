import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 19. Crie um programa que permita converter um valor em horas para
        // segundos e mostre o valor em segundos.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um total de horas");
        int horas = in.nextInt();

        int segundos = horas * 3600;

        System.out.println(horas + "h são " + segundos + " segundos");
    }
}