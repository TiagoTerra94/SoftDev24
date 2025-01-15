package Ex_01;

public class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    //Metodo Construtor


    public Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    //Metodo de Acesso
    public String getTitulo() {
        return titulo;
    }
}
