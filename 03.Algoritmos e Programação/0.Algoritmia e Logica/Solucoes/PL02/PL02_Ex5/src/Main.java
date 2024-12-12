import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5. Faça um programa que receba um valor que é o valor pago,
        // um segundo valor que é o preço do produto e retorne
        // o troco a ser dado

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o preço total?");
        double preco = in.nextDouble();

        System.out.println("Qual o valor pago?");
        double valorPago = in.nextDouble();

        double troco = valorPago - preco;

        if (troco > 0) {
            System.out.println("O troco é: " + troco);          // troco > 0
        } else if (troco < 0) {
            //System.out.println("Ainda falta pagar: " + troco * -1);  // troco < 0
            System.out.println("Ainda falta pagar: " + Math.abs(troco));  // troco < 0
        }
        //else if (troco == 0) {
        else {
            System.out.println("Não tem troco");                // troco = 0
        }
    }
}