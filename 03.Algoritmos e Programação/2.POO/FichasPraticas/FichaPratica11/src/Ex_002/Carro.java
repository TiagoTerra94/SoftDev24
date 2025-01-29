package Ex_002;

import Ex_002.Enums.TipoCombustivel;

public class Carro extends Veiculo{
    //Atributos de instancia
    protected int quantidadePassageiros;

    //Metodo de acesso


    //Metodo de construtor
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, int litroskm, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cc, combustivel, litroskm);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    //Metodo de instancia

    /**
     * Função para calcular custo de viagem em X KM
     * @param combustivelUsado tipo de combustivel utilizado
     * @param distancia percorrida
     * @return
     */
    public double calcularCusto(TipoCombustivel combustivelUsado, int distancia){
        double custoViagem = 0;
        double precoGasolina = 2.70;
        double precoDiesel = 1.95;
        double precoGpl = 1.15;
        double precoEletrico = 0.12;

        if(combustivelUsado == TipoCombustivel.GASOLINA){
            custoViagem = this.consumoVeiculo(distancia) * precoGasolina;
        }else if(combustivelUsado == TipoCombustivel.DIESEL) {
            custoViagem = this.consumoVeiculo(distancia) * precoDiesel;
        }else if(combustivelUsado == TipoCombustivel.GPL) {
            custoViagem = this.consumoVeiculo(distancia) * precoGpl;
        }else if(combustivelUsado == TipoCombustivel.ELETRICO) {
            custoViagem = this.consumoVeiculo(distancia) * precoEletrico;
        }
        System.out.println("O veiculo " + this.modelo + " gastou num percurso de " + distancia + "km " + custoViagem + "€");
        return custoViagem;
    }
}
