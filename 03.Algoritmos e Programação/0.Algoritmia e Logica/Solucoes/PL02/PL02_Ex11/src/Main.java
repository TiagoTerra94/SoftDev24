import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 11. Faça um programa que receba 3 valores que representarão os
        // lados de um triângulo e verifique se os valores
        // formam um triângulo e classifique esse triângulo como:
        // • Equilátero (3 lados iguais);
        // • Isósceles (2 lados iguais);
        // • Escaleno (3 lados diferentes).
        // De notar que para formar um triângulo:
        // • Nenhum dos lados pode ser igual a zero;
        // • Um lado não pode ser maior do que a soma dos outros dois;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do lado 1");
        int l1 = in.nextInt();
        /*if (l1 <= 0) {
            System.out.println("Valor do lado 1 inválido");
            return;
        }*/

        System.out.println("Insira o valor do lado 2");
        int l2 = in.nextInt();
        /*if (l2 <= 0) {
            System.out.println("Valor do lado 2 inválido");
            return;
        }*/

        System.out.println("Insira o valor do lado 3");
        int l3 = in.nextInt();
        /*if (l3 <= 0) {
            System.out.println("Valor do lado 3 inválido");
            return;
        }*/

        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Triângulo inválido, pelo menos um dos lados é 0 ou negativo");
        } else if (l1 > l2 + l3 || l2 > l1 + l3 || l3 > l1 + l2) {
            System.out.println("Triângulo inválido, pelo menos um dos lados é maior que a soma dos outros 2");
        } else {
            if (l1 == l2 && l1 == l3/* && l2 == l3*/) {
                System.out.println("Triângulo equilátero");
            } else if (l1 != l2 && l1 != l3 && l2 != l3) {
                System.out.println("Triângulo escaleno");
            } else /*if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) */ {
                System.out.println("Triângulo isósceles");
            }
        }

    }
}