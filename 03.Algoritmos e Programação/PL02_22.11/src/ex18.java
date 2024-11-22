import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira quantos numeros inteiros vai inserir? ");
        int n = in.nextInt();

        int counter = 0;
        int soma = 0;
        double media;

        for (int i=1;i<=n;i++){
            System.out.println("Insira o " + i + "º numero: ");
            int num = in.nextInt();
            if(num > 4){
                counter ++;//counter = counter + 1;
                soma = soma + num;//soma += num;
            }
        }

        if(counter > 0){
        media = (double)soma / counter;
        System.out.println("A média é: " + media);
        }else{
            System.out.println("Não inseriu valores superiores a 4");
        }
    }
}