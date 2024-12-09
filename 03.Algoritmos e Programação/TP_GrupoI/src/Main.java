import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {
        int op = 1;
        do{
            System.out.println("Bem-vindo ao Euromilhões\n" +
                    "MENU\n" +
                    "1- Simular Sorteio\n" +
                    "2- Criar Boletim Manual\n" +
                    "3- Criar Boletim Automático\n" +
                    "4- Simular e tentativas\n" +
                    "0- Sair");

            op = in.nextInt();

            switch (op){
                case 0:
                    break;
                case 1:
                    simularSorteio1();
                    break;
                case 2:
                    criarBoletim1();
                    break;
                case 3:
                    criarBoletim2();
                    break;
                case 4:
                    simularSorteio2();
                    break;

            }

        }while(op!=0);


        }

    private static void simularSorteio2() {
    }

    private static void criarBoletim2() {
    }

    private static void criarBoletim1() {
    }

    private static void simularSorteio1() {
        ArrayList<Integer> chaveNums = new ArrayList<>();
        ArrayList<Integer> chaveStars = new ArrayList<>();
        int nums = 51;

        System.out.println("Chave:");

        //sortear numeros
        System.out.print("Numeros: ");
        for (int i=0; i < 5; i++) {
            if(nums != chaveNums.get(i)){
                nums = rnd.nextInt(1, 50);
            chaveNums.add(nums);
            }
        }

        Collections.sort(chaveNums);
        System.out.println(chaveNums);


        //sortear estrelas
        System.out.print("Estrelas: ");
        for (int i=0; i < 2; i++) {
            int stars = rnd.nextInt(1, 12);
            chaveStars.add(stars);
        }Collections.sort(chaveStars);
        System.out.println(chaveStars);

    }
}
