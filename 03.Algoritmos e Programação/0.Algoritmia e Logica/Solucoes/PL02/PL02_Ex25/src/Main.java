import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 25. Elabore uma função que dado um ano verifique se ele é ou não bissexto.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um ano");
        int ano = in.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }
}