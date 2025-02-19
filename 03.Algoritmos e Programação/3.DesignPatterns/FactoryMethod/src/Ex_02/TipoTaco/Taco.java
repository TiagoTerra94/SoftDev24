package Ex_02.TipoTaco;

public abstract class Taco {
    protected String nome;
    protected int preco;

    public Taco(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void box();
}
