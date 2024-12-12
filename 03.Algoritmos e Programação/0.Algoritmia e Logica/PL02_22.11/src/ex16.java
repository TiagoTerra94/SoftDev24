import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        double media;
        int num;
        int soma = 0;

        for(i = 1; i <=20; i++){
            System.out.println("Insira o " + i + "º numero.");
            num = in.nextInt();
            soma = soma + num;//soma+= num

            //outra opçao soma+=in.nextInt();
        }


        media = (double)soma / 20;

        System.out.println("A média é: " + media); //(soma/20) - otimização
    }
}