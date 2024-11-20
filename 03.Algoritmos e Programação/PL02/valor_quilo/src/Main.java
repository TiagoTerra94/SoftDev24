import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira o valor ao quilo: ");
            double v_quilo = in.nextDouble();
            System.out.println("Quanto quilos foi consumido?");
            double q_consumido = in.nextDouble();

            double valor_final = v_quilo * q_consumido;

            System.out.println("Valor total a pagar: " + valor_final);

        }
    }