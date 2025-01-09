package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Café",2.50,10);

        produto1.comprar(5);
        produto1.vender(2);
        System.out.println(produto1.getQuantidade());
        produto1.comprar(10);
        produto1.vender(35);
    }
}
