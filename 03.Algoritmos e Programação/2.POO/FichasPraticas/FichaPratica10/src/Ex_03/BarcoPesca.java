package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    //Atributos de instancia
    private String nome, cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados = new ArrayList<>();
    private ArrayList<Marisco> mariscoPescados = new ArrayList<>();

    /**
     * Metodo construtor do <b>Barco</b>
     * @param nome
     * @param cor
     * @param anoFabrico
     * @param tripulacao
     * @param capacidadeCargaKg
     * @param marca
     */
    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCargaKg, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescados = new ArrayList<Marisco>();
    }

    //Metodo de Acesso


    //Metodo de Instancia

    /**
     * Metodo pescar peixe
     * @param novoPeixe peixe que acabou de ser pescado
     */
    public void pescarPeixe(Peixe novoPeixe){

        if(this.capacidadeCargaKg >= novoPeixe.getPeso() + this.getCargaAtual()) {
            this.peixesPescados.add(novoPeixe);
            System.out.println("Pescou " + novoPeixe.getPeso() + " de " + novoPeixe.getEspecie());
        }else{
            System.out.println("Peso total passa da carga permitida do barco.");
        }
    }

    /**
     * Metodo para pescar marisco
     * @param novoMarisco marisco que acabou de ser pescado
     */
    public void pescarMarisco(Marisco novoMarisco){

        if(this.capacidadeCargaKg >= novoMarisco.getPeso() + this.getCargaAtual()) {
            this.mariscoPescados.add(novoMarisco);
            System.out.println("Pescou " + novoMarisco.getPeso() + " de " + novoMarisco.getEspecie());
        }else{
            System.out.println("Peso total passa da carga permitida do barco.");
        }

    }

    public void largarPeixe(Peixe removerPeixe){
        this.peixesPescados.remove(removerPeixe);
        System.out.println("Largou " + removerPeixe.getPeso() + " Kg de " + removerPeixe.getEspecie());
    }

    public void largarMarisco(Marisco removerMarisco){
        this.mariscoPescados.remove(removerMarisco);
        System.out.println("Largou " + removerMarisco.getPeso() + " Kg de " + removerMarisco.getEspecie());
    }

    public double getCargaAtual(){
        double cargaTotal = 0;

        for (Peixe peixeAtual: peixesPescados) {
            cargaTotal += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual: mariscoPescados) {
            cargaTotal += mariscoAtual.getPeso();
        }

        return cargaTotal;
    }

    public double calcularTotal(){
        double lucroAtual = 0;

        for(Peixe peixeAtual: peixesPescados){
            lucroAtual += peixeAtual.getPrecoKg() * peixeAtual.getPeso();
        }

        for(Marisco mariscoAtual: mariscoPescados){
            lucroAtual += mariscoAtual.getPrecoKg() * mariscoAtual.getPeso();
        }

        return lucroAtual;
    }

    public double salarioTripulacao(){
        return  (this.calcularTotal()*0.6)/this.tripulacao;
    }

    public void exibirDetalhes(){
        System.out.println("*************************************************");
        System.out.println("Nome: " + this.nome + " | Ano Fabrico" + this.anoFabrico + " | Marca: " + this.marca + " | Capacidade: " + this.capacidadeCargaKg + " | Tripulantes: " + this.tripulacao);

        System.out.println("******Carga Peixe******");
        for(Peixe peixeAtual: peixesPescados){
            peixeAtual.exibirDetalhes();
        }
        System.out.println("******Carga Marisco*******");
        for(Marisco mariscoAtual: mariscoPescados){
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("Carga Atual: " + getCargaAtual() + "Kg");
        System.out.println("Valor atual da carga: " + calcularTotal() + "€");
        System.out.println("Salario Tripulação: " + salarioTripulacao() + "€");
    }

}
