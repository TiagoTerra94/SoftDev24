package Ex_003;

import Ex_003.Enums.UnidadeMedida;

public class Ingredientes{
    //Atributos de instancia
    protected int id;
    protected String nome;
    protected UnidadeMedida unidadeMedida;
    protected int Kcal;

    //Metodo Construtor
    public Ingredientes(int id, String nome, UnidadeMedida unidadeMedida, int kcal) {
        this.id= id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        Kcal = kcal;
    }

    //Metodo de Acesso
    public String getUnidadeMedidadeAbrev(){
        switch(this.unidadeMedida){
            case GRAMAS:
                return "g";
            case LITROS:
                return "L";
            case UNIDADES:
                return "uni";
            default:
                break;
        }
        return "";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public int getKcal() {
        return Kcal;
    }

    public void exibirDetalhes(){
        System.out.print(" | " + this.nome + " | Kcal: " + this.Kcal + " ]");
    }
}
