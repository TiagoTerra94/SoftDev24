import Enums.Tamanho;
import Enums.UnidadeMedida;

public class Main {
    public static void main(String[] args) {
        Pizza caprichosa = new Pizza(001,"Caprichosa","Pizza super deliciosa", Tamanho.GRANDE,10.99);
        Pizza marguerita = new Pizza(002, "Marguerita", "Clássica com molho, mussarela e manjericão", Tamanho.MEDIA, 8.99);
        Pizza calabresa = new Pizza(003, "Calabresa", "Com bastante calabresa e cebola", Tamanho.GRANDE, 9.99);


        Ingredientes queijo = new Ingredientes(0,"Queijo", UnidadeMedida.GRAMAS,5);
        Ingredientes tomate = new Ingredientes(1, "Tomate", UnidadeMedida.GRAMAS, 3);
        Ingredientes cebola = new Ingredientes(2, "Cebola", UnidadeMedida.GRAMAS, 2);
        Ingredientes presunto = new Ingredientes(3, "Presunto", UnidadeMedida.GRAMAS, 4);
        Ingredientes oregano = new Ingredientes(4, "Orégano", UnidadeMedida.GRAMAS, 1);
        Ingredientes azeitona = new Ingredientes(5, "Azeitona", UnidadeMedida.GRAMAS, 2);
        Ingredientes bacon = new Ingredientes(6, "Bacon", UnidadeMedida.GRAMAS, 6);


        caprichosa.addIngrediente(new IngredientesPizza(100,queijo));
        caprichosa.addIngrediente(new IngredientesPizza(200,tomate));
        caprichosa.addIngrediente(new IngredientesPizza(100,cebola));
        caprichosa.addIngrediente(new IngredientesPizza(100,presunto));
        caprichosa.addIngrediente(new IngredientesPizza(50,oregano));
        caprichosa.addIngrediente(new IngredientesPizza(20,azeitona));

        System.out.println(caprichosa.calcularCalorias());
        System.out.println("---------");
        caprichosa.editQuantidade("Queijo",70);
        System.out.println("------------");
        caprichosa.removeIngrediente(2);

    }
}