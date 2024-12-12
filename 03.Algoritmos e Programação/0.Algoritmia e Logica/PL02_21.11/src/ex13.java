import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o código do produto:");
        int produto = in.nextInt();

        switch(produto){
            case 001:
                System.out.println("Parafuso.");
                break;
            case 002:
                System.out.println("Porca.");
                break;
            case 003:
                System.out.println("Prego.");
                break;
            default:
                System.out.println("Não definido.");
                break;
        }


    }

}