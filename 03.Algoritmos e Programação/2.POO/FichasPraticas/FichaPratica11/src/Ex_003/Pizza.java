package Ex_003;

import Ex_003.Enums.Tamanho;
import Ex_003.Enums.UnidadeMedida;

import java.util.ArrayList;

public class Pizza {
    //Atributos de instancia
    protected final int MAX_INGREDIENTES = 5;
    protected String codigo;
    protected String nome;
    protected String descricao;
    protected float preco;
    protected Tamanho tamanho;
    protected ArrayList<IngredientePizza> ingPizza;

    //Metodo Construtor
    public Pizza(String codigo, String nome, String descricao, float preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingPizza = new ArrayList<IngredientePizza>();
    }

    //Metodos de Acesso


    //Metodos de Instancia

    /**
     * Metodo para adicionar novo ingrediente
     * @param novoIngrediente
     */
    public void adicionarIng(IngredientePizza novoIngrediente){
        if(this.ingPizza.size() >= MAX_INGREDIENTES){
            System.out.println("O ingrediente não foi adicionado. \nJá tem o número máximo de ingredientes. MAX: " + this.MAX_INGREDIENTES);
        }else{
            this.ingPizza.add(novoIngrediente);
            System.out.println("O ingrediente foi adicionado.");
        }
    }

    /**
     * Metodo para remover um ingrediente pelo ID
     * @param id
     */
    public void removerIng(int id){
        for(IngredientePizza ingAtual: this.ingPizza){
            if (id == ingAtual.getIngredientes().getId()){
                this.ingPizza.remove(ingAtual);
                return;
            }
        }
    }

    /**
     * Metodo para editar quantidade do ingrediente
     * @param nomeEditar
     * @param novaQuantidade
     */
    public void editarIngrediente(String nomeEditar, double novaQuantidade){

        for(IngredientePizza ingAtual: this.ingPizza){
            if(ingAtual.getIngredientes().getNome().equals(nomeEditar)){
                ingAtual.setQuantidade(novaQuantidade);
                return;
            }

        }
    }

    /**
     * Metodo para calcular total de kcal
     * @return o total de Kcal de uma pizza
     */
    public int numKcal(){
        int totalKcal = 0;

        for (IngredientePizza ingAtual: this.ingPizza){
            totalKcal += (int) (ingAtual.getIngredientes().getKcal() * ingAtual.getQuantidade());
        }

        return totalKcal;
    }

    /**
     * Metodo para exibir detalhes da pizza
     */
    public void exibirDetalhes(){
        int counter = 1;

        System.out.println("*******" + this.nome + "*******");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho: " + this.tamanho);

        for(IngredientePizza ingAtual: this.ingPizza){
            System.out.print("Ingrediente " + counter++ + " [" + this.codigo + "] | " + this.nome);
            ingAtual.exibirDetalhes();
            System.out.println();
        }
    }
}
