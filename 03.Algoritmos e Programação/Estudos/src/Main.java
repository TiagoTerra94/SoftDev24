import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();
    int counter = 0;
    int n = 0;
    int numRandom = 0;

    try {

        System.out.println("PROGRAMA 1: ");
        numRandom = rnd.nextInt(1, 11);

        System.out.println("Insira um numero de 1 a 10: ");
        n = in.nextInt();

        while (n < 0 || n > 10) {
            System.out.println("Numero inválido. Insira novamente: ");
            n = in.nextInt();
        }

    }catch (InputMismatchException e){
            e.getMessage();
    }


        do {

            if (n < numRandom) System.out.println("Tente um numero maior");
            if (n > numRandom) System.out.println("Tente um numero menor");
            n = in.nextInt();
            counter++;
        } while (n != numRandom);

        System.out.println("ACERTOU. Nº Tentativas: " + counter);



    }
}