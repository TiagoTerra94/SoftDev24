import Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {
    //Atributos de instancia
    protected int codigo;
    protected String nome;
    protected String descricao;
    protected Tamanho tamanho;
    protected double preco;
    protected ArrayList<IngredientesPizza> ingredientes;

    //Metodo Construtor
    public Pizza(int codigo, String nome, String descricao, Tamanho tamanho, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.ingredientes = new ArrayList<IngredientesPizza>();
    }

    //Metodos de instancia
    public void addIngrediente(IngredientesPizza ingrediente) {
        //Se a lista conter menos de 5 ingredientes, adiciona
        if (this.ingredientes.size() < 5){
            this.ingredientes.add(ingrediente);
        }else {//caso conter 5 ou mais
            System.out.println("Erro ao adicionar ingrediente");
        }
    }

    public void editQuantidade(String nomeEditar, int novaQuantidade) {
        for (IngredientesPizza ingrediente : this.ingredientes) {
            if (ingrediente.getIngredientes().getNome().equals(nomeEditar)) {
                ingrediente.setQuantidade(novaQuantidade);
                return;
            }
        }
    }

    public void removeIngrediente(int id) {
        //se na lista de ingredientes existir o id, remove
        for (IngredientesPizza ingrediente : this.ingredientes) {
            if(id == ingrediente.getIngredientes().getCodigo()){
                this.ingredientes.remove(ingrediente);
                return;
            }else{//caso não existir o id
                System.out.println("Erro ao remover ingrediente");
            }

        }
    }

    public int calcularCalorias() {
        int totalKcal = 0;

        for (IngredientesPizza ingAtual: this.ingredientes){
            totalKcal += (int) (ingAtual.getIngredientes().getKcal() * ingAtual.getQuantidade());
        }

        return totalKcal;
    }

    public void exibirDetalhes() {
        System.out.println("******" + this.nome + "******");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho: " + this.tamanho);

        int counter = 1;
        for(IngredientesPizza ingAtual: this.ingredientes){
            System.out.print("Ingrediente " + counter++ + ":[");
            ingAtual.getIngredientes().exibirDetalhes();
            System.out.println(ingAtual.getQuantidade() + "g ]");
        }
    }
}
