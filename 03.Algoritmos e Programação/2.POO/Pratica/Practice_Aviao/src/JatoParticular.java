import Enums.Categoria;
import Enums.Instalacoes;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    //Atributos de instancia
    protected int lotacao;
    protected double capacidadeBagagem;
    protected Categoria categoria;
    protected ArrayList<Instalacoes> listainstalacoes;

    //Metodo Construtor
    public JatoParticular(String numSerie, String modelo, int anoFabrico, double pesoKg, int compFuselagem, int envAsas, double alturaCauda, int numMotores, int autonomiaKm, int velocidadeMax, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, envAsas, alturaCauda, numMotores, autonomiaKm, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.listainstalacoes = new ArrayList<Instalacoes>();
    }

    //Metodo de instancia

    /**
     * Adiciona instalações à lista
     * @param instalacoes
     */
    public void addInstalacoes(Instalacoes instalacoes) {
        this.listainstalacoes.add(instalacoes);
        System.out.println("Instalacoes adicionada: " + instalacoes.toString() + " a " + this.modelo);
    }

    /**
     * Remove uma instalação do Jato Particular
     * @param instalacoes
     */
    public void removeInstalacoes(Instalacoes instalacoes) {
        if(this.listainstalacoes.contains(instalacoes)) {
            this.listainstalacoes.remove(instalacoes);
        }else{
            System.out.println("Não tem instalacão escolhida.");
        }

    }

    /**
     * Exibe lista de Instalações
     */
    public void exibeListaInstalacoes() {
        for(Instalacoes instalacoes : this.listainstalacoes) {
            System.out.println(instalacoes);
        }
    }

}
