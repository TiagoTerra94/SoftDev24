import java.util.Scanner;

//Crie um programa que permita converter o valor em dias
//para anos, semanas e dias
public class ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o número de dias que quer converter: ");
        int dias = in.nextInt();

        int anos = dias/365;
        int diasFinais = dias - 365;
        int semanas = diasFinais/7;


        System.out.println(anos + " anos," + semanas + " semanas, " + diasFinais + " dias." );
    }
}