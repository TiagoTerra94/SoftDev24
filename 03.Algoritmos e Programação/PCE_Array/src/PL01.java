
import java.util.Random;
import java.util.Scanner;

public class PL01 {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static int op = 1;
    public static void main(String[] args) {


        while (op != 0) {
            System.out.println("1-ex01");
            System.out.println("2-ex02");
            System.out.println("3-ex03");
            System.out.println("4-ex04");
            System.out.println("5-ex05");
            System.out.println("6-ex06");
            System.out.println("7-ex07");
            System.out.println("8-ex08");

            System.out.println("Qual o exercicio?");

            op = in.nextInt();

            switch(op){
                case 0:
                break;
                case 1:
                    ex01();
                    break;
                case 2:
                    ex02();
                    break;
                case 3:
                    ex03();
                    break;
                case 4:
                    ex04();
                    break;
                case 5:
                    ex05();
                    break;
                case 6:
                    ex06();
                    break;
                case 7:
                    ex07();
                    break;

            }
        }


    }

    private static void ex07() {

        System.out.println("Quantos nomes vai inserir?");
        int N = in.nextInt();
        String[] nomes = new String[N];

        for(int i = 0; i<N;i++){
            System.out.println("Insira um nome: ");
            nomes[i]= in.next();
        }

    }

    private static void ex06() {
        String[] nomes = new String[5];
        int pos;

        for(int i = 0; i< nomes.length;i++){
            System.out.println("Insira um nome: ");
            nomes[i]= in.next();
        }
        pos = rnd.nextInt(0,5);
        System.out.println("O nome da posição " + (pos + 1) + "º é: "+ nomes[pos]);
    }


    private static void ex05() {
        int[] vet = new int[10];

        for(int i = 0; i<vet.length;i++){
            System.out.println("Insira o seu numero: ");
            vet[i] = in.nextInt();
        }

        int n = vet.length;
        int temp = 0;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vet[j - 1] > vet[j]) {
                    //troca elementos
                    temp = vet[j - 1];
                    vet[j - 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }


        System.out.println("Vetor organizado: ");
        for(int i = 0; i< vet.length; i++){
            System.out.println(vet[i]);
        }
    }

    private static void ex04() {
        int[] vet = new int[50];
        double soma= 0;

            for (int i = 0; i < vet.length; i++) {
                vet[i] = rnd.nextInt(0, 100);
                soma += vet[i];
            }

        /*for(int i = 0; i< vet.length; i++){
            vet[i] = in.nextInt();
            soma += vet[i];
        }*/

            double media = soma / vet.length;
            System.out.println("Media: " + media);
            System.out.println("Os numeros inferiores à media: ");

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] < media) {
                    System.out.println(vet[i] + " ");
                }
            }
    }

    private static void ex03() {
        int[] nums = new int[10];


        for(int i= 0; i<nums.length; i++){
            System.out.println("Insira um numero: ");
            nums[i] = in.nextInt();
        }


        /*for (int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }*/

        for(int i = nums.length-1; i >= 0; i--){
            System.out.println(nums[i]);
        }

    }

    private static void ex02() {
        String[] nomes = new String[10];

        //preencher array
        for (int i= 0; i< nomes.length; i++){
            in = new Scanner(System.in);
            System.out.println("Insira o nome do aluno: ");
            nomes[i] = in.nextLine();
        }

        //Saber o nome do aluno
        System.out.println("Qual o número de aluno que procura?");
        int n = in.nextInt();

        if(n < 0){
            System.out.println("Numero inválido!");
        }else {
            System.out.println("Numero aluno" + n + ": " + nomes[n]);
        }
    }

    private static void ex01() {
        double[] notas = new double[3];

        //preencher array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira uma nota: ");
            notas[i] = in.nextInt();
        }

        //Percorrer array, ler notas e adicionar
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        //fazer a media de notas
        double media = soma / notas.length;
        System.out.println("Media: " + media);
    }
}
