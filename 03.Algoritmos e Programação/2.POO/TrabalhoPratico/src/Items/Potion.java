package Items;

public class Potion extends Consumable {
    //Atributos de instancia
    protected int cureHp;
    protected int upStrength;

    //Metodo Construtor
    public Potion(String name, int priceCoinGold, int cureHp, int upStrength) {
        super(name, priceCoinGold);
        this.cureHp = cureHp;
        this.upStrength = upStrength;
    }
}
