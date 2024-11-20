import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = in.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = in.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números é: " + soma);

        }
    }