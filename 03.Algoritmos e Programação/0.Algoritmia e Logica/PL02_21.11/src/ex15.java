import java.util.Scanner;


//Faça um programa que use a estrutura While para ler 50 numeros,
// e calcule e exiba a media aritmética deles.
public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        int contador = 0;
        int numero;

        for (i=0; i <= 50; i++){
            System.out.println("Insira um número:");
            numero = in.nextInt();
            contador = contador + numero;;
        }
        double media = (double)contador / 50;

        System.out.println("A média aritmética é: " + media);
    }


}
