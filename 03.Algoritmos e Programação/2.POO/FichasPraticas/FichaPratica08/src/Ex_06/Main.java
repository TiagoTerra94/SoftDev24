package Ex_06;

public class Main {
    public static void main(String[] args) {
        Calculadora cl = new Calculadora();

        System.out.println("Soma:" + cl.soma(3,4));
        System.out.println("Subtração: " + cl.substracao(10,5));
        System.out.println("Multiplicação: " + cl.multiplicacao(2,3));
        System.out.println("Divisão: " + cl.divisao(10,5));
    }
}
