import java.util.ArrayList;

public class IngredientesPizza {
    //Atributos de instancia
    protected int quantidade;
    protected Ingredientes ingredientes;

    //Metodo Construtor
    public IngredientesPizza(int quantidade, Ingredientes ingredientes) {
        this.quantidade = quantidade;
        this.ingredientes = ingredientes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

}
