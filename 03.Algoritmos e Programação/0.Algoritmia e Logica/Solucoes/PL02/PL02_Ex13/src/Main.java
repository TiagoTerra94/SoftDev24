import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 12. Utilize a estrutura SE para fazer um programa que retorne o nome de
        // um produto a partir do código do mesmo.
        // Considere os seguintes códigos:
        // • 001 - Parafuso;
        // • 002 - Porca;
        // • 003 - Prego;
        // • Para qualquer outro código indicar “Não definido”.

        // 13. Refaça o exercício anterior usando a estrutura LER-CASO.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o código do produto");
        int codigo = in.nextInt();

        /*if (codigo == 1) {
            System.out.println("001-Parafuso");
        } else if (codigo == 2) {
            System.out.println("002-Porca");
        } else if (codigo == 3) {
            System.out.println("003-Prego");
        } else {
            System.out.println("Não definido");
        }*/

        switch (codigo) {
            case 001:
                System.out.println("001-Parafuso");
                break;
            case 002:
                System.out.println("002-Porca");
                break;
            case 003:
                System.out.println("003-Prego");
                break;
            default:
                System.out.println("Não definido");
                break;
        }
    }
}