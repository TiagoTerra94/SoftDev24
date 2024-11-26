import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior=0, menor=0, quant = 0;
        double soma = 0;

        System.out.println("Quantos números vai inserir? ");
        int N = in.nextInt();

        do {
            quant++;
            System.out.println("Insira o " + quant + "º numero:");
            int num = in.nextInt();

                if (quant == 1) {
                    maior = num;
                    menor = num;
                    soma += num;
                }else {
                    soma += num;
                    if (num > maior) {
                        maior = num;
                    }
                    if (num < menor) {
                        menor = num;
                    }
                }
            System.out.println("Pretende inserir novo valor? 1 - Sim; 2 - Não");

        }while(N > 0);

        if(N > 0){//validação
            double media = soma / N;

            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
            System.out.println("A média é: " + media);
        }else{
            System.out.println("Para calcular precisa de introduzir um valor.");
        }
        }
    }