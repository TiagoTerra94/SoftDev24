package Ex_09;

public class Produto {
    //Atributos de instancia
    private String nome;
    private double preco;
    private int quantidade = 0;

    //Metodos construtores
    public Produto( String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Metodos de acesso
    public int getQuantidade() {

        return quantidade;
    }

    //Metodos de instancia
    public void comprar(int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Compra efetuada com sucesso. \nQuantidade: " + quantidade + " unidades de " + this.nome);

    }

    public void vender(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Não há stock disponível.");
        }else{
            System.out.println("Venda efetuada com sucesso.");
        this.quantidade -= quantidade;
        }
    }

    public void exibirDetalhes(){
        System.out.println("Produto: " + this.nome + " Preco: " + this.preco + " Stock: " + this.quantidade);
    }
}
