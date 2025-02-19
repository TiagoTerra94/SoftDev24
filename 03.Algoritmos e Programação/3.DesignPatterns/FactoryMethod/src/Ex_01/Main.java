package Ex_01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LojaOnline top = new LojaOnline("Top");

        top.adicionarStock(ProdutoFactory.criarProduto("Livro","got",23.00));
        top.adicionarStock(ProdutoFactory.criarProduto("Roupa","camisa",5.99));
        top.adicionarStock(ProdutoFactory.criarProduto("Eletronico","laptop",1000.00));

        top.exibirStock();
    }
}