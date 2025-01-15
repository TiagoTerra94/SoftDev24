package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    //Atributos de instancia
    private ArrayList<Musica> programacao;

    //Metodo Construtor

    public MusicPlayer(int numeroMusicas) {
        this.programacao = new ArrayList<Musica>();
    }


    //Metodo de Acesso

    //Metodo de instancia
    public void addMusica(Musica novaMusica){

        this.programacao.add(novaMusica);
    }

    public void removerMusica(Musica posicao){

        this.programacao.remove(posicao);
    }
}
