package Ex_002;

import Ex_002.Enums.TipoCombustivel;

public class Camiao extends Veiculo {
    //Atributos de instancia
    protected int capacidadeCargaKG;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, int litroskm, int capacidadeCargaKG) {
        super(marca, modelo, anoFabrico, potencia, cc, combustivel, litroskm);
        this.capacidadeCargaKG = capacidadeCargaKG;
    }

    //Metodo de Acesso

    //Metodo de Instancia
    public double calcularCusto(int distancia){
        double custoViagem = 0;
        double precoDiesel = 1.95;

        custoViagem = this.consumoVeiculo(distancia) * precoDiesel;

        return custoViagem;
    }

    public void validarCapacidade(int distancia, int carga){
        double custoTotal = 0;

        if(carga > capacidadeCargaKG){
            System.out.println("O veiculo não tem capacidade de carga suficiente.");
            return;
        }else if(carga >=100){
            custoTotal = this.calcularCusto(distancia) + (distancia * 0.1/100);
        }else{
            custoTotal = this.calcularCusto(distancia);
        }

        System.out.println("O veiculo " + this.modelo + " gastou num percurso de " + distancia + "km " + custoTotal + "€");
    }
}
