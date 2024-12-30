import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static ArrayList<Integer> boletimNums = new ArrayList<>();
    static ArrayList<Integer> boletimStars = new ArrayList<>();
    static ArrayList<Integer> chaveNums = new ArrayList<>();
    static ArrayList<Integer> chaveStars = new ArrayList<>();
    static int op = 1;
    public static void main(String[] args) {

        do {
            System.out.println("***************\n**Euromilhões**\n***************" +
                    "\nMENU\n" +
                    "1- Simular Sorteio\n" +
                    "2- Criar Boletim Manual\n" +
                    "3- Criar Boletim Automático\n" +
                    "4- Simular e tentativas\n" +
                    "0- Sair");

            op = in.nextInt();

            switch (op) {
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
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }

        } while (op != 0);


    }

    //SIMULAR SORTEIO ATÉ SAIR O PREMIO
    private static void simularSorteio2() {
        int tryCount= 0;

        System.out.println("Tipo de Boletim:\n" +
                "1- Manual\n" +
                "2- Aleatório\n" +
                "0- Sair");

        op =in.nextInt();

        switch (op){
            case 0:
                break;
            case 1:
                chaveManual();
                break;
            case 2:
                chaveAleatoria();
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        //Simular e Tentativas
        for(int i=0; i < 100000000; i++){
            simularSorteio1();
            tryCount++;
            if(chaveNums == boletimNums && chaveStars == boletimStars){
                System.out.println("Ganhou o primeiro prémio! Tentativas: " + tryCount);
                return;
            }
        }
        System.out.println("***********");
        System.out.println("Sem Prémio!");

    }

    //CRIAÇÃO CHAVE ALEATORIA
    private static void criarBoletim2() {
        simularSorteio1();

        /*//LIMPEZA DE ARRAYS
        boletimNums.clear();
        boletimStars.clear();*/

        int n = rnd.nextInt(1,5);

        System.out.println("CHAVES CRIADAS: " + n);
        System.out.println("***************");


        //criação boletim e comparaçao
        for (int i = 0; i < n; i++) {
            System.out.println("Chave " + (i + 1) + ":");
            System.out.println("********");
            chaveAleatoria();
            compararChave();
            System.out.println("***************");
        }
    }

    //CRIAÇAO DE CHAVE ALEATORIA
    private static void chaveAleatoria() {
        int nums = 0;
        int stars = 0;

        //Limpeza de Array
        boletimNums.clear();
        boletimStars.clear();

        //numeros gerados
        while(boletimNums.size()<5) {
            nums = rnd.nextInt(1, 50);
            if (!boletimNums.contains(nums)) {
                boletimNums.add(nums);
            }
        }

        //estrelas geradas
        while(boletimStars.size()<2) {
            stars = rnd.nextInt(1,12);;
            if (!boletimStars.contains(nums)) {
                boletimStars.add(stars);
            }
        }

        Collections.sort(boletimNums);
        Collections.sort(boletimStars);
        System.out.print("Números:");
        System.out.println(boletimNums);
        System.out.print("Estrelas:");
        System.out.println(boletimStars);
        System.out.println("***************");
    }

    //COMPARAR CHAVE COM CHAVE VENCEDORA
    private static void compararChave() {
        int counterNum = 0;
        int counterStar = 0;

        for (int i = chaveNums.size() - 1; i >= 0; i--) {
            for (int j = boletimNums.size() - 1; j >= 0; j--) {
                if (chaveNums.get(i) == boletimNums.get(j)) {
                    counterNum++;
                }
            }
        }

        for (int i = chaveStars.size() - 1; i >= 0; i--) {
            for (int j = boletimStars.size() - 1; j >= 0; j--) {
                if (chaveStars.get(i) == boletimStars.get(j)) {
                    counterStar++;
                }
            }
        }


        //imprimir resultado
        if (counterNum == 5 && counterStar == 2) System.out.println("Parabéns, ganhou o primeiro prémio!");
        if (counterNum == 5 && counterStar == 1) System.out.println("Parabéns, ganhou o segundo prémio!");
        if (counterNum == 5 && counterStar == 0) System.out.println("Parabéns, ganhou o terceiro prémio!");
        if (counterNum == 4 && counterStar == 2) System.out.println("Parabéns, ganhou o quarto prémio!");
        if (counterNum == 2 && counterStar == 2) System.out.println("Parabéns, ganhou o quinto prémio!");
        if (counterNum == 2) System.out.println("Parabéns, ganhou o sexto prémio!");
        else {
            System.out.println("Não lhe foi atribuído nenhum prémio!");
        }
    }

    //CRIAÇAO DE CHAVE MANUAL
    private static void chaveManual() {

        int nums = 0;
        int stars = 0;

        System.out.println("Quais são os números que quer sortear? (de 1 a 50)");


        while (boletimNums.size() < 5) {
            nums = in.nextInt();
            if (!boletimNums.contains(nums) && nums <= 50) {
                boletimNums.add(nums);
            }
            else{
                System.out.println("Número Inválido, tente outro número: ");
            }
        }


        System.out.println("Quais são as estrelas que quer sortear? (de 1 a 12)");

        while (boletimStars.size() < 2) {
            nums = in.nextInt();
            if (!boletimStars.contains(nums) && nums <= 12) {
                boletimStars.add(nums);
            }
            else{
                System.out.println("Número Inválido, tente outro número: ");
            }
        }

        System.out.println("*************\nChave Gerada:\n*************");
        Collections.sort(boletimNums);
        Collections.sort(boletimStars);
        System.out.print("Número: ");
        System.out.println(boletimNums);
        System.out.print("Estrelas: ");
        System.out.println(boletimStars);
        System.out.println("***************");
    }

    //CRIAR BOLETIM MANUAL
    private static void criarBoletim1() {
        simularSorteio1();

        //LIMPEZA DE ARRAYS
        boletimNums.clear();
        boletimStars.clear();

        System.out.println("Quantas chaves vai criar?(De 1 a 5)");
        int n = in.nextInt();

        //validaçao
        while (n < 0 || n > 5) {
            System.out.println("Valor Inválido. Quantas chaves vai criar?(De 1 a 5)");
            System.out.println("Nº :");n = in.nextInt();
        }

        //criação boletim e comparaçao
        for (int i = 0; i < n; i++) {
            System.out.println("Chave " + (i + 1) + ":");
            chaveManual();
            compararChave();
        }
    }

    //SIMULAR SORTEIO DE FORMA ORDENADA
    private static void simularSorteio1() {
        chaveNums.clear();
        chaveStars.clear();

        int nums;
        int stars;

        System.out.println("***************\nChave Sorteada:\n***************");

        //sortear numeros
        while (chaveNums.size() < 5) {
            nums = rnd.nextInt(1, 51);
            if (!chaveNums.contains(nums)) {
                chaveNums.add(nums);
            }
        }

        //sortear estrelas
        while (chaveStars.size() < 2) {
            stars = rnd.nextInt(1, 13);
            if (!chaveStars.contains(stars)) {
                chaveStars.add(stars);
            }

        }
        Collections.sort(chaveNums);
        Collections.sort(chaveStars);
        System.out.print("Numeros: ");
        System.out.println(chaveNums);
        System.out.print("Estrelas: ");
        System.out.println(chaveStars);


    }
}
