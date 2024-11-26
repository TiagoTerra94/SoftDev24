import java.util.Scanner;

//Crie um programa que multiplique dois números sem recorrer ao operador multiplicação
public class ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira dois números a multiplicar: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int multiply = 0;

        for(int i= 1; i <= n2; i++){
            multiply = multiply + n1;
        }

        System.out.println(n1 + " x " + n2 " = " + multiply );
    }
}