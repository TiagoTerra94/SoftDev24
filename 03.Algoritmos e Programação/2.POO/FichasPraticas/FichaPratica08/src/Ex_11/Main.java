package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta cont1 = new Conta(23482,3500.50,"Diogo Ferreira");
        Conta cont2 = new Conta(18234, 1587.00, "Mariana Alves");
        Conta cont3 = new Conta(19678,3200.10,"Mario Rui");

        cont1.deposito(1000);
        cont1.mostrarSaldo();
        cont1.levantar(120);
        cont1.mostrarSaldo();

        cont1.transferir(1000,cont2);
        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();




    }
}
