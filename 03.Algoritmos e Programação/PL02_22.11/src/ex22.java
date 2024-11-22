import java.util.Scanner;

//Crie um programa que converta megabytes to bytes
public class ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor de bytes: ");
        int megabytes = in.nextInt();

        int value_Byte = 1000000;

        int ConvertToByte = megabytes * value_Byte;

        System.out.println("A conversão de " + megabytes + " em bits é: " + ConvertToByte);
    }
}