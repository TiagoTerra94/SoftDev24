import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static int[] numeros;

    public static void main(String[] args) {

        CriarArray();

        int op;
        do {
            System.out.println("Bem-vindo");
            System.out.println("Escolha uma opção");
            System.out.println("1-Ordenar crescente");
            System.out.println("2-Ordenar decrescente");
            System.out.println("3-Imprimir");
            System.out.println("4-Adicionar fim");
            System.out.println("5-Substituir posição");
            System.out.println("6-Adicionar em posição");
            System.out.println("7-Remover posição");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) break;
            else if (op == 1) Ordenar(">");         // OrdenarCrescente();
            else if (op == 2) Ordenar("<");         // OrdenarDecrescente();
            else if (op == 3) Imprimir();
            else if (op == 4) Adicionar(numeros.length);  //AdicionarFim();
            else if (op == 5) Substituir();
            else if (op == 6) Adicionar(-1);          //AdicionarPosicao();
            else if (op == 7) Remover();
            else System.out.println("Opção inválida");

        } while (op != 0);

    }

    private static void CriarArray() {
        System.out.println("Qual a dimensão do array?");
        int tam = in.nextInt();

        numeros = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Insira o " + (i + 1) + "º número");
            numeros[i] = in.nextInt();
        }
    }

    private static void Remover() {
        if (numeros.length == 0) {
            System.out.println("Array vazio");
            return;
        }

        int[] temp = new int[numeros.length - 1];

        System.out.println("Qual a posição a remover?");
        int pos = in.nextInt();

        if (pos < 0 || pos >= numeros.length) {
            System.out.println("Posição inválida, valor não removido");
            return;
        }

        for (int i = 0; i < pos; i++) {
            temp[i] = numeros[i];
        }

        for (int i = pos + 1; i < numeros.length; i++) {
            temp[i - 1] = numeros[i];
        }
        numeros = temp;
        Imprimir();
    }

    private static void AdicionarPosicao() {
        int[] temp = new int[numeros.length + 1];           // [ 10, 20, 30, 40 ]
        System.out.println("Qual o valor a inserir?");
        int valor = in.nextInt();                           // 25

        Imprimir();

        System.out.println("Em que posição inserir? (0-" + numeros.length + ")");
        int pos = in.nextInt();                             // 2

        if (pos < 0) {
            System.out.println("Posição inválida, valor não adicionado");
            return;
        }

        if (pos > numeros.length) {
            System.out.println("Valor adicionado na última posição");
            pos = numeros.length;
        }

        // [10, 20, 25, 30, 40]

        /*for (int i = 0; i < pos; i++) {
            temp[i] = numeros[i];                           // [10, 20]
        }
        temp[pos] = valor;                                  // [10, 20, 25]

        for (int i = pos; i < numeros.length; i++) {
            temp[i+1] = numeros[i];                         // [10, 20, 25, 30, 40]
        }*/

        for (int i = 0; i < temp.length; i++) {
            if (i < pos) {
                temp[i] = numeros[i];
            } else if (i == pos) {
                temp[pos] = valor;
                //temp[pos + 1] = numeros[i];
            } else {
                temp[i] = numeros[i - 1];
            }
        }
        numeros = temp;
        Imprimir();
    }

    private static void Adicionar(int pos) {
        int[] temp = new int[numeros.length + 1];           // [ 10, 20, 30, 40 ]
        System.out.println("Qual o valor a inserir?");
        int valor = in.nextInt();                           // 25

        if (pos != numeros.length) {
            Imprimir();
            System.out.println("Em que posição inserir? (0-" + numeros.length + ")");
            pos = in.nextInt();
        }

        if (pos < 0) {
            System.out.println("Posição inválida, valor não adicionado");
            return;
        }

        if (pos > numeros.length) {
            System.out.println("Valor adicionado na última posição");
            pos = numeros.length;
        }

        for (int i = 0; i < temp.length; i++) {
            if (i < pos) {
                temp[i] = numeros[i];
            } else if (i == pos) {
                temp[pos] = valor;
            } else {
                temp[i] = numeros[i - 1];
            }
        }
        numeros = temp;
        Imprimir();
    }

    private static void Substituir() {
        Imprimir();
        System.out.println("Qual a posição a substituir?");
        int pos = in.nextInt();

        if (pos >= 0 && pos < numeros.length) {
            System.out.println("Qual o novo valor para a posição " + pos + "?");
            int novo = in.nextInt();

            numeros[pos] = novo;

            Imprimir();
        } else {
            System.out.println("Posição inexistente");
        }
    }

    private static void AdicionarFim() {
        int[] temp = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            temp[i] = numeros[i];
        }
        System.out.println("Qual o valor a inserir?");
        int valor = in.nextInt();

        temp[temp.length - 1] = valor;

        numeros = temp;
        Imprimir();
    }

    private static void Imprimir() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição: " + i + " | Valor: " + numeros[i]);
        }
    }

    private static void Ordenar(String ordem) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (ordem == ">") {
                    if (numeros[i] > numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                } else if (ordem == "<") {
                    if (numeros[i] < numeros[j]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        }
        Imprimir();
    }

    private static void OrdenarDecrescente() {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        Imprimir();
    }


    private static void OrdenarCrescente() {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        Imprimir();
    }
}