package Items;

import java.util.ArrayList;

public abstract class Consumable extends ItemHero {
    //Metodo Construtor
    public Consumable(String name, int priceCoinGold) {
        super(name, priceCoinGold);
    }

    public void showDetails(){
        System.out.println("******Consumable Item******");
    }
}
