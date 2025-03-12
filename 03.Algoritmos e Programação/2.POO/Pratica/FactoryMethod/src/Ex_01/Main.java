package Ex_01;

public class Main {
    public static void main(String[] args) {
        Product book = ProductFactory.createProduct("Book");
        Product electronic = ProductFactory.createProduct("Electronic");
        Product clothing = ProductFactory.createProduct("Clothing");

        book.display();
        electronic.display();
        clothing.display();
    }
}