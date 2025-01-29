package Ex_001;

import Ex_001.Enums.Categoria;
import Ex_001.Enums.Instalacoes;

import java.util.ArrayList;

public class JatoParticular extends Aviao{
    //Atributos de instancia
    protected int lotacao;
    protected double capacidadeBagagem;
    protected Categoria categoria;
    protected ArrayList<Instalacoes> instalacoes;

    //Metodo Construtor


    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altura_cauda, int numMotor, double autonomia, double velocidade_max, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altura_cauda, numMotor, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacoes>();
    }

    //Metodo de acesso


    //Metodo de instancia
    public void adicionarInstalacao(Instalacoes novaInstalacao){
        this.instalacoes.add(novaInstalacao);
        System.out.println(novaInstalacao + " adicionada a " + this.modelo);
    }

}
