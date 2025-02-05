package Ex_003;

import Ex_003.Enums.Tamanho;
import Ex_003.Enums.UnidadeMedida;

public class Main {
    public static void main(String[] args) {

        Ingredientes molhoTomate = new Ingredientes(001,"Molho Tomate", UnidadeMedida.LITROS, 250);
        Ingredientes queijoMussarela = new Ingredientes(002, "Queijo Mussarela", UnidadeMedida.GRAMAS, 1);
        Ingredientes presuntobaby = new Ingredientes(003, "Presunto", UnidadeMedida.GRAMAS, 20);
        Ingredientes cogumelos = new Ingredientes(004, "Cogumelos", UnidadeMedida.GRAMAS, 15);
        Ingredientes cebola = new Ingredientes(005, "Cebola", UnidadeMedida.GRAMAS, 10);
        Ingredientes patarecas = new Ingredientes(006, "Azeitonas", UnidadeMedida.GRAMAS, 80);
        Ingredientes rubenscarinooo = new Ingredientes(007, "Peperoni", UnidadeMedida.GRAMAS, 120);



        Pizza pizzaCaprichosa = new Pizza("Cap001", "Caprichosa", "Pizza tradicional com ingredientes regionais", 10, Tamanho.GRANDE);
        pizzaCaprichosa.adicionarIng(new IngredientePizza(presuntobaby,200));
        pizzaCaprichosa.adicionarIng(new IngredientePizza(rubenscarinooo,100));
        pizzaCaprichosa.adicionarIng(new IngredientePizza(cogumelos,10));
        pizzaCaprichosa.adicionarIng(new IngredientePizza(patarecas,8));
        pizzaCaprichosa.adicionarIng(new IngredientePizza(cebola,5));
        pizzaCaprichosa.adicionarIng(new IngredientePizza(queijoMussarela,100));

        Pizza pizzaMargherita = new Pizza("Mar001", "Margherita", "Pizza clássica com molho de tomate, queijo e manjericão", 12, Tamanho.MEDIA);
        Pizza pizzaCalabresa = new Pizza("Cal001", "Calabresa", "Pizza com molho de tomate, queijo e linguiça calabresa", 15, Tamanho.GRANDE);

        pizzaCaprichosa.exibirDetalhes();

    }
}
