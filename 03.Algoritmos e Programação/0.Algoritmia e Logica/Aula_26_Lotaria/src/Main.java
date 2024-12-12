import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    static int saldo = 100;

    public static void main(String[] args) {
        int option;
        String nome;
        System.out.println("Qual é o seu nome?");
        nome = in.nextLine();

        do {
            System.out.println("Bem-vindo " + nome + ("!\n"
                    + "Saldo:") + saldo +
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
                    verSaldo();
                    break;
                case 4:
                    Depósito();
                    break;
                case 5:
                    Levantamento();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);
    }

    private static void Depósito() {
        System.out.println("Aplicação 4: Depositar\n" +
                "1- Depositar.\n" +
                "0- Voltar ao menu anterior");

        int option = in.nextInt();
        int valorDeposito = 0;

        //falta validar montantes negativos e 0
        if(option == 0) {
            return;
        } else if (option == 1) {
            System.out.println("Montante a depositar: ");
            valorDeposito = in.nextInt();
        } else {
            System.out.println("Opção inválida!");
        }

        saldo = saldo + valorDeposito;
    }

    private static void Levantamento() {
        System.out.println("Aplicação 5: Levantar\n" +
                "1- Levantar\n" +
                "0- Voltar ao menu anterior");

        int option = in.nextInt();
        int valorLevantamento = 0;
        int subtracao;

        //falta validar montantes negativos e 0
        if(option == 0) {
            return;
        } else if (option == 1) {
            System.out.println("O seu saldo:" + saldo);
                System.out.println("Qual o montante a levantar?");
                valorLevantamento = in.nextInt();
        }else {
            System.out.println("Opção inválida!");
        }

        subtracao = saldo - valorLevantamento;

        if(subtracao <= 0){
            System.out.println("Não tem saldo suficiente!");
        } else {
            saldo = saldo - valorLevantamento;
            System.out.println("Operação concluída. Obrigado!");
        }
    }


    private static void Raspadinhas() {
        System.out.println("Aplicação 2: Raspadinhas\n" +
                "1- Raspadinhas A\n" +
                "2- Raspadinhas B\n" +
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
        if(saldo - 2 < 0){
            System.out.println("Saldo insuficiente carregue para jogar.");
            return;
        }else{
            saldo = saldo - 2;
        }

        int num_principal = rnd.nextInt(1, 11);
        int counter = 0;
        int premio = 0;

        System.out.println("Número principal: " + num_principal);

        //ciclo para generar números e valores atribuidos
        for(int i = 0; i < 10; i++){
            int n = rnd.nextInt(1, 11);
            int valor_raspadinha = rnd.nextInt(1, 101);

            System.out.println(n + "(" + valor_raspadinha + "€)");

            if (num_principal == n){
                premio += valor_raspadinha;
                counter++;
            }
        }

        //contador, para saber se ganhou
        if(counter == 3){
            System.out.println("Prémio: " + premio + "€");
            saldo += premio;
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
        if(saldo - 2 < 0){
            System.out.println("Saldo insuficiente carregue para jogar.");
            return;
        }else{
            saldo = saldo - 2;
        }

        int num_principal = rnd.nextInt(1, 11);
        int premio = 0;
        System.out.println("Numero principal: " + num_principal);

        //processo de ciclo para numero e valores de raspadinhas
        for(int i = 1; i <= 5; i++) {
            int n = rnd.nextInt(1, 11);
            int valor_raspadinha = rnd.nextInt(1, 100);
            System.out.println(i + "º numero: " + n + " (" + valor_raspadinha + "€) ");

            if (num_principal == n) {
                premio += valor_raspadinha;
            }
        }

        //validação para saber se ganhou ou não dinheiro
        if(premio > 0) {
            System.out.println("Prémio: " + premio + "€");
            saldo += premio;
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
                break;
        }
    }

    private static void Lotaria() {
        if(saldo - 5 < 0){
            System.out.println("Saldo insuficiente carregue para jogar.");
            return;
        }else{
            saldo = saldo - 5;
        }
        int n_premio = rnd.nextInt(1000, 10000);
        //System.out.println("Numero premiado: " + n_premio);
        int premio_1 = n_premio;
        int premio_2 = n_premio % 1000;
        int premio_3 = n_premio % 100;
        int num_sorteado;

            //Escolher numero para lotaria
            System.out.println("Aplicação 1: Lotaria\n" +
                    "Escolha um número acima de 1000: ");
            num_sorteado = in.nextInt();

            //validação para saber se é +1000
            while (num_sorteado < 1000 || num_sorteado > 9999) {
                System.out.println("Número inválido! Insira outro número:");
                num_sorteado = in.nextInt();
            }

            //sorteio
            if (num_sorteado == premio_1) {
                System.out.println("Parabéns! Você ganhou o 1º prémio!");
                saldo = saldo + 1000;
            } else if (num_sorteado % 1000 == premio_2) {
                System.out.println("Parabéns! Você ganhou o 2º prémio!");
                saldo = saldo + 100;
            } else if (num_sorteado % 100 == premio_3) {
                System.out.println("Parabéns! Você ganhou o 3º prémio!");
                saldo = saldo + 10;
            } else {
                System.out.println("Azar! Tente novamente na próxima!");
            }

    }

    private static void verSaldo(){
        System.out.println("Aplicação 3: Ver Saldo\n" +
                "Saldo: " + saldo + "\n" +
                "0 - Voltar ao menu anterior");
        int option = in.nextInt();

        if (option == 0){
            return;
        }else {
            System.out.println("Opção inválida!");
        }
    }
}