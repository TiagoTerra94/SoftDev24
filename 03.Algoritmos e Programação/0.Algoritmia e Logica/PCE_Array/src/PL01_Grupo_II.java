import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class PL01_Grupo_II {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {

        int op;


        do{
            System.out.println("Exercicios Práticos:\n" +
                    "1- Ex01\n" +
                    "2- Ex02\n" +
                    "3- Ex03\n" +
                    "4- Ex04\n" +
                    "5- Ex05");

            System.out.println("Qual é o exercio que deseja realizar?");
            op = in.nextInt();

            switch (op){
                case 1:
                    ex001();
                    break;
                case 2:
                    ex002();
                    break;
                case 3:
                    ex003();
                    break;
                case 4:
                    ex004();
                    break;
                case 5:
                    ex005();
                    break;
                case 6:
                    ex005_alt();
                    break;
            }
        }while (op !=0);
    }

    private static void ex005_alt() {
        int colunas = in.nextInt();
        int linhas = in.nextInt();

        int[][] nums = new int[linhas][colunas];
        int[] somaL = new int[linhas];
        int[] somaC = new int[colunas];

        int somaTotal = 0;

        //preenchimento do array
        for(int i = 0; i < linhas; i++){
            for (int j = 0; j< colunas; j++){
                System.out.println("Qual o valor da pos (" + i + "," + j + "): ");
                nums[i][j] = in.nextInt();
                somaL[i] += nums[i][j];
                somaC[j] += nums[i][j];
                somaTotal += nums[i][j];
            }
        }

        //apresentaçao array
        for(int i=0;i< linhas;i++){
            for(int j=0; j< colunas;j++) {
                System.out.print(nums[i][j] + "\t ");
            }System.out.println(" | " + somaL[i] + "\t" + (somaL[i] / colunas));
        }
        System.out.println("----------------");
        for(int i = 0; i<colunas; i++){
            System.out.println(somaC[i] + "\t");
        }
        for(int i = 0; i<colunas; i++){
            System.out.println((somaC[i] /linhas) + "\t");
        }

        double mediaTotal = (double)somaTotal /(linhas*colunas);

        System.out.println("A soma total: " + somaTotal);
        System.out.println("A media total: " + mediaTotal);

    }

    private static void ex005() {
        double soma_linha = 0;
        double soma_coluna = 0;
        double soma_total = 0;

        System.out.println("Quantas linhas?");
        int N = in.nextInt();
        System.out.println("Quantas colunas?");
        int M = in.nextInt();

        int[][] vet = new int[N][M];


        //soma total e inserçao de numeros
        for(int i=0;i< N;i++){
            for(int j=0; j< M;j++) {
                System.out.println("Insira o número do vetor [" + i + "]" + "[" + j +"]");
                vet[i][j] = in.nextInt();
                soma_total += vet[i][j];
            }
        }

        //somalinhas
        for(int i= 0; i < N; i++){
            soma_linha = 0;
            for(int j =0; j < M; j++){
                soma_linha += vet[i][j];
            }
            double media_linha = soma_linha / N;
            System.out.println("Media da linha [" + i + "]: " + media_linha);
        }

        //soma colunas
        for(int i=0;i< M;i++){
            for(int j=0; j < N;j++) {
                soma_coluna += vet[j][i];
            }
            double media_coluna = soma_coluna / M;
            System.out.println("Media da coluna [" + i + "]: " + media_coluna);
        }


        double media_total = soma_total / (N*M);
        System.out.println("A media total dos numeros é: " + media_total);
    }

    private static void ex004() {
        System.out.println("Quantas linhas terá o array?");
        int N = in.nextInt();
        System.out.println("Quantas colunas terá o array?");
        int M = in.nextInt();
        int[][] vet = new int[N][M];

        for(int i=0;i< N;i++){
            for(int j=0; j< M;j++) {
                System.out.println("Insira o número do vetor [" + i + "]" + "[" + j +"]");
                vet[i][j] = in.nextInt();
            }
        }

        for(int i=0;i< N;i++){
            for(int j=0; j< M;j++) {
                System.out.print(vet[i][j] + " ");
            }
        }
        //este espaço é para que cada ciclo da coluna J ele dá um println para começar outro vetor
        System.out.println();


    }

    private static void ex003() {
        int[][] vet = new int[3][3];

        //introduçao dos numeros no array
        for(int i=0;i< vet.length;i++){
            for(int j=0; j< vet.length;j++) {
                System.out.println("Insira o número do vetor [" + i + "]" + "[" + j +"]");
                vet[i][j] = in.nextInt();
            }
        }

        //apresentaçao dos numeros do array
        for(int i=0;i< vet.length;i++){
            for(int j=0; j< vet.length;j++) {
                System.out.print(vet[i][j] + " ");
            }
        }
        //este espaço é para que cada ciclo da coluna J ele dá um println para começar outro vetor
        System.out.println();

    }

    private static void ex002() {

        int[][] vet = new int[3][3];

        for(int i=0;i< vet.length;i++){
            for(int j=0; j< vet.length;j++) {
                vet[i][j] = rnd.nextInt(0, 50);
                System.out.print(vet[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ex001() {
        int[][] vet = new int[10][10];

        for(int i = 0;i< vet.length; i++){
            for(int j = 0;j< vet.length;j++){
                vet[i][j] = (i+1)*(j+1);
;                System.out.print(vet[i][j]+"\t");
            }System.out.println();
        }

    }
}
