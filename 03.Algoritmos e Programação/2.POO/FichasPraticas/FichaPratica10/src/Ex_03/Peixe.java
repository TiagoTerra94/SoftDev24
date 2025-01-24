package Ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKg;

    /**
     * Metodo construtor do <b>Peixe</b>
     * @param especie
     * @param peso
     * @param precoKg
     */
    public Peixe(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    //Metodo de Acesso
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
