import java.util.Random;
import java.util.Scanner;

public class PL01_GrupoIII {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static int[] numeros;

    public static void main(String[] args) {

        CriarArray();

        //Menu
        int op;
        do {
            System.out.println("MENU");
            System.out.println("Bem-vindo! Escolha uma opção:\n" +
                    "1- Ordenar crescente\n" +
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
                    ordenarCrescente();
                    break;
                case 2:
                    ordenarDecrescente();
                    break;
                case 3:
                    imprimirArray();
                    break;
                case 4:
                    addElementosFim();
                    break;
                case 5:
                    substituirElemento();
                case 6:
                    adicionarPos();
                    break;
                case 7:
                    eliminarElemento();
                    break;
                default:
                    System.out.println("Opção Inválidas");
                    break;
            }

        } while (op != 0);


    }

    private static void eliminarElemento() {


    }


    private static void adicionarPos() {
        int[] temp = new int[numeros.length + 1];

        System.out.println("Qual o valor a inserir?");
        int valor = in.nextInt();

        imprimirArray();

        System.out.println("Em que posição inserir? (0- " + numeros.length + ")");
        int pos = in.nextInt();

        //copia array até à posiçao que queremos introduzir o valor
        for(int i = 0; i< pos; i++){
            temp[i] = numeros[i];
        }

        //coloca na posiçao o valor pretendido
        temp[pos] = valor;

        //busca os numeros do vetor numeros na sua posiçao para a nova posiçao do temp (ex: pos 2 passa a 3 no temp)
        for(int i = pos; i< numeros.length; i++){
            temp[i+1] = numeros[i];
        }

        numeros = temp;
        imprimirArray();

    }

    private static void substituirElemento() {
        int[] temp = new int[numeros.length];
        int valor;

        //ciclo para preencher o array temp
        for (int i =0; i < numeros.length; i++){
            temp[i] = numeros[i];
        }

        imprimirArray();

        System.out.println("Em que posição inserir?");
        int pos = in.nextInt();

        //saber se a posição é valida
        if (pos < 0 || pos > numeros.length) {
            System.out.println("Posição inválida, valor não adicionado");
            return;
        }else {
            System.out.println("Qual o valor a inserir?");
            valor = in.nextInt();
        }

        //copia todos os elementos do array até à posiçao
        for(int i = 0; i< pos; i++){
            temp[i] = numeros[i];//ver soluçao
        }

        //aplica o valor à posição inserida
        temp[pos] = valor;


        numeros = temp;
        imprimirArray();

    }

    private static void addElementosFim() {
        //copia-se o array e adiciona outra posiçao
        int[] temp = new int[numeros.length + 1];

        //ciclo para preencher o array temp
        for (int i =0; i < numeros.length; i++){
            temp[i] = numeros[i];
        }

        System.out.println("Qual o valor a inserir?");
        int valor = in.nextInt();

        //busca a ultima posição e preenche o espaço
        temp[temp.length - 1] = valor;

        numeros = temp;

        imprimirArray();

    }

    private static void imprimirArray() {
        System.out.println("Vetor:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição do " + (i+1) + "º numero: " + numeros[i]);
        }
        System.out.println();
    }

    private static void ordenarDecrescente() {
        int n = numeros.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numeros[j - 1] < numeros[j]) {//vet[j - 1] < vet[j] - decrescente
                    //troca elementos
                    temp = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.println("Vetor organizado de forma decrescente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void ordenarCrescente() {
        int n = numeros.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numeros[j - 1] > numeros[j]) {//vet[j - 1] < vet[j] - decrescente
                    //troca elementos
                    temp = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        System.out.println("Vetor organizado de forma crescente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void CriarArray() {
        System.out.println("Qual a dimensão do array?");
        int tam = in.nextInt();

        numeros = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Insira o " + (i+1) + "º numero:");
            numeros[i] = in.nextInt();
        }
    }
}

