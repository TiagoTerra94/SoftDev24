import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4. Pretende-se lendo a base e altura de um triângulo calcular a sua área.

        Scanner in = new Scanner(System.in);

        //Se utilizamos valores inteiros dará a área inteira: 4.5 -> 4

        System.out.println("Qual o valor da base do triângulo?");
        double base = in.nextDouble();
        // int base = in.nextInt();

        System.out.println("Qual o valor da altura do triângulo?");
        double altura = in.nextDouble();
        // int altura = in.nextInt();

        double area = base * altura / 2;
        // int area = base * altura / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}