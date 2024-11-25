import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PL_03 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int option; //instanciar sempre em casos de do e while

        do {
            System.out.println("Bem-vindo\n Escolha uma das seguintes opções: " +
                    "\n 1- Calculadora" +
                    "\n 2- Lista de números" +
                    "\n 3- Calendário" +
                    "\n 4- Converter temperatura" +
                    "\n 0- Sair");
            option = in.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    Calculadora();
                    break;
                case 2:
                    ListaDeNumeros();
                    break;
                case 3:
                    Calendario();
                    break;
                case 4:
                    Conversor_Temp();
                    break;
                default:
                    System.out.println("Opção inválida!");;
                    break;
            }
        }while(option !=0);

    }

    private static void Calculadora(){
        int option = 1;

        while(option != 0) {
            System.out.println("Aplicação 1: Calculadora" +
                    "\n1- Somar" +
                    "\n2- Subtrair" +
                    "\n3- Multiplicar" +
                    "\n4- Dividir" +
                    "\n0- Voltar ao menu anterior");

            option = in.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    Soma();
                    break;
                case 2:
                    Subtrair();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                default:
                    System.out.println("Opção inválida!");;
                    break;
            }
        }
    }

    private static void ListaDeNumeros(){
        System.out.println("Insira o primeiro número da lista a imprimir: ");
        int a = in.nextInt();
        System.out.println("Insira o último número da lista: ");
        int b = in.nextInt();

        //processo entre a e b, onde imprime o número a seguir
        if(a > b) {
            for (int i = a; i > b; i--) {
                System.out.println(i);
            }
        }else if(a < b) {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
    }

    private static void Calendario() {
        //saber se o ano é bissexto ou nao
        System.out.println("Insira o ano: ");
        int ano = in.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 ==0) && (ano % 100 != 0))){
            System.out.println("Ano é bissexto.");
        }else{
            System.out.println("Ano " + ano + " não é bissexto.");
        }

        //transformar conjunto de dias, em ano, semanas e dias
        System.out.println("Insira o número de dias que quer converter: ");
        int total_dias = in.nextInt();

        int anos = total_dias/365;
        int resto = total_dias % 365;
        int semanas = resto/7;
        int dias = resto % 7;

        System.out.println(total_dias + "são" + anos + " anos," + semanas + " semanas, " + dias + " dias." );
    }

    private static void Conversor_Temp() {
        System.out.println("Que tipo de temperatura quer converter?" +
                "\n1- Celsius" +
                "\n2- Farhrenheit");
        int option = in.nextInt();

        if (option == 0){
            return;
        } else if (option == 1) {
            System.out.println("Insira a temperatura a converter para Farhenheit:");
            int temp_C = in.nextInt();

            double Fahrenheit = (temp_C * 1.8) + 32;
            System.out.println("A temperatura de " + temp_C + "ºC é igual a " + Fahrenheit + "ºF" );
        } else if (option == 2) {
            System.out.println("Insira a temperatura a converter para Celsius:");
            int temp_F = in.nextInt();

            double Celsius = (temp_F - 32) * 5/9;
            System.out.println("A temperatura de" + temp_F + "ºF é igual a " + Celsius + "ºC" );
        }else{
            System.out.println("Opção inválida.");
        }
    }

    private static void Soma(){
        System.out.println("Insira o primeiro número: ");
        int a = in.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = in.nextInt();
        System.out.println("A soma dos números é: " + (a + b));
    }
    private static void Subtrair(){
        System.out.println("Insira o primeiro número: ");
        int a = in.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = in.nextInt();
        System.out.println("A diferença dos números é: " + (a - b));
    }
    private static void Multiplicar() {
        System.out.println("Insira o primeiro número: ");
        int a = in.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = in.nextInt();
        System.out.println("A multiplicação dos números é: " + (a * b));
    }
    private static void Dividir() {
        System.out.println("Insira o primeiro número: ");
        int a = in.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = in.nextInt();
        System.out.println("A divisão dos números é: " + (a / b));
    }

}