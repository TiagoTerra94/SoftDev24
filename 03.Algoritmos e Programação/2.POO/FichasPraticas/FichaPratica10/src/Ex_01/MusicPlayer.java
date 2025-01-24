package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    //Atributos de instancia
    private ArrayList<Musica> programacao;

    //Metodo Construtor
    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }


    //Metodo de Acesso

    //Metodo de instancia
    public void addMusica(Musica novaMusica){

        this.programacao.add(novaMusica);
        System.out.println("Música adicionada com sucesso");

    }

    public void removerMusica(int posicao){

        if(this.programacao.get(posicao-1) != null) {
            this.programacao.remove(posicao-1);
            System.out.println("Música removida com sucesso");
        }else{
            System.out.println("Posição inválida.");
        }
    }

    public void trocarMusica(int primeraPos, int segundaPos){
        ArrayList<Musica> duplicado = new ArrayList<>(this.programacao);

        if(this.programacao.get(primeraPos-1) != null && this.programacao.get(segundaPos-1) !=null){
            this.programacao.set(primeraPos-1,duplicado.get(segundaPos-1));
            this.programacao.set(segundaPos-1,duplicado.get(primeraPos-1));
            System.out.println("Músicas trocadas com sucesso");
        }else{
            System.out.println("Primeiro adicione músicas à lista.");
        }

    }

    public void removerTodas(){
        this.programacao.clear();
        System.out.println("Lista de Músicas removidas com sucesso.");
    }

    public void imprimirRelatorio(){
        int contadorMusicas = 1;

        for(Musica musicaAtual: this.programacao) {
            System.out.print("Música " + contadorMusicas++ + ": ");
            musicaAtual.exibirMusica();
        }
    }

    public void duracaoProgramacao(){
        //hh:mm:ss
        int totalSegundos = 0;

        for(int i =0; i<this.programacao.size(); i++){
            totalSegundos += this.programacao.get(i).getDuracao();
        }

        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;
        int minutos = restoSegundos /60;
        int segundos = restoSegundos % 60;

        System.out.println("Duração da programação: " + horas + "h:" + minutos + "m:" + segundos + "s");
    }
}
