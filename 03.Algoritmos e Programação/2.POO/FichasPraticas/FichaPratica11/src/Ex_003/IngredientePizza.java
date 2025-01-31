package Ex_003;

import Ex_003.Enums.UnidadeMedida;

import java.util.ArrayList;

public class IngredientePizza{
    //Atributos de Instancia
    protected Ingredientes ingredientes;
    protected double quantidade;


    //Metodo Construtor
    public IngredientePizza(Ingredientes ingredientes, double quantidade) {
        this.ingredientes = ingredientes;
        this.quantidade = quantidade;
    }

    //Metodo de Acesso

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    //Metodo de instancia
    public void exibirDetalhes(){
        ingredientes.exibirDetalhes();
        System.out.print(": " + this.quantidade + ingredientes.getUnidadeMedidadeAbrev());
    }
}
