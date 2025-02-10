import Enums.OrigemTopping;
import Enums.TipoVegetal;
import Enums.UnidadeMedida;

public class Vegetal extends Topping{
    //Atributos de instancia
    protected TipoVegetal vegetal;

    //Metodo Construtor
    public Vegetal(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, OrigemTopping origem, TipoVegetal vegetal) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.vegetal = vegetal;
    }
}
