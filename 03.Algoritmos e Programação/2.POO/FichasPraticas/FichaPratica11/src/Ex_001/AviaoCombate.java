package Ex_001;

import Ex_001.Enums.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    //Atributos de instancia
    protected String paisOrigem;
    protected boolean camuflagem;
    protected ArrayList<Armas> listaArmas;

    //Metodo Construtor
    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altura_cauda, int numMotor, double autonomia, double velocidade_max, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, altura_cauda, numMotor, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.listaArmas = new ArrayList<Armas>();
    }

    //Metodo de acesso


    //Metodo de instancia
    public void adicionarArma(Armas novaArma){
        if(this.listaArmas.size() <3 ) {
            this.listaArmas.add(novaArma);
            System.out.println(novaArma + " adicionada a " + this.modelo);
        }else{
            System.out.println("O seu " + this.modelo + " já tem o máximo permitido de Armas");
        }
    }
}


