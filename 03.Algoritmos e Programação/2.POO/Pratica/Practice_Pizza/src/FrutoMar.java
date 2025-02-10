import Enums.OrigemTopping;
import Enums.TipoFrutoMar;
import Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    //Atributos de instancia
    protected TipoFrutoMar mar;

    //Metodo Construtor
    public FrutoMar(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, OrigemTopping origem, TipoFrutoMar mar) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.mar = mar;
    }
}
