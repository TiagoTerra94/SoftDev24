import Enums.BasePizza;
import Enums.UnidadeMedida;

public class Base extends Ingredientes{
    //Atributos de Instancia
    protected BasePizza tipoBase;
    protected String descricao;

    //Metodo Construtor
    public Base(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, BasePizza tipoBase, String descricao) {
        super(codigo, nome, unidadeMedida, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
