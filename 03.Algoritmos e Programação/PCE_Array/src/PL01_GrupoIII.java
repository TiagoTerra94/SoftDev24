import java.util.Random;
import java.util.Scanner;

public class PL01_GrupoIII {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {

        //Criar e Preencher Array
        System.out.println("Quantas linhas vai inserir?");
        int rows = in.nextInt();
        int[] vet = new int[rows];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Insira o " + i + "º numero:");
            vet[i] = in.nextInt();
        }

        //Menu
        int op;
        do {
            System.out.println("MENU");
            System.out.println("1- Ordenar crescente\n" +
                    "2- Ordenar decrescente\n" +
                    "3- Imprimir array\n" +
                    "4- Adicionar elementos ao array\n" +
                    "5- Substituir elemento no array\n" +
                    "6- Adicionar elementos e Arrastar\n" +
                    "7- Eliminar elementos no array");

            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    ordenarCrescente(vet);
                    break;
                case 2:
                    ordenarDecrescente(vet);
                    break;
                case 3:
                    imprimirArray(vet);
                    break;
                case 4:
                    addElementos(vet);
                    break;
            }

        } while (op != 0);


    }

    private static void addElementos(int[] vet) {
        int[] novoVet = vet.clone();

        System.out.println("Insira um número a adicionar ao array: ");
        int novoNum = in.nextInt();

       novoVet[novoVet.length -1] = novoNum;


    }

    private static void imprimirArray(int[] vet) {
        System.out.println("Vetor:");

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    private static void ordenarDecrescente(int[] vet) {
        int n = vet.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vet[j - 1] < vet[j]) {//vet[j - 1] < vet[j] - decrescente
                    //troca elementos
                    temp = vet[j - 1];
                    vet[j - 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        System.out.println("Vetor organizado de forma decrescente: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    private static void ordenarCrescente(int[] vet) {
        int n = vet.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vet[j - 1] > vet[j]) {//vet[j - 1] < vet[j] - decrescente
                    //troca elementos
                    temp = vet[j - 1];
                    vet[j - 1] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        System.out.println("Vetor organizado de forma crescente: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
