import java.util.Scanner;

//Crie um programa que permita saber se um ano é bissexto ou nao
public class ex25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o ano: ");
        int ano = in.nextInt();

        if (ano % 4 != 0){
            System.out.println("Ano não é bissexto.");
        }else{
            System.out.println("Ano bissexto.");
        }

    }
}