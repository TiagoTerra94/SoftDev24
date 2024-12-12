import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            System.out.println("1-Ex01");
            System.out.println("2-Ex02");
            System.out.println("3-Ex03");
            System.out.println("4-Ex04");
            System.out.println("5-Ex05");
            System.out.println("6-Ex06");
            System.out.println("7-Ex07_Ex08");
            op = in.nextInt();

            if (op == 1) ex01();
            else if (op == 2) ex02();
            else if (op == 3) ex03();
            else if (op == 4) ex04();
            else if (op == 5) ex05();
            else if (op == 6) ex06();
            else if (op == 7) ex07_08();
            else System.out.println("Opção inválida");
        }
    }

    private static void ex08_ordenar() {
        // 8. Altere o exercício anterior ordenando os vetores.
        Arrays.sort(ex07_nomes);
        Arrays.sort(ex07_letras);
        System.out.println("Arrays ordenados");
    }

    static String[] ex07_nomes;
    static String[] ex07_letras;

    private static void ex07_08() {
        // 7. Faça um programa que peça ao utilizador um conjunto de nomes.
        // Sempre que o utilizador insere um nome deve inserir num outro vetor
        // a 1ª letra de cada nome. Permita ao utilizador escrever o conteúdo
        // de cada vetor. Sugere-se a utilização de um menu.

        ex07_PreencherArrays();
        int op;

        do {
            System.out.println("1-Preencher arrays");
            System.out.println("2-Mostrar Nomes");
            System.out.println("3-Mostrar Letras");
            System.out.println("4-Ordenar");
            System.out.println("0-Sair");
            //try {
            op = in.nextInt();
            if (op == 0) break;
            else if (op == 1) ex07_PreencherArrays();
            else if (op == 2) ex07_Mostrar(ex07_nomes);  //ex07_MostrarNomes();
            else if (op == 3) ex07_Mostrar(ex07_letras); //ex07_MostrarLetras();
            else if (op == 4) ex08_ordenar();
            else System.out.println("Opção inválida");
            /*} catch (InputMismatchException e) {
                System.out.println("Insira um valor numérico");
                in = new Scanner(System.in);
                op = -1;
            }*/
        } while (op != 0);
    }

    private static void ex07_Mostrar(String[] dados) {
        try {
            for (int i = 0; i < dados.length; i++) {
                System.out.println("Posição " + (i + 1) + ": " + dados[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Array ainda não preenchido");
        }
    }

    /* private static void ex07_MostrarLetras() {
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + letras[i]);
        }
    }

    private static void ex07_MostrarNomes() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + nomes[i]);
        }
    }*/

    private static void ex07_PreencherArrays() {
        System.out.println("Quantos nomes vai inserir?");
        int quant = in.nextInt();

        ex07_nomes = new String[quant];
        ex07_letras = new String[quant];

        in = new Scanner(System.in);
        for (int i = 0; i < quant; i++) {
            System.out.println("Qual o " + (i + 1) + "º nome?");
            ex07_nomes[i] = in.nextLine();
            // ex07_letras[i] = String.valueOf(ex07_nomes[i].charAt(0));
            ex07_letras[i] = ex07_nomes[i].substring(0, 1);
        }
    }

    private static void ex06() {
        // 6. Faça um programa que peça ao utilizador um conjunto de nomes e
        // os guarda num vetor. De seguida sorteie uma
        // posição do vetor e escreva o nome que está nessa posição.

        System.out.println("Quantos nomes quer guardar?");
        int quant = in.nextInt();

        in = new Scanner(System.in);
        String[] nomes = new String[quant];
        for (int i = 0; i < quant; i++) {
            System.out.println("Qual o " + (i + 1) + "º nome?");
            nomes[i] = in.nextLine();
        }

        int pos = rnd.nextInt(0, nomes.length);
        System.out.println("Posição: " + (pos + 1) + " | Nome: " + nomes[pos]);

    }

    private static void ex05() {
        // 5. Faça um programa que ordene de forma crescente e
        // decrescente um vetor. Sugere-se pesquisa na internet pelo
        // tópico: “java bubble sort”.

        Integer[] nums = new Integer[10];
        // ciclo para gerar números
        System.out.print("Array original: \t");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
            System.out.print(nums[i] + "\t");
        }
        System.out.println();

        // ordenar crescente
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
        Arrays.sort(nums);

        System.out.print("Array crescente: \t");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();

        // ordenar decrescente
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
        Arrays.sort(nums, Collections.reverseOrder());

        System.out.print("Array decrescente: \t");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
    }

    private static void ex04() {
        // 4. Faça um programa que utilize uma estrutura de repetição para ler
        // 50 números armazenando-os em um vetor e calcule e exiba a média
        // aritmética deles. Em seguida o programa deve apresentar todos os
        // valores armazenados no vetor que sejam menores que a média.

        int[] nums = new int[50];
        int soma = 0;
        // ciclo para gerar números
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
            soma += nums[i];
        }

        int media = soma / nums.length;
        System.out.println("Média: " + media);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < media) {
                System.out.println("Posição: " + i + "\t Valor: " + nums[i]);
            }
            /*else{
                System.out.println("###Posição: " + i + "\t Valor: " + nums[i]);
            }*/
        }
    }

    private static void ex03() {
        // 3. Faça um programa que receba 10 valores inteiros e os coloque
        // em um vetor. Em seguida exiba-os em ordem inversa à ordem de entrada.

        int[] nums = new int[10];

        // ciclo para gerar números
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
        }

        // mostrar ordem de inserção
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // mostrar ordem inversa à inserção
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void ex02() {
        // 2. Faça um programa que guarde num vetor os nomes de pelo menos
        // 10 alunos da turma. Deve permitir ao utilizador ao inserir o número
        // do aluno (índice do vetor) indicar qual o nome do mesmo.
        in = new Scanner(System.in);
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o nome do aluno nº " + (i + 1));
            nomes[i] = in.nextLine();
        }

        int pos = 1;
        while (pos != 0) {
            System.out.println("Qual o número do aluno que quer consultar? (1-" + nomes.length + ")\n0-Sair");
            pos = in.nextInt();

            if (pos == 0) break;
            if (pos < 0 || pos > nomes.length) {
                System.out.println("Posição inválida");
            } else {
                System.out.println(pos + " - " + nomes[pos - 1]);
            }
        }
    }

    private static void ex01() {
        // 1. Faça um programa que peça ao utilizador três notas,
        // guarde-as num vetor e apresente a média final lendo as
        // notas do vetor.

        double[] notas = new double[3];
        double soma = 0;

        // Pedir ao utilizador as 3 notas e preencher no array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira uma nota");
            notas[i] = in.nextDouble();
            //soma += notas[i];
        }

        // Percorrer o array, ler todas as notas e adicionar cada uma ao acumulador
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Media: " + media);
    }
}