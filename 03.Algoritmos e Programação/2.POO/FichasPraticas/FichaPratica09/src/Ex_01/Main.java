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


        System.out.println("O " + mercedes.getMarca() + " gastou " + mercedes.consumoCarro(97) + " L");
        System.out.println("O " + bmw.getMarca() + " gastou " + bmw.consumoCarro(97) + " L");

        System.out.print("O automóvel que consumiu mais combustivel foi: ");
        if(mercedes.consumoCarro(97)< bmw.consumoCarro(97)){
            System.out.println(mercedes.getMarca());
        } else
            System.out.println(bmw.getMarca());
        }


    }
