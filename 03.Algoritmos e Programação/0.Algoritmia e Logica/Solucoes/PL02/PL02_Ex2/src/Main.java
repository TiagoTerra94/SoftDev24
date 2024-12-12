import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //2. Crie um algoritmo que após ler dois números
        // inteiros apresenta a sua soma.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número");
        //String numero1 = in.nextLine();
        //int n1 = Integer.parseInt(numero1);
        double numero1 = in.nextDouble();

        System.out.println("Insira outro número");
        //String numero2 = in.nextLine();
        //int n2 = Integer.parseInt(numero2);
        double numero2 = in.nextDouble();

        //String soma = numero1 + numero2;
        double soma = numero1 + numero2;
        int s = (int) soma;
        System.out.println("A soma é: " + s);
    }
}
