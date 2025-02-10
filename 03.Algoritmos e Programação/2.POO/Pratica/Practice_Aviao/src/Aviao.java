public class Aviao {
    //Atributos de instancia
    protected String numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double pesoKg;
    protected int compFuselagem;
    protected int envAsas;
    protected double alturaCauda;
    protected int numMotores;
    protected int autonomiaKm;
    protected int velocidadeMax;
    protected double preco;

    //Metodo Construtor
    public Aviao(String numSerie, String modelo, int anoFabrico, double pesoKg, int compFuselagem, int envAsas, double alturaCauda, int numMotores, int autonomiaKm, int velocidadeMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomiaKm = autonomiaKm;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }

    //Metodo de Acesso
    public String getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPreco() {
        return preco;
    }

    public void exibeDetalhes(){
        System.out.println("***********" + this.modelo + "**********");
        System.out.println("Numero Serie: " + this.numSerie + " | Ano Fabrico: " + this.anoFabrico + " | Preço: " + this.preco + "€");

    }
}
