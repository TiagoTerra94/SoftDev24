import java.util.Random;
import java.util.Scanner;

public class jogoFosforos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String nome1, nome2;
        int option = 0;


        do{
        System.out.println("Bem-vindo ao Jogo dos Fosforos!\n" +
                "Deseja jogar contra um jogador ou contra o PC?\N" +
                "1- Contra um Jogador\n" +
                "2- Contra o PC");



        }(while option != 0);



        System.out.println("Nome do Jogador 1: ");
        nome1 = in.nextLine();
        System.out.println("Nome do Jogador 2: ");
        nome2 = in.nextLine();

        int fosforos = rnd.nextInt(1,4);


    }
}
