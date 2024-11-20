import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double percImpostos = 0.45;
            double percRevendedor = 0.28;


            System.out.println("Qual é a marca do automóvel?");
            String marca = in.nextLine();
            System.out.println("Qual é o preço de fábrica do " + marca + "?");
            double preco = in.nextDouble();

            double impostos = preco * percImpostos;
            double revenda = preco * percRevendedor;
            double preco_final = preco + impostos + revenda;

            System.out.println("A marca do automóvel "
                    + marca +
                    " tem como preço final "
                    + preco_final);


        }
    }