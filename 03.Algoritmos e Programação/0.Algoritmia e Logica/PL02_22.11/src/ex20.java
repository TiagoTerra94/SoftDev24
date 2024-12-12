import java.util.Scanner;

//Crie um programa que permita converter o valor em dias
//para anos, semanas e dias
public class ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o número de dias que quer converter: ");
        int total_dias = in.nextInt();

        int anos = total_dias/365;
        int resto = total_dias % 365;
        int semanas = resto/7;
        int dias = resto % 7;


        //System.out.println(total_dias + "são" + anos + " anos," + semanas + " semanas, " + dias + " dias." );

        String mensagem = total_dias + "dias são";

        if(anos > 1){
            mensagem += "anos, ";
        } else if (anos == 1) {
            mensagem = "1 ano, ";
        }

        if (semanas > 1){
            mensagem += + "semanas, ";
        } else if (semanas == 1) {
            mensagem += "1 semana, ";
        }

        if (dias > 1){
            mensagem += + "dias";
        } else if (dias == 1) {
            mensagem += "1 dia ";
        }
    }
}