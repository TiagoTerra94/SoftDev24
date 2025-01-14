package Ex_03;

import java.util.Objects;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private int peso;
    private String[] Alimentacao;


    //Metodo Construtor

    public Animal(String nome, String especie, String paisOrigem, int peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        Alimentacao = alimentacao;
    }


    //Metodo de acesso(getter setter)

    //Metodo de instancia
    public void comerAlimento(String alimento, int peso) {

        for (int i = 0; i < this.Alimentacao.length; i++) {

            if (Objects.equals(alimento, Alimentacao[i])) {
                this.peso += peso;
                System.out.println("O animal comeu: " + alimento);
                return;
            }
        }

        if(!Objects.equals(alimento, Alimentacao)){
            System.out.println("O animal recusou: " + alimento);
        }
    }

    public void exibirDetalhes(){
            System.out.println("Nome: " + this.nome + " | Espécie: " + this.especie + " | Novo Peso: " + this.peso + " KG");

    }


}

