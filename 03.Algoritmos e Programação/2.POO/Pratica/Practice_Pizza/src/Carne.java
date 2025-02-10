import Enums.OrigemTopping;
import Enums.TipoCarne;
import Enums.UnidadeMedida;

public class Carne extends Topping{
    //Atributos de instancia
    protected TipoCarne carne;

    //Metodo Construtor
    public Carne(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, OrigemTopping origem, TipoCarne carne) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.carne = carne;
    }
}
