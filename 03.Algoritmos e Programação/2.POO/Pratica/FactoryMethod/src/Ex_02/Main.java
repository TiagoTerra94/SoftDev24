package Ex_02;

public class Main {
    public static void main(String[] args) {
        Taco carne = TacoFactory.createTaco("Carne");
        Taco frango = TacoFactory.createTaco("Frango");
        Taco veggie =  TacoFactory.createTaco("Vegetariano");

        carne.prepare();
        frango.prepare();
        veggie.prepare();

        carne.bake();
        frango.bake();
        veggie.bake();

        carne.pack();
        frango.pack();
        veggie.pack();
    }
}
