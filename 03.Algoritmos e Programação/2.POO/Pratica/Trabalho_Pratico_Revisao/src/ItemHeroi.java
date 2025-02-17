import java.util.ArrayList;
public abstract class ItemHeroi {
protected String nome;
protected int preco;
protected ArrayList<String> heroisPermitidos;

public ItemHeroi(String nome, int preco) {
    this.nome = nome;
    this.preco = preco;
    this.heroisPermitidos = new ArrayList<>();
}

public abstract void mostrarDetalhes();

public void adicionarHeroiPermitido(String classe) {
    heroisPermitidos.add(classe);
}

public boolean podeSerUsadoPor(String classe) {
    return heroisPermitidos.contains(classe);
}

public String getNome() { return nome; }
public int getPreco() { return preco; }
}

