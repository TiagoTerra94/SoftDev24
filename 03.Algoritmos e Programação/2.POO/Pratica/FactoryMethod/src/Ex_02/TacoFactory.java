package Ex_02;

public class TacoFactory {
    public static Taco createTaco(String tipo) {
        switch (tipo) {
            case "Carne":
                return new CarneVaca();
            case "Frango":
                return new CarneFrango();
            case "Vegetariano":
                return new Vegetariano();
            default:
                throw new IllegalArgumentException("Tipo de taco inválido");
        }
    }
}
