import java.util.Scanner;

//Crie um programa que permita converter o valor em horas
//para segundos e mostre o valor em segundos
public class ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira a hora para converter em segundos: ");
        int hora = in.nextInt();

        int Value_seconds = hora * 3600;
        System.out.println("A conversão em segundos é: " + Value_seconds);


    }
}