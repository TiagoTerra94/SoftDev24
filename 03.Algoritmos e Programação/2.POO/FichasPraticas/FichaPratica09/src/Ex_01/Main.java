package Ex_01;

public class Main {
    public static void main(String[] args) {

        Carro mercedes = new Carro("Mercedes","A45",2022,420,2000,TipoCombustivel.GASOLINA,15);
        Carro bmw = new Carro("BMW","M3",2005,100,3000,TipoCombustivel.DIESEL,20);

        mercedes.ligar();
        bmw.ligar();
        System.out.println("--------");

        Carro vencedor = mercedes.corrida(bmw);

        if(vencedor == null){
            System.out.println("Empate");
        }else {
            vencedor.exibirDetalhes();
        }


        System.out.println(mercedes.consumoCarro(97));

    }
}
