import Enums.OrigemTopping;
import Enums.UnidadeMedida;

public class Topping extends Ingredientes {
    //Atributos de instancia
    protected OrigemTopping origem;

    //Metodo Construtor
    public Topping(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal, OrigemTopping origem) {
        super(codigo, nome, unidadeMedida, kcal);
        this.origem = origem;
    }
}
