import Enums.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    //Atributos de instancia
    protected String paisOrigem;
    protected boolean camuflagem;
    protected ArrayList<Armas> listaArmas;

    //Metodo Construtor
    public AviaoCombate(String numSerie, String modelo, int anoFabrico, double pesoKg, int compFuselagem, int envAsas, double alturaCauda, int numMotores, int autonomiaKm, int velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, envAsas, alturaCauda, numMotores, autonomiaKm, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.listaArmas = new ArrayList<Armas>();
    }

    //Metodo de instancia

    /**
     * Adicionar armas ao aviaoCombate
     * @param armas
     */
    public void addArmas(Armas armas) {
        if(this.listaArmas.size() < 3) {
            this.listaArmas.add(armas);
            System.out.println("Arma adicionada: " + armas + " a " + this.modelo);
        }else{
            System.out.println("Já tem o máximo permitido");
        }
    }

    /**
     * Remover armas do AviaoCombate
     * @param armas
     */
    public void removeArmas(Armas armas) {
        this.listaArmas.remove(armas);
    }

    /**
     * Exibe o arsenal do AviaoCombate
     */
    public void exibeListaArmas() {
        for(Armas armas : this.listaArmas) {
            System.out.println(armas);
        }
    }

}
