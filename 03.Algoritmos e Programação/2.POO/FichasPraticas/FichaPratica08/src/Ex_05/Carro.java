package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Metodo de acesso


    //Metodo de instancia
    public void ligar(){
        System.out.println("O carro está ligado.");
    }
}
