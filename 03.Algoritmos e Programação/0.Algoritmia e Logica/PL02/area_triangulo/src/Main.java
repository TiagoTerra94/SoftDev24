import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira a base do triângulo: ");
            double base = in.nextDouble();
            System.out.println("Insira a altura do triângulo: ");
            double altura = in.nextDouble();

            double area = base * altura / 2;

            System.out.println("A área do triângulo é: " + area);

        }
    }