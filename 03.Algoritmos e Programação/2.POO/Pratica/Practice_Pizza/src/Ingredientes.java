import Enums.UnidadeMedida;

public class Ingredientes {
    protected int codigo;
    protected String nome;
    protected UnidadeMedida unidadeMedida;
    protected int Kcal;

    //Metodo Construtor
    public Ingredientes(int codigo, String nome, UnidadeMedida unidadeMedida, int kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.Kcal = kcal;
    }

    //Metodo de acesso
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getKcal() {
        return Kcal;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void exibirDetalhes(){
        System.out.print(this.codigo + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.Kcal + "kcal | ");
    }

}
