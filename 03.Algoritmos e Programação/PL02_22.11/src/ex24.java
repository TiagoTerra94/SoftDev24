import java.util.Scanner;

//Crie um programa que permita converter o valor em dias
//para anos, semanas e dias
public class ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior, menor;
        double soma = 0;

        System.out.println("Quantos números vai inserir? ");
        int N = in.nextInt();

        if(N > 0){//validação
            System.out.println("Insira o 1º numero:");
            int num = in.nextInt();
            maior = n;
            menor = n;
            soma += num;

        for(int i = 2; i <= N; i++){
            System.out.println("Insira o " + i + "º numero:");
            num = in.nextInt();

            soma += num;

            if(num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
        }

        double media = soma / N;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média é: " + media);
        }else{
            System.out.println("Para calcular precisa de introduzir um valor.");
        }

    }
}