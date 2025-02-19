package Ex_02;

import Ex_02.TipoTaco.Taco;
import Ex_02.TipoTaco.TacoFactory;

public class Main {
    public static void main(String[] args) {
        Taco carne = TacoFactory.createTaco("Carne","Taco de Carne",6);
        Taco veggie = TacoFactory.createTaco("Vegetariano","Taco Veggie",9);
        Taco frango = TacoFactory.createTaco("Frango","Taco de Frango",4);

        carne.prepare();
        carne.bake();
        carne.box();

        veggie.prepare();
        veggie.bake();
        veggie.box();

        frango.prepare();
        frango.bake();
        frango.box();
    }
}
