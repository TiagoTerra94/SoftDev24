package Ex_02;

public class Conta {
    //Atributos de instancia
    private String numeroconta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2023;
    private double valorDivida = 0;


    //Metodos Construtores
    public Conta(String numeroconta, String titular) {
        this.numeroconta = numeroconta;
        this.titular = titular;
    }


    //Metodos de Acesso
    public double getMargemEmprestimo() {
        return this.saldo * 0.9;
    }

    //Métodos de Instancia
    public void transferir(double valor, Conta contaDestino) {//interação entre objetos
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor; //adiciona o dinheiro ao destinatario. O saldo do objeto é alterado.
            System.out.println("Transferencia efetuada de " + this.numeroconta + " para " + contaDestino.numeroconta);
        }else{
            System.out.println("Saldo insuficiente.");
        }

    }

    public void deposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito na conta nº" + this.numeroconta + " realizado com sucesso!");
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Levantamento com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo da conta nº" + this.numeroconta + ": " + this.saldo + " EUR | Margem de Empréstimo: " + this.getMargemEmprestimo());
    }

    public boolean pedirEmprestimo(double valorPedir){

        if(this.valorDivida != 0 || valorPedir > (this.getMargemEmprestimo())){
            System.out.println("Não foi possível efetuar a operação.");
            return false;
        }else{
            System.out.println("Empréstimo efetuado com sucesso.");
            this.saldo += valorPedir;
            this.valorDivida = valorPedir;
            return true;
        }

    }

}
