package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    //Metodo Construtor


    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    //Metodo de Acesso
    public int getDuracao() {
        return duracao;
    }

    //Metodo de Instancia
    public void exibirMusica(){
        System.out.println(this.titulo + " | " + this.genero + " | " + this.artista + " | " + this.duracao + " s");
    }
}
