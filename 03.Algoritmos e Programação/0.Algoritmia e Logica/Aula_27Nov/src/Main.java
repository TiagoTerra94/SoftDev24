import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int n_random = rnd.nextInt(1,51);
        int contador = 0;

        System.out.println("Insira um número de 1 a 50 para começar: ");
        int n = in.nextInt();

        if (n <= 0 || n >50){
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