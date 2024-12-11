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
    static int op = 1;
    public static void main(String[] args) {

        do {
            System.out.println("Bem-vindo ao **Euromilhões**\n" +
                    "MENU\n" +
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

            }

        } while (op != 0);


    }

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
        System.out.println("Sem Prémio!");

    }

    //CRIAÇÃO CHAVE ALEATORIA
    private static void criarBoletim2() {
        simularSorteio1();

        //LIMPEZA DE ARRAYS
        boletimNums.clear();
        boletimStars.clear();

        int n = rnd.nextInt(1,5);

        System.out.println("CHAVES CRIADAS: " + n);


        //criação boletim e comparaçao
        for (int i = 0; i < n; i++) {
            System.out.println("Chave " + (i + 1) + " :");
            chaveAleatoria();
            compararChave();
        }
    }

    //CRIAÇAO DE CHAVE ALEATORIA
    private static void chaveAleatoria() {
        int nums = 0;
        int stars = 0;

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
        System.out.println(boletimNums);
        System.out.println(boletimStars);
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
        if (counterNum == 5 && counterStar == 2) System.out.println("Parabéns, ganhou o primeiro prémio");
        if (counterNum == 5 && counterStar == 1) System.out.println("Parabéns, ganhou o segundo prémio");
        if (counterNum == 5 && counterStar == 0) System.out.println("Parabéns, ganhou o terceiro prémio");
        if (counterNum == 4 && counterStar == 2) System.out.println("Parabéns, ganhou o quarto prémio");
        if (counterNum == 2 && counterStar == 2) System.out.println("Parabéns, ganhou o quinto prémio");
        if (counterNum == 2) System.out.println("Parabéns, ganhou o sexto");
        else {
            System.out.println("Não ganhou nada");
        }
    }

    //CRIAÇAO DE CHAVE MANUAL
    private static void chaveManual() {

        int nums = 0;
        int stars = 0;

        System.out.println("Quais são os números que quer sortear? (de 1 a 50)");

        for (int i = 0; i < 5; i++) {
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

        for (int i = 0; i < 2; i++) {
            stars = in.nextInt();
            if (stars < 0 || stars > 50) {
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
            n = in.nextInt();
        }

        //criação boletim e comparaçao
        for (int i = 0; i < n; i++) {
            System.out.println("Chave " + (i + 1) + " :");
            chaveManual();
            compararChave();
        }

        /*imprimir chave
        for(int i = 0; i < n; i++){
            System.out.println("Chave" + (i+1) + ": ");
        }*/


    }

    //SIMULAR SORTEIO DE FORMA ORDENADA
    private static void simularSorteio1() {
        chaveNums.clear();
        chaveStars.clear();

        int nums;
        int stars;

        System.out.println("Chave:");

        //sortear numeros
        System.out.print("Numeros: ");

        while (chaveNums.size() < 5) {
            nums = rnd.nextInt(1, 51);
            if (!chaveNums.contains(nums)) {
                chaveNums.add(nums);
            }
        }

        System.out.print("Estrelas: ");
        while (chaveStars.size() < 2) {
            stars = rnd.nextInt(1, 13);
            if (!chaveStars.contains(stars)) {
                chaveStars.add(stars);
            }

        }
        Collections.sort(chaveNums);
        Collections.sort(chaveStars);
        System.out.println(chaveNums);
        System.out.println(chaveStars);


    }
}
