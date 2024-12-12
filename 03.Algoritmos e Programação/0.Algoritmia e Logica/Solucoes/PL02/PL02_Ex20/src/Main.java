import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 20. Crie um programa que permita converter um valor
        // em dias para anos, semanas e dias.

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o número total de dias");
        int totalDias = in.nextInt();

        int anos = totalDias / 365;
        int resto = totalDias % 365;
        int semanas = resto / 7;
        int dias = resto % 7;

        //System.out.println(totalDias + " dias são " + anos + " anos, " + semanas + " semanas e " + dias + " dias");

        String mensagem = totalDias + " dias são ";
        if (anos > 1)
            mensagem += anos + " anos, ";
        else if (anos == 1)
            mensagem += "1 ano, ";

        if (semanas > 1) {
            mensagem += semanas + " semanas, ";
        } else if (semanas == 1) {
            mensagem += "1 semana, ";
        }

        if (dias > 1) {
            mensagem += dias + " dias";
        } else if (dias == 1) {
            mensagem += "1 dia";
        }
        System.out.println(mensagem);
    }
}