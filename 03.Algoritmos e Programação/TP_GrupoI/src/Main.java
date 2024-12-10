import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static ArrayList<Integer> boletimNums = new ArrayList<>();
    static ArrayList<Integer> boletimStars = new ArrayList<>();
    static ArrayList<Integer> chaveNums = new ArrayList<>();
    static ArrayList<Integer> chaveStars = new ArrayList<>();
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

    private static void compararChave(){

        for(int i = chaveNums.size(); i > 0; i--){
            for(int j = chaveNums.size()-1; j > 0 ;j--){
                if(chaveNums.get(j) == boletimNums.get(i)) {
                    System.out.println("Parabéns,ganhou o 13ª prémio");
                }
            }
        }

    }

    private static void criarChave(){

        int nums = 0;
        int stars = 0;

        System.out.println("Quais são os números que quer sortear? (de 1 a 50)");

        for (int j = 0; j < 5; j++) {
            nums = in.nextInt();
            if (nums < 0 || nums > 50) {
                System.out.println("Numero Inválido!");
                boletimNums.clear();
                return;
            } else if (!boletimNums.contains(nums)) {
                boletimNums.add(nums);
            } else {
                return;
            }
        }


        System.out.println("Quais são as estrelas que quer sortear? (de 1 a 12)");

        for (int j = 0; j < 2; j++) {
            stars = in.nextInt();
            if (nums < 0 || nums > 50) {
                System.out.println("Numero Inválido!");
                boletimStars.clear();
                return;
            } else if (!boletimStars.contains(nums)) {
                boletimStars.add(stars);
            } else {
                return;
            }
        }
        Collections.sort(boletimNums);
        Collections.sort(boletimStars);
        System.out.println(boletimNums);
        System.out.println(boletimStars);
    }

    private static void criarBoletim1() {
        simularSorteio1();

        System.out.println("Quantas chaves vai criar?");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Chave " + (i+1) + " :");
            criarChave();
            compararChave();
        }

        for(int i = 0; i < n; i++){
            System.out.println("Chave" + (i+1) + ": ");
        }



    }

    private static void simularSorteio1() {
        int nums;
        int stars;


        System.out.println("Chave:");

        //sortear numeros
        System.out.print("Numeros: ");

        while (chaveNums.size() < 5){
            nums= rnd.nextInt(1,51);
            if (!chaveNums.contains(nums)){
                chaveNums.add(nums);
            }

        }
        while (chaveStars.size() < 2){
            stars= rnd.nextInt(1,13);
            if (!chaveStars.contains(stars)){
                chaveStars.add(stars);
            }

        }
        Collections.sort(chaveNums);
        Collections.sort(chaveStars);
        System.out.println(chaveNums);
        System.out.println(chaveStars);




    }

        /*for (int i = chaveNums.size(); i > 0 ; i--){
            for(int j = (chaveNums.size()); j > 1; j--){
                if(chaveNums.get(j-1) == chaveNums.get(i)) {
                    nums = rnd.nextInt(1, 51);
                    chaveNums.set(i, nums);
                }
            }*/
        }




        //sortear estrelas
        /*System.out.print("Estrelas: ");
        for (int i=0; i < 2; i++) {
            int stars = rnd.nextInt(1, 12);
            chaveStars.add(stars);
        }Collections.sort(chaveStars);
        System.out.println(chaveStars);

    }*/

