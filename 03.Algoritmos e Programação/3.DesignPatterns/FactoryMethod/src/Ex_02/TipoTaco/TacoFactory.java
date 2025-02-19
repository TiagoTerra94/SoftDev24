package Ex_02.TipoTaco;

public class TacoFactory {

    public static Taco createTaco(String tipo, String nome,int preco){

        switch (tipo){
            case "Carne":
                return new TacoCarne(nome,preco);
            case "Frango":
                return new TacoFrango(nome,preco);
            case "Vegetariano":
                return new TacoVegetariano(nome, preco);
            default:
                throw new IllegalArgumentException();
        }

    }

}
