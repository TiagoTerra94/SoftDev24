import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o código do produto:");
        int produto = in.nextInt();

        if(produto == 001){
            System.out.println("Parafuso");
        }
        else if(produto == 002){
            System.out.println("Porca");
        }
        else if(produto == 003){
            System.out.println("Prego");
        }
        else {
            System.out.println("Não definido");
        }
    }

}