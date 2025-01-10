package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Café",2.50);


        produto1.exibirDetalhes();
        System.out.println("-----------");

        produto1.comprar(30);
        produto1.vender(10);
        System.out.println("-----------");

        produto1.exibirDetalhes();
    }
}
