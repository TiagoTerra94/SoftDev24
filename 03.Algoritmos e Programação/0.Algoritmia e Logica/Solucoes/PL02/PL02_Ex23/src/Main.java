import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 23. Crie um programa para multiplicar dois números
        // sem recurso ao operador multiplicação.

        // 2 x 3 = 6 => 2 + 2 + 2 = 6

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o 1º número?");
        int num1 = in.nextInt();
        System.out.println("Qual o 2º número");
        int num2 = in.nextInt();

        //int prod = num1 * num2;
        int prod = 0;
        for (int i = 0; i < num1; i++) {
            prod += num2;
        }

        System.out.println(num1 + " x " + num2 + " = " + prod);
    }
}