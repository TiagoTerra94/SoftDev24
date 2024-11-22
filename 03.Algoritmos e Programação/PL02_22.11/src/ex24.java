import java.util.Scanner;

//Crie um programa que permita converter o valor em dias
//para anos, semanas e dias
public class ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = 0;
        int menor = 99;
        double soma = 0;

        System.out.println("Quantos números vai inserir? ");
        int N = in.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.println("Insira o " + i + "º numero:");
            int num = in.nextInt();

            if(num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
            soma += num;
        }

        double media = soma / N;

        if(media != 0){
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
            System.out.println("A média é: " + media);
        }else{
            System.out.println("Não foram inseridos números válidos.");
        }

    }
}