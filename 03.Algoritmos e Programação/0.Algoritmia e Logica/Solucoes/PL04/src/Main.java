import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static int saldo = 8;
    static String nome = "";

    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        nome = in.nextLine();

        int op = 1;
        while (op != 0) {
            System.out.println("Bem-vindo, " + nome + " \t Saldo: " + saldo);
            System.out.println("Selecione uma das seguintes opções:");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinhas");
            System.out.println("3-Gestão conta");
            System.out.println("0-Sair");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    Lotaria();
                    break;
                case 2:
                    Raspadinhas();
                    break;
                case 3:
                    GestaoConta();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void GestaoConta() {
        int op = 1;
        while (op != 0) {
            System.out.println("Bem-vindo \t Saldo: " + saldo);
            System.out.println("Selecione uma das seguintes opções:");
            System.out.println("1-Levantamento");
            System.out.println("2-Depósito");
            System.out.println("3-Ver Saldo");
            System.out.println("4-Mudar nome");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    Levantamento();
                    break;
                case 2:
                    Deposito();
                    break;
                case 3:
                    VerSaldo();
                    break;
                case 4:
                    MudarNome();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void MudarNome() {
        in = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = in.nextLine();
    }

    private static void Raspadinhas() {
        int op = 1;
        while (op != 0) {
            System.out.println("Bem-vindo \t Saldo: " + saldo);
            System.out.println("Selecione uma das seguintes opções:");
            System.out.println("1-Raspadinha A");
            System.out.println("2-Raspadinha B");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    RaspadinhaA();
                    break;
                case 2:
                    RaspadinhaB();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void RaspadinhaB() {
        if (saldo - 2 < 0) {
            System.out.println("Saldo insuficiente, carregue antes de jogar");
            return;
        }
        saldo -= 2;

        int numeroPrincipal = rnd.nextInt(1, 11);
        int premio = rnd.nextInt(1, 101);
        int contador = 0;
        System.out.println("Número principal: " + numeroPrincipal + " | Prémio: " + premio);

        for (int i = 0; i < 9; i++) {
            int numero = rnd.nextInt(1, 11);
            if (numero == numeroPrincipal) {
                contador++;
            }
            System.out.print(numero + "\t");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        if (contador >= 3) {
            System.out.println("Parabéns ganhou: " + premio);
            saldo += premio;
        } else {
            System.out.println("Raspadinha não premiada");
        }
    }

    private static void RaspadinhaA() {
        if (saldo - 2 < 0) {
            System.out.println("Saldo insuficiente, carregue antes de jogar");
            return;
        }
        saldo -= 2;

        int premioTotal = 0;
        int numeroPrincipal = rnd.nextInt(1, 11);

        System.out.println("Número principal: " + numeroPrincipal);
        for (int i = 1; i <= 5; i++) {
            int num = rnd.nextInt(1, 11);
            int premio = rnd.nextInt(1, 101);

            if (numeroPrincipal == num) {
                premioTotal += premio;
            }
            System.out.println(i + "º número: " + num + "\t(" + premio + ")");
        }
        System.out.println("Prémio total: " + premioTotal);
        saldo += premioTotal;

        /*int num1 = rnd.nextInt(1, 11);
        int num2 = rnd.nextInt(1, 11);
        int num3 = rnd.nextInt(1, 11);
        int num4 = rnd.nextInt(1, 11);
        int num5 = rnd.nextInt(1, 11);
        int premio1 = rnd.nextInt(1, 101);
        int premio2 = rnd.nextInt(1, 101);
        int premio3 = rnd.nextInt(1, 101);
        int premio4 = rnd.nextInt(1, 101);
        int premio5 = rnd.nextInt(1, 101);

        if (numeroPrincipal == num1) {
            premioTotal += premio1;
        }
        if (numeroPrincipal == num2) {
            premioTotal += premio2;
        }
        if (numeroPrincipal == num3) {
            premioTotal += premio3;
        }
        if (numeroPrincipal == num4) {
            premioTotal += premio4;
        }
        if (numeroPrincipal == num5) {
            premioTotal += premio5;
        }*/

        /*System.out.println("Número principal: " + numeroPrincipal);
        System.out.println("1º número: " + num1 + "(" + premio1 + ")");
        System.out.println("2º número: " + num2 + "(" + premio2 + ")");
        System.out.println("3º número: " + num3 + "(" + premio3 + ")");
        System.out.println("4º número: " + num4 + "(" + premio4 + ")");
        System.out.println("5º número: " + num5 + "(" + premio5 + ")");
        System.out.println("Prémio total: " + premioTotal);*/
    }

    private static void Lotaria() {
        if (saldo - 5 < 0) {
            System.out.println("Saldo insuficiente, carregue antes de jogar");
            return;
        }
        saldo -= 5;
        int numeroPremiado = rnd.nextInt(1000, 10000);
        //System.out.println("Número premiado: " + numeroPremiado);

        /*int numero;
        do {
            System.out.println("Escolha um número entre 1000 e 9999");
            numero = in.nextInt();

            if (numero < 1000 || numero > 9999) {
                System.out.print("Número inválido, tente novamente. ");
            }
        } while (numero < 1000 || numero > 9999);*/

        System.out.println("Escolha um número entre 1000 e 9999");
        int numero = in.nextInt();

        while (numero < 1000 || numero > 9999) {
            System.out.print("Número inválido, tente novamente. ");
            numero = in.nextInt();
        }

        System.out.println("Número premiado: " + numeroPremiado);

        if (numero == numeroPremiado) {
            System.out.println("Parabéns ganhou o 1º prémio, acertou no número premiado");
            saldo += 10000;
        } else if (numero % 1000 == numeroPremiado % 1000) {
            System.out.println("Parabéns ganhou o 2º prémio");
            saldo += 1000;
        } else if (numero % 100 == numeroPremiado % 100) {
            System.out.println("Parabéns ganhou o 3º prémio");
            saldo += 100;
        } else {
            System.out.println("Bilhete não premiado");
        }

    }

    private static void VerSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    private static void Deposito() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Qual o valor a depositar?");
        int valor = in.nextInt();

        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            saldo += valor;
            System.out.println("Novo saldo: " + saldo);
        }
    }

    private static void Levantamento() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Qual o valor a levantar?");
        int valor = in.nextInt();

        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}