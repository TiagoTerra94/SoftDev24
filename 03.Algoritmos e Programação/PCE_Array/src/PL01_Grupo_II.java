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
            }
        }while (op !=0);
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
        System.out.println("A media total dos numero é: " + media_total);
    }

    private static void ex004() {
        System.out.println("Quantas linhas?");
        int N = in.nextInt();
        System.out.println("Quantas colunas?");
        int M = in.nextInt();
        int[][] vet = new int[N][M];

        for(int i=0;i< N;i++){
            for(int j=0; j< M;j++) {
                System.out.println("Insira o número do vetor [" + i + "]" + "[" + j +"]");
                vet[i][j] = in.nextInt();
            }
        }
    }

    private static void ex003() {
        int[][] vet = new int[3][3];

        for(int i=0;i< vet.length;i++){
            for(int j=0; j< vet.length;j++) {
                System.out.println("Insira o número do vetor [" + i + "]" + "[" + j +"]");
                vet[i][j] = in.nextInt();
            }
        }

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
