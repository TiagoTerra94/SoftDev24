package Ex_01;

import Ex_01.Produtos.Electronico;
import Ex_01.Produtos.Livro;
import Ex_01.Produtos.Produto;
import Ex_01.Produtos.Roupa;

public class ProdutoFactory {


    public static Produto criarProduto(String categoria, String nome, Double preco){

        switch (categoria){
            case "Livro":
                return new Livro(nome,preco);
            case "Eletronico":
                return new Electronico(nome,preco);
            case "Roupa":
                return new Roupa(nome,preco);
            default:
                throw new IllegalArgumentException();
        }

    }

}
