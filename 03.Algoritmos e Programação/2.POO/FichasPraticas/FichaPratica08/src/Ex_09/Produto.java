package Ex_09;

public class Produto {
    //Atributos de instancia
    private String nome;
    private double preco;
    private int quantidade = 0;

    //Metodos construtores
    public Produto( String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodos de acesso
    public int getQuantidade() {
        return quantidade;
    }

    //Metodos de instancia
    public double comprar(int quantidade) {
        if(quantidade > this.quantidade){
            System.out.println("Não há stock disponível");
        }else {
            System.out.println("Compra efetuada com sucesso.");
            return this.quantidade += quantidade;
        }
        return 0;
    }

    public double vender(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Não há stock disponível.");
        }else{
            System.out.println("Venda efetuada com sucesso.");
        return this.quantidade -= quantidade;
        }
        return 0;
    }
}
