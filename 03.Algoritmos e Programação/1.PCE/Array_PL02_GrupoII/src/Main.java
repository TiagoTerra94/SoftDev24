import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//Pretende-se uma aplicação que permita classificar cada um dos N alunos de uma disciplina com a seguinte estrutura de
//avaliação: T1(20%),T2(20%),Ex(60%)
public class Main {
    static Scanner in = new Scanner(System.in);
    static int op;
    static ArrayList <String> alunos = new ArrayList<>();
    static ArrayList <Integer> listnotast1 = new ArrayList<>();
    static ArrayList <Integer> listnotast2 = new ArrayList<>();
    static ArrayList <Integer> listexame = new ArrayList<>();
    static ArrayList <String> notafinal = new ArrayList<>();
    static ArrayList <Double> notaFinal = new ArrayList<>();
    static ArrayList<String> texto = new ArrayList<>();
    static int notaAluno;
    static int notaT1;
    static int notaT2;
    static int exame;
    static double Final;
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
                    break;
            }


        } while (op != 0);

    }


    private static void menu2() {
        System.out.println("MENU 2\n" +
                "1- Ler ficheiro\n" +
                "2- Gravar no ficheiro\n" +
                "0- Voltar");

        op = in.nextInt();

        if(op == 0){
            return;
        }

        if(op == 1){
            try {
                BufferedReader br = new BufferedReader(new FileReader("alunos.txt"));
                String linha = "", texto = "";
                while ((linha = br.readLine()) != null) {
                    texto += linha + "\n";
                }

                System.out.println(texto);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Dados lidos com sucesso.");
        }

        if(op == 2){
            for(int i = 0; i < alunos.size(); i++){
                texto.add(alunos.get(i));
                texto.add(String.valueOf(listnotast1.get(i)));
                texto.add(String.valueOf(listnotast2.get(i)));
                texto.add(String.valueOf(listexame.get(i)));
            }

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt", false));//falta saber fazer clear
                for (int i = 0; i < texto.size(); i++) {
                    bw.write(texto.get(i));
                    bw.newLine();
                }
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Dados gravados com sucesso");
        }

    }

    private static void imprimir() {
        double melhorNota = 0;
        double piorNota = 99;
        double somat1 = 0,somat2 = 0, somat3 = 0, somat4 = 0;
        int quant_1 = 0, quant_2 = 0, quant_3 = 0, quant_4 = 0, quant_5 = 0;

        System.out.println("Nome:                Classificação:");
        for(int i = 0; i < alunos.size();i++){
            System.out.print(alunos.get(i) + "                ");
            System.out.println(notafinal.get(i));
        }

        /*
        for(int i = 0; i < alunos.size();i++){
            System.out.print(alunos.get(i) + "                ");
            System.out.println(notafinal.get(i));
        }*/

        System.out.println("*********");

        //procurar a melhor e pior nota da turma
        for(int i=0;i<notaFinal.size();i++) {
            if(notaFinal.get(i) >= melhorNota){
                melhorNota = notaFinal.get(i);
            }
            if(notaFinal.get(i) <= piorNota){
                piorNota = notaFinal.get(i);
            }
        }
        System.out.println("MELHOR NOTA FINAL: " + melhorNota + "valores");
        System.out.println("PIOR NOTA FINAL: " + piorNota + "valores");


        System.out.println("PERCENTAGENS DE NOTAS POSITIVAS:" );
        for(int i = 0; i < listnotast1.size(); i++){
            somat1 += listnotast1.get(i);
            somat2 += listnotast2.get(i);
            somat3 += listexame.get(i);
            somat4 += notaFinal.get(i);
            if(listnotast1.get(i) >= 10){
                quant_1 = quant_1 + 1;
            }
            if(listnotast2.get(i) >= 10){
                quant_2 = quant_2 + 1;
            }
            if(listexame.get(i) >= 10){
                quant_3 = quant_3 + 1;
            }
            if(notaFinal.get(i) >= 10){
                quant_4 = quant_4 + 1;
            }
        }

        System.out.println("Trabalho 1: " + (quant_1*100 /listnotast1.size()) + "%");
        System.out.println("Trabalho 2: " + (quant_2*100 /listnotast2.size())+ "%");
        System.out.println("Exame: " + (quant_3*100 /listexame.size())+ "%");
        System.out.println("Final: " + (quant_4*100 /notaFinal.size())+ "%");

        System.out.println("Média das Notas: ");
        System.out.println("Trabalho 1: " + (somat1/listnotast1.size()) + "valores");
        System.out.println("Trabalho 2: " + (somat2/listnotast2.size()) + "valores");
        System.out.println("Exame: " + (somat3/listexame.size()) + "valores");

        for(int i = 0; i < notafinal.size(); i++){
            if(Objects.equals(notafinal.get(i), "Muito Bom")){
                quant_5 = quant_5 + 1;
            }
        }

        if(quant_5 == 1) {
            System.out.println(quant_5 + " aluno tiveram classificação MUITO BOM");
        } else {
            System.out.println(quant_5 + " alunos tiveram classificação MUITO BOM");
        }


    }

    private static void menu1() {

        System.out.println("MENU 1\n" +
                "1- Inserir alunos\n" +
                "2- Editar alunos\n" +
                "3- Eliminar alunos\n" +
                "0- Voltar");

        op = in.nextInt();

        switch(op){
            case 0:
                break;
            case 1:
                inserirAluno();
                break;
            case 2:
                editarAluno();
                break;
            case 3:
                eliminarAluno();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

    }

    private static void eliminarAluno() {
        notaT1 =0;
        notaT2 =0;
        Final = 0;

        System.out.println("Qual é o nº do aluno que quer editar?");
        int n = in.nextInt();

        //validaçao
        if(n < 0 || n > alunos.size()){
            System.out.println("Aluno inexistente!");
            return;
        }

        for(int i = 0; i < alunos.size();i++) {
            if (n == (i + 1)) {
                alunos.remove(i);
                listnotast1.remove(i);
                listnotast2.remove(i);
                listexame.remove(i);

                System.out.println("Aluno e respectivas notas removidas!");
            }
        }
    }

    private static void editarAluno() {
        notaT1 =0;
        notaT2 =0;
        Final = 0.0;

        System.out.println("Qual é o nº do aluno que quer editar?");
        int n = in.nextInt();


        //validaçao
        if(n < 0 || n > alunos.size()){
            System.out.println("Aluno inexistente!");
            return;
        }

        System.out.println("Aluno: " + alunos.get(n-1));
        for(int i = 0; i < alunos.size();i++){
            if((n-1) == i){
                System.out.println("Nota do trabalho 1: ");
                notaT1 = in.nextInt();
                if(notaT1 < 0 || notaT1 > 20) {
                    System.out.println("Nota inválida!");
                    return;
                }

                System.out.println("Nota do trabalho 2: ");
                notaT2 = in.nextInt();
                if(notaT2 < 0 || notaT2 > 20) {
                    System.out.println("Nota inválida!");
                    return;
                }

                System.out.println("Nota do exame: ");
                exame = in.nextInt();
                if(exame < 0 || exame > 20) {
                    System.out.println("Nota inválida!");
                    return;
                }

                //adiciona aos arrays se for tudo validado
                listnotast1.set(i,notaT1);
                listnotast2.set(i,notaT2);
                listexame.set(i, exame);

                //nota final
                Final = ((notaT1 * 0.20) + (notaT2*0.20) + (exame*0.60));
                System.out.println("Nota Final: " + Final);
                notaFinal.set(i,Final);

                //Classificação
                System.out.print("Classificação:");
                if (Final <= 4.9){
                    System.out.println("Muito Fraco");
                    notafinal.set(i,"Muito Fraco");
                } else if (Final > 4.9 && Final <= 9.9) {
                    System.out.println("Fraco");
                    notafinal.set(i,"Fraco");
                } else if (Final > 10 && Final <= 12.9) {
                    System.out.println("Suficiente");
                    notafinal.set(i, "Suficiente");
                } else if (Final > 13 && Final <= 16.9) {
                    System.out.println("Bom");
                    notafinal.set(i,"Bom");
                }else {
                    System.out.println("Muito Bom");
                    notafinal.set(i,"Muito Bom");
                }
            }
        }
    }

    private static void inserirNota(){
        notaT1 =0;
        notaT2 =0;
        Final = 0.0;


        System.out.println("Qual é a nota do trabalho 1 do " + alunos.getLast() + " de 0 a 20:");
        notaT1 = in.nextInt();

        //validaçao
        if(notaT1 < 0 || notaT1 > 20){
            System.out.println("Nota inválida!");
            return;
        }


        System.out.println("Qual a nota do trabalho 2 do " + alunos.getLast() + " de 0 a 20:");
        notaT2 = in.nextInt();

        if(notaT2 < 0 || notaT2 > 20){
            System.out.println("Nota inválida!");
            return;
        }

        System.out.println("Qual a nota do exame do " + alunos.getLast() + " de 0 a 20:");
        exame = in.nextInt();

        if(exame < 0 || exame > 20){
            System.out.println("Nota inválida! ");
            return;
        }

        //arrays apos validaçoes
        listnotast1.add(notaT1);
        listnotast2.add(notaT2);
        listexame.add(exame);

        //NOTA FINAL DO ALUNO
        Final = ((notaT1 * 0.20) + (notaT2*0.20) + (exame*0.60));
        System.out.println("Nota final do " + alunos.getLast() + " é " + Final);
        notaFinal.add(Final);

        //Classificação
        System.out.print("Classificação:");
        if (Final <= 4.9){
            System.out.println("Muito Fraco");
            notafinal.add("Muito Fraco");
        } else if (Final > 4.9 && Final <= 9.9) {
            System.out.println("Fraco");
            notafinal.add("Fraco");
        } else if (Final > 10 && Final <= 12.9) {
            System.out.println("Suficiente");
            notafinal.add("Suficiente");
        } else if (Final > 13 && Final <= 16.9) {
            System.out.println("Bom");
            notafinal.add("Bom");
        }else {
            System.out.println("Muito Bom");
            notafinal.add("Muito Bom");
        }

    }

    private static void inserirAluno() {

        //inserção do nome no array
        System.out.println("Qual o nome do aluno a inserir?");
        in = new Scanner(System.in);
        String novoaluno = in.next();
        alunos.add(novoaluno);

        inserirNota();

    }
}