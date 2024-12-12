import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("Bem-vindo");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Calculadora");
            System.out.println("2-Lista de números");
            System.out.println("3-Calendário");
            System.out.println("4-Dizer Olá");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                break;
            } else if (op == 1) {
                Calculadora();
            } else if (op == 2) {
                ListaNumeros();
            } else if (op == 3) {
                Calendario();
            } else if (op == 4) {
                DizerOla();
            } else {
                System.out.println("Opção invalida");
            }
        } while (op != 0);
    }

    private static void Calendario() {
        int op;
        do {
            System.out.println("Aplicação 3: Calendário");
            System.out.println("1-Ano Bissexto");
            System.out.println("2-Conversor Dias");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    AnoBissexto();
                    break;
                case 2:
                    ConversorDias();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 0);
    }

    private static void ConversorDias() {
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

    private static void AnoBissexto() {
        System.out.println("Insira um ano");
        int ano = in.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }

    private static void DizerOla() {
        String nome = JOptionPane.showInputDialog("Insira o seu nome");
        JOptionPane.showMessageDialog(null, "Olá " + nome);
    }

    private static void Calculadora() {
        int op = 1;
        while (op != 0) {
            System.out.println("Aplicação 1: Calculadora");
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    //Somar();
                    Operacao("+");
                    break;
                case 2:
                    //Subtrair();
                    Operacao("-");
                    break;
                case 3:
                    //Multiplicar();
                    Operacao("*");
                    break;
                case 4:
                    //Dividir();
                    Operacao("/");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void Operacao(String operacao) {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();
        double resultado = switch (operacao) {
            case "+" -> numero1 + numero2;
            case "-" -> numero1 - numero2;
            case "*" -> numero1 * numero2;
            default -> numero1 / numero2;
        };

        /*if (operacao == "+") {
            resultado = numero1 + numero2;
        } else if (operacao == "-") {
            resultado = numero1 - numero2;
        } else if (operacao == "*") {
            resultado = numero1 * numero2;
        } else {
            resultado = numero1 / numero2;
        }*/

        System.out.println("O resultado é: " + resultado);
    }

    private static double PedirNumero() {
        System.out.println("Insira um número");
        return in.nextDouble();
        /*double numero = in.nextDouble();
        return numero;*/
    }

    private static void Dividir() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double divisao = numero1 / numero2;
        System.out.println("A divisão é: " + divisao);
    }

    private static void Multiplicar() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double multiplicacao = numero1 * numero2;
        System.out.println("O produto é: " + multiplicacao);
    }

    private static void Subtrair() {
        /*System.out.println("Insira um número");
        double numero1 = in.nextDouble();

        System.out.println("Insira outro número");
        double numero2 = in.nextDouble();*/
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double subtracao = numero1 - numero2;
        System.out.println("A substração é: " + subtracao);
    }

    private static void Somar() {
        /*System.out.println("Insira um número");
        double numero1 = in.nextDouble();

        System.out.println("Insira outro número");
        double numero2 = in.nextDouble();*/
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
    }

    private static void ListaNumeros() {
        System.out.println("Insira o limite inferior");
        int liminf = in.nextInt();

        System.out.println("Insira o limite superior");
        int limsup = in.nextInt();

        // TROCAR VALORES SE MENOR FOR LIMSUP
        /*if(liminf > limsup){
            int temp = limsup;
            limsup = liminf;
            liminf = temp;
        }

        for (int i = liminf; i <= limsup; i++) {
            System.out.println(i);
        }*/
        // ---------------------------------------

        if (liminf < limsup) {
            for (int i = liminf; i <= limsup; i++) {
                System.out.print(i + "\t");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }
        } else {
            for (int i = liminf; i >= limsup; i--) {
                System.out.print(i + "\t");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }
            // APRESENTA CICLO DO SUPERIOR (menor) PARA O INFERIOR (maior)
            /*for (int i = limsup; i <= liminf; i++) {
                System.out.println(i);
            }*/
        }
        System.out.println();
    }

}