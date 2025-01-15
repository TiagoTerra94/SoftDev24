package Ex_03;

import java.util.Objects;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;


    //Metodo Construtor

    public Animal(String nome, String especie, String paisOrigem, int peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }


    //Metodo de acesso(getter setter)

    //Metodo de instancia
    public boolean comerAlimento(String alimento, double peso) {

        for (int i = 0; i < this.alimentacao.length; i++) {

            if (Objects.equals(alimento, this.alimentacao[i])) {
                this.peso += peso/1000;
                System.out.println("O animal comeu: " + alimento);
                return true;
            }
        }
        //Só executa se o alimento nao estiver no array
            System.out.println("O animal recusou: " + alimento);
            return false;

    }

    public void exibirDetalhes(){
            System.out.println("Nome: " + this.nome + " | Espécie: " + this.especie + " | País: " +this.paisOrigem + " | Novo Peso: " + this.peso + " KG");

    }


}

