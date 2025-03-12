package Ex_02;

public class CarneVaca extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de vaca");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de vaca");
    }

    @Override
    public void pack() {
        System.out.println("A embalar taco de carne de vaca");
    }
}
