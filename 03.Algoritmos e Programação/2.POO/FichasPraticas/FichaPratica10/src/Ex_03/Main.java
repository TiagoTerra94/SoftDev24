package Ex_03;

public class Main {
    public static void main(String[] args) {
        Peixe sardinha = new Peixe("sardinha",50,6.99);
        Peixe dourada = new Peixe("dourada",100,9.99);
        Peixe robalo = new Peixe("robalo", 250,15.99);

        Marisco camarao = new Marisco("camarao",150,12.99);
        Marisco ameijoa = new Marisco("ameijoa", 125, 8.99);
        Marisco lagosta = new Marisco("lagosta", 25, 20.99);

        BarcoPesca barco1 = new BarcoPesca("Santa Joana","azul",2001,10,400,Marca.BENTZ);

        barco1.exibirDetalhes();

        barco1.pescarPeixe(sardinha);
        barco1.pescarPeixe(robalo);
        barco1.pescarPeixe(dourada);

        barco1.pescarMarisco(camarao);

        barco1.largarPeixe(robalo);
        barco1.pescarMarisco(camarao);

        barco1.exibirDetalhes();

    }
}
