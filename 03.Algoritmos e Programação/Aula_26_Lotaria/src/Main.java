import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    static int saldo = 100;
    static int dinheiro;

    public static void main(String[] args) {
        int option;
        String nome;
        System.out.println("Qual é o seu nome?");
        nome = in.nextLine();

        do {
            System.out.println("Bem-vindo " + nome +
                    "\n" +
                    "Qual é a sua opçao?\n" +
                    "1- Lotaria\n" +
                    "2- Raspadinhas\n" +
                    "3- Ver saldo\n" +
                    "4- Depositar\n" +
                    "5- Levantar\n" +
                    "0- Sair");

            option = in.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    Lotaria();
                    break;
                case 2:
                    Raspadinhas();
                    break;
                case 3:
                    Saldo();
                    break;
                case 4:
                    Levantamento();
                    break;
                case 5:
                    Depósito();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);
    }

    private static void Depósito() {
        System.out.println("Aplicação 4: Depósito\n" +
                "1- Depositar.\n" +
                "0- Voltar ao Menu Anterior");
        int option = 0;
        int valorDeposito = 0;

        switch (option){
            case 0:
                break;
            case 1:
                System.out.println("Montante a depositar: ");
                valorDeposito = in.nextInt();
        }

        saldo = saldo + valorDeposito;
    }

    private static void Levantamento() {
        System.out.println("Quanto quer levantar?");
        int valorLevantamento = in.nextInt();
        int subtracao = valorLevantamento - saldo;

        if(subtracao <= 0){
            System.out.println("Não tem saldo suficiente!");
        } else {
            saldo = saldo - valorLevantamento;
            System.out.println("Operação concluída. Obrigado!");
        }
    }


    private static void Raspadinhas() {
        System.out.println("Aplicação 2: Raspadinhas\n" +
                "1- Raspadinhas Pré-Definidas\n" +
                "2- Raspadinhas Random\n" +
                "0- Voltar ao Menu Anterior");
        int option = in.nextInt();

        switch (option){
            case 0:
                break;
            case 1:
                Raspadinhas_1();
                break;
            case 2:
                Raspadinhas_2();
                break;
        }

    }

    private static void Raspadinhas_2() {
        saldo = saldo - 2;
        int num_principal = rnd.nextInt(1, 11);
        int counter = 0;

        System.out.println("Número principal: " + num_principal);

        //ciclo para generar números e valores atribuidos
        for(int i = 0; i < 10; i++){
            int n = rnd.nextInt(1, 11);
            int valor_raspadinha = rnd.nextInt(1, 11);

            System.out.println(n + "(" + valor_raspadinha + "€)");

            if (num_principal == n){
                dinheiro += valor_raspadinha;
                counter++;
            }
        }

        //contador, para saber se ganhou
        if(counter >= 3){
            System.out.println("Prémio: " + dinheiro + "€");
        }else {
            System.out.println("Azar! Não foi desta!");
        }

        //menu para jogar novamente
        System.out.println("Quer jogar novamente?\n" +
                "1- Sim\n" +
                "2- Não");
        int option = in.nextInt();

        switch (option){
            case 0:
                break;
            case 1:
                Raspadinhas_2();
                break;
            case 2:
                break;
        }


    }

    private static void Raspadinhas_1() {
        saldo = saldo - 2;
        int num_principal = 3;

        //processo de ciclo para numero e valores de raspadinhas
        for(int i = 1; i <= 5; i++) {
            int n = rnd.nextInt(1, 11);
            int valor_raspadinha = rnd.nextInt(1, 100);
            System.out.println(i + "º numero: " + n + " (" + valor_raspadinha + "€) ");

            if (num_principal == n) {
                dinheiro += valor_raspadinha;
            }
        }

        //validação para saber se ganhou ou não dinheiro
        if(dinheiro > 0) {
            System.out.println("Prémio: " + dinheiro + "€");
        } else{
            System.out.println("Azar! Não foi desta!");
        }

        //menu para jogar novamente
        System.out.println("Quer jogar novamente?\n" +
                "1- Sim\n" +
                "2- Não");
        int option = in.nextInt();

        switch (option){
            case 0:
                break;
            case 1:
                Raspadinhas_1();
                break;
            case 2:
                Saldo();
                break;
        }
    }

    private static void Lotaria() {
        saldo = saldo - 5;
        int n_premio = rnd.nextInt(1000, 9999);
        int premio_1 = n_premio;
        int premio_2 = n_premio % 1000;
        int premio_3 = n_premio % 100;
        int num_sorteado;

            //Escolher numero para lotaria
            System.out.println("Aplicação 1: Lotaria\n" +
                    "Escolha um número acima de 1000: ");
            num_sorteado = in.nextInt();

            //validação para saber se é +1000
            while (num_sorteado < 1000) {
                System.out.println("Número inválido! Insira outro número:");
                num_sorteado = in.nextInt();
            }

            //sorteio
            if (num_sorteado == premio_1) {
                System.out.println("Parabéns! Você ganhou o primeiro prémio!");
            } else if (num_sorteado == premio_2) {
                System.out.println("Parabéns! Você ganhou o segundo prémio!");
            } else if (num_sorteado == premio_3) {
                System.out.println("Parabéns! Você ganhou o terceiro prémio!");
            } else {
                System.out.println("Azar! Tente novamente na próxima!");
            }

    }

    private static void Saldo() {
        saldo = saldo + dinheiro;
        System.out.println("O seu saldo é: " + saldo + "€");
    }
}