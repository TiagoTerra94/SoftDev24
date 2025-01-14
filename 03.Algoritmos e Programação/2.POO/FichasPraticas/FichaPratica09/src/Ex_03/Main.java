package Ex_03;

public class Main {
    public static void main(String[] args) {

       Animal animal1 = new Animal("Dumbo","Elefante" , "Africa", 500,new String[]{"Maça","Banana","Pera","Cenoura"});

      animal1.comerAlimento("Banana",50);
      animal1.exibirDetalhes();

      animal1.comerAlimento("Carne",100);

    }

}
