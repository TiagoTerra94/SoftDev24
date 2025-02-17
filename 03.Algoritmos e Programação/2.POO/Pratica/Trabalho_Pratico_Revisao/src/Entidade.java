public abstract class Entidade {
    protected String nome;
    protected int vidaMax;
    protected int vidaAtual;
    protected int forca;

    public Entidade(String nome, int vidaMax, int forca) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaMax;
        this.forca = forca;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMax);
        System.out.println("Força: " + forca);
    }

    // Getters e setters
    public String getNome() { return nome; }
    public int getVidaMax() { return vidaMax; }
    public int getVidaAtual() { return vidaAtual; }
    public int getForca() { return forca; }
    public void setVidaAtual(int vida) { this.vidaAtual = vida; }
    public void setForca(int forca) { this.forca = forca; }
}

