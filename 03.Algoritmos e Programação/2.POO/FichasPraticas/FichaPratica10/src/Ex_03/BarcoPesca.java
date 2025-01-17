package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    //Atributos de instancia
    private String nome, cor, anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados = new ArrayList<>();
    private ArrayList<Marisco> mariscoPescados = new ArrayList<>();

    //Metodo construtor
    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCargaKg, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marca = marca;
        this.peixesPescados = new ArrayList<>();
        this.mariscoPescados = new ArrayList<>();
    }

    //Metodo de Acesso


    //Metodo de Instancia

    public void pescarPeixe(Peixe novoPeixe){

        if(this.capacidadeCargaKg > novoPeixe.getPeso()) {
            this.peixesPescados.add(novoPeixe);
        }else{
            System.out.println("Peso do peixe maior que a capacidade permitida");
        }
    }

    public void pescarMarisco(Marisco novoMarisco){

        if(this.capacidadeCargaKg > novoMarisco.getPeso()) {
            this.mariscoPescados.add(novoMarisco);
        }else{
            System.out.println("Peso do peixe maior que a capacidade permitida");
        }

    }

    public void largarPeixe(Peixe removerPeixe){
        this.peixesPescados.remove(removerPeixe);
    }

    public void largarMarisco(Marisco removerMarisco){
        this.mariscoPescados.remove(removerMarisco);
    }

    public void calcularTotal(){

        for(Peixe peixeAtual: peixesPescados){
            int lucroAtual += peixeAtual.getPrecoKg(i) * peixeAtual.getPeso(i);
        }
    }

}
