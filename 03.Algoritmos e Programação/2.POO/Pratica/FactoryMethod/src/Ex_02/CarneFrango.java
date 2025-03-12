package Ex_02;

public class CarneFrango extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar taco de carne de frango");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar taco de carne de frango");
    }

    @Override
    public void pack() {
        System.out.println("A embalar taco de carne de frango");
    }
}
