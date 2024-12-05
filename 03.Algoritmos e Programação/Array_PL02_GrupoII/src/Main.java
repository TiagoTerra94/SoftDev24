import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static int op;
    static ArrayList <String> alunos;
    static ArrayList <String> notas;
    static int notaAluno;
    public static void main(String[] args) {

        do {
            System.out.println("""
                    MENU
                    Bem vindo!
                    1- Inserir, editar, eliminar ou notas
                    2- Imprimir
                    3- Ler e Gravar
                    0- Sair""");

            op = in.nextInt();

            switch (op){
                case 0:
                    break;
                case 1:
                    menu1();
                    break;
                case 2:
                    imprimir();
                case 3:
                    menu2();
                    break;
                default:
                    System.out.println("Opção inválida");
            }


        } while (op != 0);

    }

    private static void menu2() {
    }

    private static void imprimir() {
    }

    private static void menu1() {
        do{
        System.out.println("MENU 1\n" +
                "1- Inserir alunos\n" +
                "2- Editar alunos\n" +
                "3- Eliminar alunos\n" +
                "0- Sair");

        op = in.nextInt();

        switch(op){
            case 0:
                break;
            case 1:
                inserirAluno();
            case 2:
                editarAluno();
            case 3:
                eliminarAluno();
            default:
                System.out.println("Opção Inválida!");
        }
        }while(op!=0);
    }

    private static void eliminarAluno() {
    }

    private static void editarAluno() {
        System.out.println("Qual é o nº do aluno que quer editar?");
        int n = in.nextInt();

        for(int i = 0; i < alunos.size();i++){
            if(n == (i+1)){
                System.out.println("Alterar nota:");
                notaAluno = in.nextInt();


            }
        }
    }

    private static void inserirAluno() {
        alunos = new ArrayList<>();

        //leitura do txt
        try{
            BufferedReader br = new BufferedReader(new FileReader("alunos.txt"));
            String linha = "";
            while((linha = br.readLine()) != null){
                alunos.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro" + e.getMessage());
        }

        //inserção do nome no array
        System.out.println("Qual o nome do aluno a inserir?");
        in = new Scanner(System.in);
        String novoaluno = in.next();
        alunos.add(novoaluno);

        //inserção do nome no txt
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt", true));
            bw.write(novoaluno);
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro" + e.getMessage());
        }

        //apresentar os dados
        System.out.println("Nova Lista de Alunos: ");
        for(int i =0; i< alunos.size(); i++) {
            System.out.print("Aluno " + (i+1) + ":" + alunos.get(i) + "\n");
        }


    }
}