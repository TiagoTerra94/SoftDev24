import java.util.Random;
import java.util.Scanner;

public class jogoFosforos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String nome1, nome2;


        System.out.println("Nome do Jogador 1: ");
        nome1 = in.nextLine();
        System.out.println("Nome do Jogador 2: ");
        nome2 = in.nextLine();

        int fosforos = rnd.nextInt(1,4);


    }
}
