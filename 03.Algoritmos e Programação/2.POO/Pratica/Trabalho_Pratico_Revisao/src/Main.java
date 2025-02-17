import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            Heroi heroi = jogo.criarPersonagem();
            jogo.iniciarAventura(heroi);

            System.out.println("\nDeseja jogar novamente? (S/N)");
            jogarNovamente = scanner.next().equalsIgnoreCase("S");
        }

    }
}