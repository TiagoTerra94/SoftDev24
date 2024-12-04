import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static int op;
    static ArrayList <String> alunos;
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
    }

    private static void inserirAluno() {
        alunos = new ArrayList<>();

        System.out.println("Quantos alunos quer inserir?");
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Qual o nome do " + (i+1) +"º aluno a inserir?");
            in = new Scanner(System.in);
            alunos.add(in.nextLine());
        }

        System.out.println("Dados introduzidos: ");
        System.out.println(alunos);


    }
}