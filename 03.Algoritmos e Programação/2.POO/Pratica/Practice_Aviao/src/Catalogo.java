import java.util.ArrayList;

public class Catalogo {
    //Atributos de Instancia
    protected ArrayList<Aviao> listaAviao;

    //Metodo Construtor
    public Catalogo() {
        this.listaAviao = new ArrayList<Aviao>();
    }

    //Metodo de instancia
    /**
     * Comprar Aviao
     * @param aviao jato ou aviaocombate
     */
    public void comprarAviao(Aviao aviao) {
        this.listaAviao.add(aviao);
    }

    /**
     * Vender aviao (remover)
     * @param aviao - jato ou aviaocombate
     */
    public void venderAviao(Aviao aviao) {
        this.listaAviao.remove(aviao);
    }

    /**
     * exibe detalhes do aviao
     */
    public void exibeListaAviao() {
        for(Aviao aviao : this.listaAviao){
            aviao.exibeDetalhes();
        }
    }

    /**
     * Calculo total de todos os avioes do catalogo
     * @return
     */
    public double calculoTotal() {
        double total = 0;
        for(Aviao aviao : this.listaAviao){
            total += aviao.getPreco();
        }
        return total;
    }
}
