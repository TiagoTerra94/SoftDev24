package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    //Atributos de Instancia
    private double premio;
    private ArrayList<Pessoa> listParticipantes = new ArrayList<>();

    //Metodo construtor
    public Sorteio() {
        this.listParticipantes = new ArrayList<>();
    }

    //Metodos de instancia

    /**
     * Metodo para adicionar participantes ao array
     * @param novoParticipante - pessoa que vai ser adicionada
     */
    public void addParticipantes(Pessoa novoParticipante){

        if(novoParticipante.getIdade() >=18){
            this.listParticipantes.add(novoParticipante);
            System.out.println("Participante inscrito");
        }else{
            System.out.println("Participante tem que ter pelo menos 18 anos.");
        }
    }

    /**
     * Metodo para sortear para encontrar um vencedor para o eurimilhões
     * @return retorna o vencedor do sorteio
     */
    public Pessoa sortear(){
        Random rnd = new Random();

        int vencedor = rnd.nextInt(listParticipantes.size());

        return listParticipantes.get(vencedor);
    }

    /**
     * Metodo para imprimir a lista de participantes
     */
    public void imprimirLista(){
        int contador = 1;

        for(Pessoa pessoaAtual: this.listParticipantes){
            System.out.print("Participante " + contador++ + ": ");
            pessoaAtual.exibirDetalhes();
        }
    }

}
