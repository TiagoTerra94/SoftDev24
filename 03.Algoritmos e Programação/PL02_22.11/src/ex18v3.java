import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex18v3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        double soma = 0;
        double media;
        double num = 1;
        int continuar;

        do{
            System.out.println("Insira um numero.");
            num = in.nextInt();

            if(num > 4){
                counter ++;//counter = counter + 1;
                soma = soma + num;//soma += num;
            }

            System.out.println("Pretende inserir outro numero?\n 1-Sim \n 0-Não");
            continuar = in.nextInt();
        }while (continuar != 0);

        if(counter > 0){
            media = soma / counter;
            System.out.println("A média dos valores é: " + media);
        }else{
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}