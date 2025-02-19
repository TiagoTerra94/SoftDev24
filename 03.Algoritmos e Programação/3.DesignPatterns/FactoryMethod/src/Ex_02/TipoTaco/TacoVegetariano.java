package Ex_02.TipoTaco;

public class TacoVegetariano extends Taco {
    public TacoVegetariano(String nome, int preco) {
        super(nome, preco);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar taco " + this.nome);
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco " + this.nome);
    }

    @Override
    public void box() {
        System.out.println("A embalar taco " + this.nome);
    }
}
