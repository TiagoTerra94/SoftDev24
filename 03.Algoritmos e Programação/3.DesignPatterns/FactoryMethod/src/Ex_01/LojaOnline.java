package Ex_01;

import Ex_01.Produtos.Produto;

import java.util.ArrayList;

public class LojaOnline {
    private String nome;
    private ArrayList<Produto> stock;

    public LojaOnline(String nome) {
        this.nome = nome;
        this.stock = new ArrayList<>();
    }

    public void adicionarStock(Produto novoProduto){
        this.stock.add(novoProduto);
    }

    public void exibirStock(){
        for(Produto produtoAtual: this.stock){
            produtoAtual.exibir();
        }
    }
}
