import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ler nome
        String nome = in.nextLine();

        System.out.print("Olá" + nome);

        //soma de dois numeros
        System.out.println("Insira um número: ");
        double numero1 = in.nextDouble();
        System.out.println("Insira outro número: ");
        double numero2 = in.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("A soma dos números é: " + soma);

        /*soma de dois números
        System.out.println("Insira dois números para somar: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("A soma dos dois números é:" + (n1 + n2));

        //Diferença entre dois números
        System.out.println("Insira dois números para realizar a diferença: ");
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        System.out.print("A diferença entre os dois números é" + (n3 - n4));*/


        }
    }