package Ex_01.Produtos;

public class Electronico extends Produto {
    public Electronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibir() {
        System.out.println("Electronico: " + this.nome);
    }


}
