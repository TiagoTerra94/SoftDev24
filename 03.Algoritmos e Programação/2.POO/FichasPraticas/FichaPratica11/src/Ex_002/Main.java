package Ex_002;

import Ex_002.Enums.TipoCombustivel;

public class Main {
    public static void main(String[] args) {
        Carro mercedes = new Carro("Mercedes", "A45", 2022, 420, 2000, TipoCombustivel.GASOLINA, 15, 5);
        Carro bmw = new Carro("BMW", "M3", 2005, 100, 3000, TipoCombustivel.DIESEL, 20, 4);

        Mota yamaha = new Mota("Yamaha","Z500",2003,40,90,TipoCombustivel.GASOLINA,20);

        Camiao susuki = new Camiao("Suzuki","Amen",1995,100,200,TipoCombustivel.DIESEL,25,250);

        susuki.ligar();
        yamaha.ligar();
        System.out.println("--------");

        System.out.println("Vencedor Corrida:");
        Veiculo vencedor = susuki.corrida(yamaha);

        if (vencedor == null) {
            System.out.println("Empate");
        } else {
            vencedor.exibirDetalhes();
        }

        susuki.validarCapacidade(150,100);

    }
}
