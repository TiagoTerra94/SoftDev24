import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double n1 = in.nextDouble();

        System.out.println("Insira outro número:" );
        double n2 = in.nextDouble();

        double diff = n1 - n2;

        System.out.println("A diferença entre os números é: " + diff);

        }
    }