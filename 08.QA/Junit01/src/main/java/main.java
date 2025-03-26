import ex01.Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator("CalculadoraTop");
        int num1, num2;
        System.out.print("Primeiro número: ");
        num1= input.nextInt();
        System.out.print("Segundo número: ");
        num2= input.nextInt();

        System.out.println("Divisão: "+ calculator.divide(num1, num2));
    }
}
