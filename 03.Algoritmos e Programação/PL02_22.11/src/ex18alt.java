import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex18alt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        double soma = 0;
        double media;
        double num = 1;

        while (num != 0){
            System.out.println("Insira um numero. Insira 0 para parar.");
            num = in.nextInt();

            if(num > 4){
                counter ++;//counter = counter + 1;
                soma = soma + num;//soma += num;
            }
        }

        if(counter > 0){
            media = soma / counter;
            System.out.println("A média dos valores é: " + media);
        }else{
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}