package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao Dino = new Cao("Dino","Golden Retriever");
        Cao Cocas = new Cao("Cocas", "Bulldog");
        Cao Nicas = new Cao("Nicas", "Yorkshire");

        Nicas.ladrar();
        Cocas.ladrar();
        Dino.ladrar();
        System.out.println("------------");
        Nicas.setLatido("AU AU");
        Cocas.setLatido("Ruff Ruff");
        Dino.setLatido("woof");

        Nicas.ladrar();
        Cocas.ladrar();
        Dino.ladrar();



    }

}
