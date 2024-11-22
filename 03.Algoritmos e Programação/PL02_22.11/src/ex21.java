import java.util.Scanner;

//Crie um programa que converta valor de bytes para bits.
public class ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor de bytes: ");
        int bytes = in.nextInt();

        int bit = 8;

        int Convert_Byte = bytes * bit;

        System.out.println("A conversão de " + bytes + " em bits é: " + Convert_Byte);


    }
}