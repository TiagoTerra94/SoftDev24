package Ex_02;

public class Main {
    public static void main(String[] args) {

        Conta cont1 = new Conta("23482","Diogo Ferreira");
        Conta cont2 = new Conta("18234",  "Mariana Alves");
        Conta cont3 = new Conta("19678","Mario Rui");

        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();

        cont1.deposito(1000);
        cont3.deposito(50);

        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();

        cont1.levantar(150);
        cont2.levantar(2000);

        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();

        cont1.transferir(100,cont2);

        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();

        cont1.pedirEmprestimo(300);
        cont2.pedirEmprestimo(100);

        cont1.mostrarSaldo();
        cont2.mostrarSaldo();
        cont3.mostrarSaldo();



    }
}
