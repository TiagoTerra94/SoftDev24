import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Crie um algoritmo que lê o nome de uma
        // pessoa e escreve “Olá” seguido do nome da pessoa.

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = in.nextLine();

        System.out.println("Olá: " + nome);
    }
}