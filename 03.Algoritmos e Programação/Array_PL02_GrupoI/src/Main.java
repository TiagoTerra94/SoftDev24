import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int op;

        do{
        System.out.println("MENU\n" +
                "Bem-vindo!\n" +
                "1- Ler ficheiro\n" +
                "2- Ler e Criar Array\n" +
                "3- Escrever texto num ficheiro\n" +
                "4- Criar Array String e grava num ficheiro\n" +
                "5- Ler e Trocar Conteudo\n" +
                "0- Sair");

        op = in.nextInt();

        switch (op){
            case 0:
              break;
            case 1:
              lerFicheiro();
              break;
            case 2:
                CriarArray();
                break;
            case 3:
                escreverFicheiro();
                break;
            case 4:
                arrayepreencher();
                break;
                case 5:
                lerTrocar();
                 break;
            default:
                System.out.println("Opção Inválida!");

        }
        }while(op !=0);
    }

    private static void lerTrocar() {
        ArrayList<String> listA;
        listA = new ArrayList<>();

        ArrayList<String> listB;
        listB = new ArrayList<>();

        //leitura do conteudo dos ficheiro a e b
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }

        try (BufferedReader br = new BufferedReader(new FileReader("b.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }

        //adicionar texto dos ficheiros aos arrays a e b
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                listA.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }

        try (BufferedReader br = new BufferedReader(new FileReader("b.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                listB.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }

        ArrayList<String> temp;
        temp = new ArrayList<>();

        //busca o valor e copia para a temp
        for(int i = 0; i< listA.size(); i++){
            temp.add(listA.get(i));
        }

        //limpar array
        listA.clear();

        //transfere os dados da lista B para A
        for(int i = 0; i< listB.size(); i++){
            listA.add(listB.get(i));
        }

        //limpar array
        listB.clear();

        //buscar valor e copia de temp para lista B
        for(int i = 0; i< temp.size(); i++){
            listB.add(temp.get(i));
        }

        //imprimir
        System.out.println("Dados do ficheiro A: ");
        System.out.println(listA);
        System.out.println("Dados do ficheiro B: ");
        System.out.println(listB);

    }

    private static void arrayepreencher() {
        ArrayList <String> lista2;
        lista2 = new ArrayList<>();

        System.out.println("Quantos nomes vai introduzir?");
        int n = in.nextInt();

        for(int i = 0; i< n; i++) {
            System.out.println("Insira um nome:");
            in = new Scanner(System.in);
            lista2.add(in.nextLine());
        }

        try (BufferedWriter escrita = new BufferedWriter(new FileWriter("ficheiro.txt", true))){
            for(String nome: lista2) {
                escrita.write(nome);
                escrita.newLine();
            }
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no ficheiro");
        }

        System.out.println("Dados adicionados ao ficheiro com sucesso!");

        System.out.println("Dados inseridos:");

        for(String nome: lista2) {
            System.out.println(nome);
        }

    }

    private static void escreverFicheiro() {
        System.out.println("O que quer adicionar ao ficheiro?");
        try (BufferedWriter escrita = new BufferedWriter(new FileWriter("ficheiro.txt", true))){
            escrita.write(in.nextLine());
            escrita.newLine();
            escrita.write(in.nextLine());
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever o ficheiro");
        }
    }

    private static void CriarArray() {
        ArrayList <String> lista1;

        lista1 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("ficheiro.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                lista1.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }

        System.out.println("Conteudo do Array : " + lista1 );

    }

    private static void lerFicheiro() {

        try (BufferedReader br = new BufferedReader(new FileReader("ficheiro.txt"))){
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro");
        }
    }
}