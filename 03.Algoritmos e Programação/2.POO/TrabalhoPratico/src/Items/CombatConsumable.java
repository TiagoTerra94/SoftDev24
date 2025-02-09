package Items;

public class CombatConsumable extends Consumable {
    //Atributos de instancia
    protected int instaAttack;

    //Metodo Construtor
    public CombatConsumable(String name, int priceCoinGold, int instaAttack) {
        super(name, priceCoinGold);
        this.instaAttack = instaAttack;
    }
}
