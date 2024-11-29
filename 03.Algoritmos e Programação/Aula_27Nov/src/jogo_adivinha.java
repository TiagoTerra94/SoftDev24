import java.util.Random;
import java.util.Scanner;

public class jogo_adivinha {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args){
        int option;

        do {
            System.out.println("Bem-vindo!\n" +
                    "1- Modo Fácil\n" +
                    "2- Modo InterMédio\n" +
                    "3- Modo Dificil\n" +
                    "0- Sair");

            option = in.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    PrimeiroModo();
                    break;
                case 2:
                    SegundoModo();
                    break;
                case 3:
                    TerceiroModo();
                    break;
            }
        }while(option != 0);
    }

    private static void TerceiroModo() {
        int n_random = rnd.nextInt(1,21);
        int contador = 0;

        System.out.println("Aplicação 3: Modo Dificil");

        System.out.println("Insira um número de 1 a 20: ");
        int n = in.nextInt();
        //System.out.println(n_random);

        //validaçao do numero
        if (n <= 0 || n > 20) {
            System.out.println("Número Inválido!");
            return;
        } else {
            contador++;
        }

        //processo para saber se é o premiado
        while(n != n_random){
            System.out.println("Insira um número de 1 a 20: ");
            n = in.nextInt();

            int diff = Math.abs(n_random - n);

            if(diff > 5){
                System.out.println("Está longe");
            } else if (diff >2 && diff < 5) {
                System.out.println("Nem perto nem longe! (Entre 2 a 5)");
            } else if (diff > 1){
                System.out.println("Está perto! (Entre 2)");
            }

            contador++;
        }

            System.out.println("ACERTOU! Tentativas gastas: " + contador);

    }

    private static void SegundoModo() {
        int n_random = rnd.nextInt(1,21);
        int contador = 0;

        System.out.println("Aplicação 2: Modo Médio");

        System.out.println("Insira um número de 1 a 20 para começar: ");
        int n = in.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Número Inválido!");
            return;
        } else {
            contador++;
        }

        while(contador < 3) {
                if (n < n_random) {
                    System.out.println("Tente um número maior!");
                    n = in.nextInt();
                } else if (n > n_random) {
                    System.out.println("Tente um número menor!");
                    n = in.nextInt();
                }

                contador++;
        }

        if(n == n_random) {
            System.out.println("ACERTOU! Tentativas gastas: " + contador);
        }else {
            System.out.println("ERROU! Gastou todas as suas tentativas!");
        }


    }

    private static void PrimeiroModo() {
        int n_random = rnd.nextInt(1,21);
        int contador = 0;

        System.out.println("Aplicação 1: Modo Fácil");

        System.out.println("Insira um número de 1 a 20 para começar: ");
        int n = in.nextInt();

        if (n <= 0 || n >20){
            System.out.println("Número Inválido!");
            return;
        } else {
            contador++;
        }

        do{
            if(n < n_random){
                System.out.println("Tente um número maior!");
                n = in.nextInt();
            } else if (n > n_random) {
                System.out.println("Tente um número menor!");
                n = in.nextInt();
            }

            contador++;

        } while( n != n_random);

        System.out.println("ACERTOU! Tentativas gastas: " + contador);
    }

}
