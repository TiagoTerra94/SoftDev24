package ex03;

public class Animal {
    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;

    public Animal(String nome, boolean comFome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = comFome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public boolean isComFome() {
        return comFome;
    }

    public Alimento getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void comer(Alimento comida) {
        if (tipoAlimentacao == comida && comida != null) {
            comFome = false;
            System.out.println(nome + " comeu " + comida + ".");
        } else {
            System.out.println(nome + " não come " + comida + ".");
        }
    }

}
