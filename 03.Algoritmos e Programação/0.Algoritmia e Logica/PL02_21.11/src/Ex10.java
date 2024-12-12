import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n1 = in.nextInt();

        if(n1 % 2 == 0){
            System.out.println("O número é par.");
        }
        else{
            System.out.println("O número é impar.");
        }
        }
    }
