import java.awt.*;
import java.util.ArrayList;

class Sala {
    private String nome;
    private String descricao;
    private List<String> salasConectadas;
    private NPC inimigo;
    private int ouro;
    private boolean temArmadilha;
    private ItemHeroi item;

    public Sala(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.salasConectadas = new ArrayList<>();
        this.ouro = 0;
        this.temArmadilha = false;
    }

    public void conectarSala(String nomeSala) {
        salasConectadas.add(nomeSala);
    }

    // Getters e setters
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public List<String> getSalasConectadas() { return salasConectadas; }
    public void adicionarInimigo(NPC inimigo) { this.inimigo = inimigo; }
    public boolean temInimigo() { return inimigo != null; }
    public NPC getInimigo() { return inimigo; }
    public void setOuro(int ouro) { this.ouro = ouro; }
    public boolean temOuro() { return ouro > 0; }
    public int getOuro() { return ouro; }
    public void setArmadilha(boolean temArmadilha) { this.temArmadilha = temArmadilha; }
    public boolean temArmadilha() { return temArmadilha; }
    public void adicionarItem(ItemHeroi item) { this.item = item; }
    public boolean temItem() { return item != null; }
    public ItemHeroi getItem() { return item; }
}

