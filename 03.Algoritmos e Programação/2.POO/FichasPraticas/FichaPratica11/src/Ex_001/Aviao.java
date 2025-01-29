package Ex_001;

public class Aviao {
    //Atributos de instancia
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double compFuselagem;
    protected double envAsas;
    protected double altura_cauda;
    protected int numMotor;
    protected double autonomia;
    protected double velocidade_max;
    protected double preco;

    //Metodo Construtor
    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double altura_cauda, int numMotor, double autonomia, double velocidade_max, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envAsas = envAsas;
        this.altura_cauda = altura_cauda;
        this.numMotor = numMotor;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    //Metodo de acesso
    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_ " + this.modelo + " : " + this.numSerie + " _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Ano: " + this.anoFabrico + " | Num. Motores: " + this.numMotor + " | Vel. Máx.: " + this.velocidade_max + " Km/h | Autonomia: " + this.autonomia + " | Preço: " + this.preco + " €");
        System.out.println("Peso: " + this.peso + " Kg. | Fuselagem: " + this.compFuselagem + " m. | Env. Asas: " + this.envAsas + " m. | Cauda: " + this.altura_cauda + " m.");
    }
}
