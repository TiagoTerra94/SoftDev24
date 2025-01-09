package Ex_11;

public class Conta {
    //Atributos de instancia
    private int numeroconta;
    private double saldo;
    private String titular;


    //Metodos Construtores
    public Conta(int numeroconta, double saldo, String titular) {
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.titular = titular;
    }


    //Metodos de Acesso


    //Métodos de Instancia
    public void transferir(double valor, Conta destino) {

    }

    public void deposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito com sucesso!");
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Levantamento com sucesso!");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo da conta nº" + this.numeroconta + ": " + this.saldo + " EUR");
    }

}
