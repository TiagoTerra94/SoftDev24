import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Valor do produto: ");
            double valor_produto = in.nextDouble();

            System.out.println("Valor pago: ");
            double valor_pago = in.nextDouble();

            double troco = valor_pago - valor_produto;

            if (troco) >0 {
                System.out.println("Troco: " + troco + "€");
            }
            else if (troco <0){
                System.out.println("Falta pagar: " + troco*-1);
            }

            else {
                System.out.println("Não tem troco");
            }



    }
}