package Ex_03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Método construtor do  <b>Marisco</b>
     * @param especie
     * @param peso
     * @param precoKg
     */
    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public void exibirDetalhes(){
        System.out.println(this.especie + " | Peso: " + this.getPeso() + " | Preco(Kg): " + this.getPrecoKg() + "€");
    }
}
