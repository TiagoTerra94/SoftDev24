import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0;
        double media;
        int num;
        int soma = 0;

        for(i = 1; i <=5; i++){
            System.out.println("Insira um número inteiro:");
            num = in.nextInt();
            soma = soma + num;// soma += in.nextInt() - otimizado
        }

        media = (double)soma / 5;

        if(media > 8){
         media = 10;
        }

        System.out.println("A média aritmética é: " + media);

        //if(media <=){sout("media é" + media)} else{(media é 10)}
    }
}