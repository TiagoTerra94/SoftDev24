import Enums.OrigemTopping;
import Enums.TipoQueijo;
import Enums.UnidadeMedida;

public class Queijo extends Topping{
    //Atributos de instancia
    protected TipoQueijo quejo;

    //Metodo Construtor
    public Queijo(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, OrigemTopping origem, TipoQueijo quejo) {
        super(codigo, nome, unidadeMedida, kcal, origem);
        this.quejo = quejo;
    }
}
