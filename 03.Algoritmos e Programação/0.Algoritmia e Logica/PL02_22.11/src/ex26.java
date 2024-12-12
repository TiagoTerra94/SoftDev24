import java.util.Scanner;

//Escreva um programa que converta um valor binário para decimal
public class ex26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um número binário: ");
        int binario = in.nextInt();

        int decimal = 0;

        for(int i=0; binario > 0; i++){//while(binario > 0)

            if ((binario % 10) != 0 && (binario % 10) != 1){
                System.out.println("Valor introduzido inválido.");
                return;//break;
            }

            decimal = decimal + (int) (Math.pow(2,i) * (binario % 10));//% busca o resto, o ultimo
            binario = binario / 10;//descarta o resto e busca o próximo numero do binario
            System.out.println(binario);
        }

        System.out.println(decimal);
    }
}