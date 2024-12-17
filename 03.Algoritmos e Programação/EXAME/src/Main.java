import java.io.*;
import java.lang.reflect.AnnotatedArrayType;
import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static int op = 1;
    static ArrayList<String> listaCompras = new ArrayList<>();
    public static void main(String[] args) {

        do{
            System.out.println("ALUNO: TIAGO TERRA");
            System.out.println("Bem-vindo\n" +
                "1- Ex01\n" +
                "2- Ex02\n" +
                "3- Ex03\n" +
                "4- Ex04\n" +
                "5- Ex05\n" +
                "6- Ex06\n" +
                "7- Ex07\n" +
                "8- Ex08\n" +
                "0- Sair");

            op = in.nextInt();

            switch (op){
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
                case 8:
                    ex08();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(op !=0);

    }

    private static void ex08() {
        Random rnd = new Random();
        int numEscolhido= 0;
        int contador = 0;

        int nRandom = rnd.nextInt(1,51);

        System.out.println("Qual o seu número: (de 1 a 50)");

        while(numEscolhido != nRandom) {
            numEscolhido = in.nextInt();
            if (numEscolhido > nRandom) {
                System.out.println("Tente um numero menor");
            }
            if (numEscolhido < nRandom) {
                System.out.println("Tente um numero maior");
            }
            contador++;
        }

        System.out.println("ACERTOU! Nºde tentativas: " + contador);

    }

    private static void ex07() {
        System.out.println("SUCESSAO FIBONACCI");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(1);

        System.out.println("Quantos elementos pretende apresentar: ");
        int n = in.nextInt();

        for(int i = 3; i < n; i ++){
            nums.add(nums.get(i-1) + nums.get(i-2));
        }
        System.out.println("Sequência: " + nums);

    }

    private static void ex06() {
        int n = 0;

        System.out.println("Insira um valor par e menos de 100: ");

        while((n % 2 == 0) &&  (n < 100)){
            n = in.nextInt();
            for(int i = 0; i<=n; i+=5){
                System.out.println(i);
            }
        }
    }

    private static void ex05() {

        do{
            System.out.println("MENU");
            System.out.println("1- Adicionar Elementos");
            System.out.println("2- Editar Elemento");
            System.out.println("3- Eliminar Elemento");
            System.out.println("4- Mostrar Lista");
            System.out.println("0- Sair");

            op = in.nextInt();

            switch (op){
                case 0:
                    break;
                case 1:
                    addElemento();
                    break;
                case 2:
                    editElemento();
                    break;
                case 3:
                    deleteElemento();
                    break;
                case 4:
                    mostrarLista();
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }

        }while(op != 0);

    }

    private static void mostrarLista() {
        System.out.println("A sua lista de compras: ");
        for (int i = 0; i < listaCompras.size(); i++){
            System.out.println((i+1) + "- " + listaCompras.get(i));
        }
    }

    private static void deleteElemento() {
        System.out.println("Qual elemento quer eliminar?");
        int pos = in.nextInt();

        listaCompras.remove(pos-1);
        System.out.println("Elemento eliminado com sucesso.");
    }

    private static void editElemento() {
        System.out.println("Que elemento quer editar?");
        int pos = in.nextInt();

        System.out.println("Insira o novo elemento: ");
        in.nextLine();
        String novo = in.nextLine();

        listaCompras.set((pos-1),novo);

    }

    private static void addElemento() {
        System.out.println("Que elemento deseja adicionar?");
        in.nextLine();
        String elemento = in.nextLine();
        listaCompras.add(elemento);
    }

    private static void ex04() {
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Insira 5 números: ");
        for(int i = 0; i<5; i++){
            System.out.println("Numero " + (i+1) + ": " );
            nums.add(in.nextInt());
        }

        System.out.println("Qual é o número que procura?");
        int number = in.nextInt();

        if(nums.contains(number)){
            System.out.println("O seu número encontra-se no array");
        } else{
            System.out.println("O seu número NAO se encontra no array");
        }

    }

    private static void ex03() {
        ArrayList<String> content = new ArrayList<>();
        int counter = 0;

        //ler ficheiro
        try{
            BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
            String linha = "";
            String texto = "";
            while ((linha = br.readLine()) != null) {
                texto += linha + "\n";
                content.add(linha);
                counter++;
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


        //escrever em ficheiro
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("saida.txt",true));
            for(String linha: content) {
                bw.write(linha);
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //imprime
        System.out.println("O ficheiro tinha " + counter + " linhas");
    }

    private static void ex02() {
        ArrayList<Integer> numsList = new ArrayList<>();

        int nums;
        System.out.println("Insira os numeros: ");

        do{
            nums = in.nextInt();
            numsList.add(nums);
        }while(nums >= 0);

        //remove o nr negativo
        numsList.removeLast();

        System.out.println("Numeros na ordem inversa: ");
        //numeros ordem inversa
        for (int i = numsList.size()-1; i >= 0; i--){
            System.out.print(numsList.get(i) + "\t");
        }
        System.out.println();
    }

    private static void ex01() {
        int [] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;
        double media;

        //GERAR 10 NUMEROS + Try catch
        try {
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Insira o " + (i + 1) + "º número: ");
                numeros[i] = in.nextInt();

                //saber pares e impares
                if (numeros[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                //soma dos numeros
                soma += numeros[i];
            }


            //media dos numeros
            media = (double)soma / numeros.length;

            //imprimir o resultado
            System.out.println("Nº de pares: " + pares);
            System.out.println("Nº de impares: " + impares);
            System.out.println("Soma de todos os números: " + soma);
            System.out.println("Média total: " + media);

        }catch(InputMismatchException e){
            System.out.println("Valor inserido inválido." + e.getMessage());
        }
    }

}