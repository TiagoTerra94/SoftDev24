package Ex_03.TipoDoc;

public abstract class Documento {
    protected String autor;
    protected String nome;
    protected String extensao;

    public Documento(String autor, String nome, String extensao) {
        this.autor = autor;
        this.nome = nome;
        this.extensao = extensao;
    }

    public abstract void open();

    public abstract void save();

    public abstract void close();
}
