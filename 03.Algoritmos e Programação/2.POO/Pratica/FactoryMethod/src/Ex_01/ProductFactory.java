package Ex_01;

public class ProductFactory {
    public static Product createProduct(String type){
        switch (type) {
            case "Book":
                return new Book();
            case "Electronic":
                return new Electronics();
            case "Clothing":
                return new Clothing();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
